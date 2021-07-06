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
	
	private String foto;
	
	private String tipo;
	
	@OneToMany (mappedBy = "userPosts", cascade = CascadeType.ALL)
	@JsonIgnoreProperties ({"myPosts"})
	private List <Postagem> myPosts;
	
	/*@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE) 
	@JsonIgnoreProperties({"usuario"})
	private List<Postagem> postagem;

	@OneToMany(mappedBy = "usuarioPostagem", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "tema", "id", "usuarioPostagem" })
	private List<Postagem> postagens;
*/
	public Usuario(@NotNull String email, @NotNull String senha) {
		this.email = email;
		this.senha = senha;
	}

	public Usuario() {
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Postagem> getMyPosts() {
		return myPosts;
	}

	public void setMyPosts(List<Postagem> myPosts) {
		this.myPosts = myPosts;
	}
	
	

	
	

}