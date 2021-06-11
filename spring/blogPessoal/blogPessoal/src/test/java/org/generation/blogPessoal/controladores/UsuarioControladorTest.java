package org.generation.blogPessoal.controladores;

import static org.junit.jupiter.api.Assertions.*;

import org.generation.blogPessoal.model.Usuario;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UsuarioControladorTest {
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	private Usuario usuario;
	private Usuario usuarioAlterar;
	
	@BeforeAll
	public void start() {
		usuario = new Usuario("antonio@teste.com","134652");
		usuarioAlterar = new Usuario("teste@antonio.com", "654321");
	}

	@Disabled
	@Test
	void deveSalvarUsuarioRetornaStatus201() {
		
		/*
		 * Criando um objeto do tipo HttpEntity para enviar como terceiro
		 * parâmentro do método exchange. (Enviando um objeto usuario via body)
		 * 
		 * */
		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuario);
		
		ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
	}
	
	@Disabled
	@Test
	void deveRetornarListadeUsuarioRetornaStatus200() {
		ResponseEntity<String> resposta = testRestTemplate.withBasicAuth("teste@antonio.com", "654321")
				.exchange("/usuarios/todes", HttpMethod.GET, null, String.class);
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	
	@Test
	void deveAtualizarSenhaUsuarioRetornaStatus201() {
		
		/*
		 * Criando um objeto do tipo HttpEntity para enviar como terceiro
		 * parâmentro do método exchange. (Enviando um objeto usuario via body)
		 * 
		 * */
		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioAlterar);
		
		ResponseEntity<Usuario> resposta = testRestTemplate.withBasicAuth("teste@antonio.com", "654321")
				.exchange("/usuarios/atualizar", HttpMethod.PUT, request, Usuario.class);
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
	}
	
	

}