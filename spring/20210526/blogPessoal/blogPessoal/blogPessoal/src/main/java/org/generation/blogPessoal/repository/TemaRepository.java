package org.generation.blogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.Tema; // importando o model tema
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	
	public Optional<Tema> findByDescricao(String descricao);

}
