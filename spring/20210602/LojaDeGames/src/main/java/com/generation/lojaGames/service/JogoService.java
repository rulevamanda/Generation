package com.generation.lojaGames.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.lojaGames.model.Jogo;
import com.generation.lojaGames.repository.JogoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JogoService {

	@Autowired
	private JogoRepository repository;

	public List<Jogo> findAll() {
		return repository.findAll();
	}

	public Optional<Jogo> findById(Long id) {
		return repository.findById(id);
	}

	public List<Jogo> findByNome(String nome) {
		return repository.findByNomeContainingIgnoreCase(nome);
	}

	public Jogo save(Jogo jogo) {
		return repository.save(jogo);
	}

	public Jogo update(Jogo jogo) {
		return repository.save(jogo);
	}

	public String delete(Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return "Categoria Deletada";
		} else {
			return "Categoria Não Existente";
		}

	}
}