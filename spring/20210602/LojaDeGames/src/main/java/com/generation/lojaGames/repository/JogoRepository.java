package com.generation.lojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojaGames.model.Jogo;


@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long>{
	List<Jogo> findByNomeContainingIgnoreCase(String nome);
	
}
