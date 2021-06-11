package org.generation.blogPessoal.controller;

import org.generation.blogPessoal.repository.PostagemRepository; //importando a interface
import org.generation.blogPessoal.services.PostagemServices;
import org.generation.blogPessoal.model.Postagem; //importando a model
import org.generation.blogPessoal.model.Tema;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que a classe é um controlador, um controller - se comunica com o
				// cliente
@RequestMapping("/postagens") // indica por on de a classe vai ser acessada
@CrossOrigin("*") // indica que a api aceita requisições de qualquer origem
public class PostagemController {

	// injetando a classe de repositório dentro do controller
	// garante que todos os serviços da interface PostagemRepository seja acessado a partir do controller
	private @Autowired PostagemRepository repository;
	
	private @Autowired PostagemServices service;

	// metodo GetAll, recebe uma lista do tipo Postagem
	@GetMapping("/todos") //Sempre que houver uma requisição externa com o método GET através da url "/postagens" o metodo GetAll será executado
	//ResponseEntity retorna um status
	public ResponseEntity<List<Postagem>> GetAll(){
		//return ResponseEntity.ok(repository.findAll()); //retornar ok, com a requisição de todas as postagens
		//return ResponseEntity.status(202).body(repository.findAll()); // retorna um status 202
		List<Postagem> listaDePostagem = repository.findAll();
		
		//verifica se a lista está vazia ou não
		if(!listaDePostagem.isEmpty()) {
			//caso não seja vazia retorna um status 200 ok com a lista
			return ResponseEntity.status(HttpStatus.OK).body(listaDePostagem);
		}else{
			//caso a lista esteja vazia retorna um no content 204 vazio
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("id/{id}") // metodo para retornar valores através do id, o método recebe um parâmetro long
							// id
	// notação PathVariable para conseguir usar como parâmetro um valor vindo da url
	public ResponseEntity<Postagem> GetById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		// assim que for feita uma reposição do tipo get em "/postagens/" e for passado
		// um valor no caso o "id"
		// esse método será executado que capturará a variável que está sendo passada e
		// vai retornar
		// a interface que foi injetada e executará o método findById que pode retornar
		// um método do tipo postagem com ok
		// quanto um notFound caso o objeto não exista ou tenha algum erro na requisição
	}

	@GetMapping("/titulo/{titulo}") // metodo para retornar valores através do titulo
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
		// metodo que sera executado quando acessarem a url "/titulo/" passando algum
		// parâmetro
		// dentro do metodo é executado o metodo que fizemos dentro da interface
		// repositorio findAllByTituloContainingIgnoreCase
	}
	
	//cadastro
	@PostMapping("/salvar/{idUsuario}")
	//request body pega algo do corpo do frontEnd que sera requisitado em um formato .json
	public ResponseEntity<Postagem>  salvarPostagem(@PathVariable (value = "idUsuario") Long idUsuario,@RequestBody Postagem novaPostagem) {
		
		//Utiliza do método criado no PostagemService passando o conteúdo passado no body da requisição como parametro
		return service.cadastrarPostagem(idUsuario, novaPostagem)
				//se for retornado um optional não vazio o map será executado e retornará um status 201 com a postagem criada
				.map(postagemCriada -> ResponseEntity.status(201).body(postagemCriada)) 
				//caso sejá retornado um optional vazio será exibido o status 400
				.orElse(ResponseEntity.status(400).build());
		
	}
	
	//é passado o id pelo url que é pego pelo pathvariable, e é passado um objeto com os dados para serem atualizados que são
	//passados pelo request body
	//atualizar 
	@PutMapping("/atualizar/{id}")
	public ResponseEntity<Postagem>  atualizaPostagem(@PathVariable (value= "id") Long id, @Valid @RequestBody Postagem postagem) {
		//é chamado o método atualizar postagem com os dados recebidos como parametro
		return service.atualizarPostagem(id, postagem)
				//caso seja retornado um optional não vazio será exibido o status 201 com a postagem atualizada
				.map(postagemAtualizada -> ResponseEntity.status(201).body(postagemAtualizada))
				//se for retornado um optional vazio será retornado o status 304
				.orElse(ResponseEntity.status(304).build());
		
	}
	
	
	@DeleteMapping("/deletar/{id}")
	public String deletaPostagem(@PathVariable long id) {
		Optional<Postagem> postagemExistente = repository.findById(id);
		
		if(postagemExistente.isPresent()) {
			repository.deleteById(id);
			return "Deletado";
		}
		else {
			return "Não existe uma postagem com esse id";
		}

	}
}
