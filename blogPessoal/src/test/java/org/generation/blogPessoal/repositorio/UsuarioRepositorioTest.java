package org.generation.blogPessoal.repositorio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UsuarioRepositorioTest {

	@Autowired
	private UsuarioRepository repositorio;
	
	@BeforeAll
	void start() {
		Usuario usuario = new Usuario("antonio@teste.com", "134652");
		if(repositorio.findByEmail(usuario.getEmail())!=null)
			repositorio.save(usuario);
		
		usuario = new Usuario("email@teste.com", "134652");
		if(repositorio.findByEmail(usuario.getEmail())!=null)
			repositorio.save(usuario);
		
		usuario = new Usuario("teste@email.com", "134652");
		if(repositorio.findByEmail(usuario.getEmail())!=null)
			repositorio.save(usuario);
	}
	
	@Test
	public void findByUsuarioRetornaUsuario() throws Exception {

		Usuario usuario = repositorio.findByEmail("antonio@teste.com").get();
		assertTrue(usuario.getEmail().equals("antonio@teste.com"));
	}
	
	@Test
	public void findAllByUsuarioContainingIgnoreCaseRetornaTresContato() {

		List<Usuario> listaDeUsuarios = repositorio.findAllByEmailContainingIgnoreCase("Boaz");
		assertEquals(3, listaDeUsuarios.size());
	}
	
	@AfterAll
	public void end() {
		repositorio.deleteAll();
	}

}