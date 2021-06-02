package com.generation.lojaGames.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.lojaGames.model.Categoria;
import com.generation.lojaGames.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repository;

	public Optional<Categoria> findById(Long id) {
		return repository.findById(id);
	}

	public List<Categoria> findByNome(String nome) {
		return repository.findByNomeContainingIgnoreCase(nome);
	}

	public Categoria save(Categoria categoria) {
		return repository.save(categoria);
	}

	public Categoria update(Categoria categoria) {
		if (categoria.getId() == null) {
			return null;
		}
		return repository.save(categoria);
	}

	public String delete(Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return "Categoria Deletada";
		} else {
			return "Categoria Não Existente";
		}

	}

	public List<Categoria> findAll() {
		return repository.findAll();
	}

}
