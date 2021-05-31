package org.generation.blogPessoal.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.generation.blogPessoal.service.UsuarioServices;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	private @Autowired UsuarioRepository repository;
	private @Autowired UsuarioServices services;
	
	@GetMapping ("/todes")
	public ResponseEntity <List<Usuario>> GetAll (){
		List <Usuario> listaDeUsuarios = repository.findAll();
		if (listaDeUsuarios.isEmpty()) {
			return ResponseEntity.status(204).build();
			
		} else {
			return ResponseEntity.status(200).body(listaDeUsuarios);
		}
	}
	
	@PostMapping ("/novo")
	public ResponseEntity<Object> cadastrarUsuario (@Valid @RequestBody Usuario usuario){
		return services.cadastrarUsuario(usuario)
				.map(novoUsuario -> ResponseEntity.status(201).body(novoUsuario))
				.orElse(ResponseEntity.status(400).body("Ooops.. parece que esse usuário já existe!"));
	}
	
	@GetMapping("/id/{id_usuario}")
	public ResponseEntity<Usuario> buscarUsuarioPorId(@PathVariable(value = "id_usuario") Long id) {
		return repository.findById(id)
				.map(usuarioExistente -> ResponseEntity.status(200).body(usuarioExistente))
				.orElse(ResponseEntity.status(204).build()); 
	}
	
	@GetMapping ("/pesquisar")
	public ResponseEntity<Object> buscarUsuarioPorNome (@RequestParam (defaultValue = "") String nome) {
		List<Usuario> listaDeUsuarios = repository.findAllByNomeContainingIgnoreCase(nome);
		
		if (!listaDeUsuarios.isEmpty()){
			return ResponseEntity.status(200).body(listaDeUsuarios);
		} else {
			return ResponseEntity.status(204).body("Ooops... Parece que esse usuário não existe!");
		}
	}
	
	@PutMapping ("/atualizar/{id_usuario}")
	public ResponseEntity <Usuario> atualizarUsuario (@Valid @PathVariable  (value = "id_usuario") Long id,
			@Valid @RequestBody Usuario atualizacaoUsuario) {
		return services.atualizarUsuario(id, atualizacaoUsuario)
				.map(usuarioAtualizado -> ResponseEntity.status(201).body(usuarioAtualizado))
				.orElse(ResponseEntity.status(304).build());
	}
}