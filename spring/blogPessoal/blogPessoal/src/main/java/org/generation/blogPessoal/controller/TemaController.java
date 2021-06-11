package org.generation.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.blogPessoal.model.Tema; //importando o model tema
import org.generation.blogPessoal.repository.TemaRepository; //importando o repositorio TemaRepository
import org.generation.blogPessoal.services.TemaServices;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*") // conseguimos ver esse controller independente da origem
@RequestMapping("/temas")
public class TemaController {

	@Autowired
	private TemaRepository repository; //injetando dependência
	@Autowired
	private TemaServices service;
	
	@GetMapping("/todos") //buscar todos
	public ResponseEntity<List<Tema>> getAll() {

		return ResponseEntity.ok(repository.findAll());

	}
	
	@GetMapping("/id/{id}") //buscar pelo id
	public ResponseEntity<Tema> getById(@PathVariable long id) {

		return repository.findById(id)
				.map(resp -> ResponseEntity.status(200).body(resp))
				.orElse(ResponseEntity.notFound().build());

	}
	
	@GetMapping("/nome/{nome}") //buscar pelo nome
	public ResponseEntity<List<Tema>> getByName(@PathVariable String nome) {

		return ResponseEntity.status(200).body(repository.findAllByDescricaoContainingIgnoreCase(nome));

	}
	
	
	@PostMapping("/cadastrar")//cadastrar tema
	public ResponseEntity<Tema> post(@RequestBody Tema tema){
		return service.cadastrarTema(tema)
				.map(cadastro -> ResponseEntity.status(200).body(cadastro))
				.orElse(ResponseEntity.status(400).build());
	} 
	
	@PutMapping("/atualizar/{id}")//atualizar tema
	public ResponseEntity<Tema> put(@PathVariable (value = "id") Long id,@Valid @RequestBody Tema tema){
		return service.atualizarTema(id, tema)
				.map(temaAtualizado -> ResponseEntity.status(201).body(temaAtualizado))
				.orElse(ResponseEntity.status(304).build());
	} 
	
	@DeleteMapping("deletar/{id}") //deletar tema
	public String delete(@PathVariable long id) {
		
		Optional<Tema> temaExistente = repository.findById(id);
		
		if(temaExistente.isPresent()) {
			repository.deleteById(id);
			return "Deletado";
		}
		else {
			return "Não existe um tema com esse id";
		}
		
	}
}
