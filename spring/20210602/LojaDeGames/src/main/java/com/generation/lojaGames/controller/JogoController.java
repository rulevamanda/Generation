package com.generation.lojaGames.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojaGames.model.Jogo;
import com.generation.lojaGames.service.JogoService;

@RestController
@RequestMapping("/jogos")
public class JogoController {

	@Autowired
	JogoService service;

	@GetMapping("/exibir")
	public List<Jogo> findAll() {
		return service.findAll();
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Jogo> findById(@PathVariable Long id) {
		Optional<Jogo> opt = service.findById(id);

		if (opt.isPresent())
			return ResponseEntity.status(HttpStatus.OK).body(opt.get());
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Jogo>> findByNome(@PathVariable String nome) {
		return ResponseEntity.status(HttpStatus.OK).body(service.findByNome(nome));
	}

	@PostMapping("/save")
	public ResponseEntity<Jogo> save(@RequestBody Jogo jogo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(jogo));
	}

	@PutMapping("/update")
	public ResponseEntity<Jogo> update(@RequestBody Jogo jogo) {
		Jogo b = service.update(jogo);
		if (b == null)
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

		return ResponseEntity.status(HttpStatus.OK).body(b);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
	}

}

