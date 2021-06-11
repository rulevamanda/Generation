package org.generation.blogPessoal.model;

public class UsuarioLogin {

	private String nome;
	
	private String email;
	
	private String senha;
	
	private String token;

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public String getToken() {
		return token;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
