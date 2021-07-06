package org.generation.blogPessoal.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//model para postagem

@Entity //indica que a classe é uma entidade
@Table(name = "postagem") //indica que essa entidade vai virar uma tabela dentro do banco de dados ocm o nome de postagem
public class Postagem {
	
	@Id //define que esse atributo se trata de um id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //define como esse atributo id vai se comportar dentro do banco de dados, será uma primary key
	private long id;
	
	@NotNull //não aceitará valores vazios
	@Size(min = 5, max = 100) //define o tamanho minimo e maximo da quantidade de caracter para o atributo
	private String titulo;
	
	@NotNull //não aceitará valores vazios
	@Size(min = 10, max = 500) //define o tamanho minimo e maximo da quantidade de caracter para o atributo
	private String texto;
	
	
	@Temporal(TemporalType.TIMESTAMP) //indica que estamos trabalhando com tempo e o tipo de tempo
	//pega a data do sistema
	private Date date = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToMany
	@JoinTable(name = "relaçãoPT", joinColumns = @JoinColumn(name = "fk_post"), inverseJoinColumns = @JoinColumn(name = "fk_tag"))
	//@JsonIgnoreProperties({ "" })
	private Set<Tema> temasRelacionados = new HashSet();
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "usuarioPostagem")
	//@JsonIgnoreProperties({ "" })
	private Usuario userPosts;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<Tema> getTemasRelacionados() {
		return temasRelacionados;
	}

	public void setTemasRelacionados(Set<Tema> temasRelacionados) {
		this.temasRelacionados = temasRelacionados;
	}

	public Usuario getUserPosts() {
		return userPosts;
	}

	public void setUserPosts(Usuario userPosts) {
		this.userPosts = userPosts;
	}
	
	/*
	//definindo as relações entre os models
	@ManyToOne //define que a relação é de muitos para um, muitas postagens possuem um mesmo tema
	@JsonIgnoreProperties("postagem") //ignorará a propriedade lista - postagem do model tema
	@JoinColumn(name = "tema")
	private Tema tema; //Tema da postagem
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usuarioPostagem")
	@JsonIgnoreProperties({ "idUsuario","email", "senha", "postagens" })
	private Usuario usuarioPostagem;
	*/
	


}
