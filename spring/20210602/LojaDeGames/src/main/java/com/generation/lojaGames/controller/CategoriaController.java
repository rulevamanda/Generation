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

import com.generation.lojaGames.model.Categoria;
import com.generation.lojaGames.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	CategoriaService service;

	@GetMapping("/exibir")
	public List<Categoria> findAll() {
		return service.findAll();
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Optional<Categoria> opt = service.findById(id);

		if (opt.isPresent())
			return ResponseEntity.status(HttpStatus.OK).body(opt.get());
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Categoria>> findByNome(@PathVariable String nome) {
		return ResponseEntity.status(HttpStatus.OK).body(service.findByNome(nome));

	}

	@PostMapping("/save")
	public ResponseEntity<Categoria> save(@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(categoria));
	}

	@PutMapping("/update")
	public ResponseEntity<Categoria> update(@RequestBody Categoria categoria) {
		Categoria a = service.update(categoria);
		if (a == null)
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

		return ResponseEntity.status(HttpStatus.OK).body(a);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
	}

}
