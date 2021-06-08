package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;

	@NotNull(message = "Precisa ter um nome!")
	@Size(min = 1, max = 50, message = "O nome não pode ser nulo")
	private String nome;

	@NotNull
	@Size(min = 1, max = 50, message = "Email precisar ter entre 12 e 25 caracteres!")
	private String email;

	@NotNull(message = "A senha não pode ser nula, please!")
	@Size(min = 4, max = 255)
	private String senha;

	@OneToMany(mappedBy = "usuarioPostagem", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "tema", "id", "usuarioPostagem" })
	private List<Postagem> postagens;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}

}