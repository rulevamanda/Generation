package org.generation.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.model.UsuarioLogin;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.generation.blogPessoal.services.UsuarioService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	private @Autowired UsuarioRepository repositoryU;
	
	private @Autowired UsuarioService serviceU;
	
	
	//logar
	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> Authentication(@RequestBody Optional<UsuarioLogin> user){
		return serviceU.logar(user)
				.map(resp -> ResponseEntity.status(200).body(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	// cadastrar
	@PostMapping("/cadastrar")
	public ResponseEntity<String> cadastrarUsuario(@Valid @RequestBody Usuario novoUsuario) {
		return serviceU.cadastrarUsuario(novoUsuario)
				.map(emailCadastrado -> ResponseEntity.status(201)
						.body("Nome: " + novoUsuario.getNome() + "\nEmail: " + novoUsuario.getEmail()
								+ "\nCADASTRADO"))
				.orElse(ResponseEntity.status(400)
						.body("Erro ao cadastrar. Nome de Usuário ou Email já está sendo utilizado."));
	}
	
	
	@GetMapping("/todes")
	public ResponseEntity<List<Usuario>> buscarTodes() {
		List<Usuario> listarTodes = repositoryU.findAll();
		return ResponseEntity.status(200).body(listarTodes);
	}

	@GetMapping("/nome/pesquisar")
	public ResponseEntity<Object> buscarPorNome(@RequestParam(defaultValue = "") String nome) {
		List<Usuario> listaDeNomes = repositoryU.findAllByNomeContainingIgnoreCase(nome);

		if (!listaDeNomes.isEmpty()) {
			return ResponseEntity.status(200).body(listaDeNomes);
		} else {
			return ResponseEntity.status(204).body("Ooops... Parece que esse usuário ainda não existe!");
		}
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {
		return repositoryU.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	

	@PutMapping("/atualizar/{id_usuario}")
	public ResponseEntity<String> atualizarUsuario(@Valid @RequestBody Usuario atualizacaoUsuario,
			@Valid @PathVariable(value = "id_usuario") Long id) {
		return serviceU.atualizarUsuario(id, atualizacaoUsuario)
				.map(atualizarUsuario -> ResponseEntity.status(201)
						.body("Nome: " + atualizacaoUsuario.getNome() + "\nEmail: "
								+ atualizacaoUsuario.getEmail() + "\nATUALIZADO"))
				.orElse(ResponseEntity.status(400).body(
						"Erro ao atualizar. Usuário não existe ou o nome de Usuário ou Email já está sendo utilizado."));
	}

	@DeleteMapping("/deletar/{id_usuario}")
	public ResponseEntity<String> deletarUsuario(@PathVariable Long id_usuario) {
		Optional<Usuario> usuarioExistente = repositoryU.findById(id_usuario);

		if (usuarioExistente.isPresent()) {
			repositoryU.deleteById(id_usuario);
			return ResponseEntity.status(200).body("Usuário deletado com sucesso");
		} else {
			return ResponseEntity.status(400).body("Erro ao deletar usuário. \nUsuário não existe");
		}
	}
}
