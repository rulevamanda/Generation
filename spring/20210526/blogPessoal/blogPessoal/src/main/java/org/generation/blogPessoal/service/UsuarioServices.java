package org.generation.blogPessoal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.generation.blogPessoal.repository.TemaRepository;
import org.generation.blogPessoal.repository.UsuarioRepository;

@Service
public class UsuarioServices {

	@Autowired
	private UsuarioRepository repository;
	@Autowired
	private PostagemRepository repositoryP;
	@Autowired
	private TemaRepository repositoryT;

	/**
	 * Metodo utilizado para cadastrar um usuario no sistema, validando sua
	 * existencia.
	 * 
	 * @param novoUsuario
	 * @since 1.0
	 * @author Chelle
	 * @return Optional com entidade Usuario dentro ou Optional vazio.
	 */

	public Optional<Object> cadastrarUsuario(Usuario novoUsuario) {
		Optional<Object> usuarioExistente = repository.findByUsuarioIgnoreCase(novoUsuario.getUsuario());

		if (usuarioExistente.isPresent()) {
			return Optional.empty();
		} else {
			return Optional.ofNullable(repository.save(novoUsuario));
		}
	}

	/**
	 * Método utilizado para atualizar os campos de nome e senha do Usuario
	 * 
	 * @param id - Long
	 * @param atualizacaoUsuario - representando a Entidade Usuario
	 * @since 1.0
	 * @author Chelle
	 * @return Retorna um Optional com entidade Usuario caso o mesmo exista, do
	 *         contrário um Optional vazio
	 */

	public Optional<Usuario> atualizarUsuario(Long id, Usuario atualizacaoUsuario) {
		Optional<Usuario> usuarioExistente = repository.findById(id);

		if (usuarioExistente.isPresent()) {
			usuarioExistente.get().setNome(atualizacaoUsuario.getNome());
			usuarioExistente.get().setSenha(atualizacaoUsuario.getSenha());
			return Optional.ofNullable(repository.save(usuarioExistente.get()));
		} else {
			return Optional.empty();
		}
	}

	/**
	 * Método utilizado para atualizar Título e Texto de postagens existentes.
	 * @param  id - Long
	 * @param atualizacaoPost - representando Entidade Postagem
	 * @since 1.0
	 * @author Chelle
	 * @return Retorna um Optional com entidade Postagem caso exista,
	 * se não existir retorna um Optional vazio.
	 */
	public Optional <Postagem> atualizarPost (Long id, Postagem atualizacaoPost){
		Optional <Postagem> postExistente = repositoryP.findById(id);
		
		if (postExistente.isPresent()) {
			postExistente.get().setTitulo(atualizacaoPost.getTitulo());
			postExistente.get().setTexto(atualizacaoPost.getTexto());
			return Optional.ofNullable(repositoryP.save(atualizacaoPost));
		} else {
			return Optional.empty();
		}
	}
	
	/**
	 * Método utilizado para atualizar um Tema existente no Banco de Dados.
	 * 
	 * @param id          - Long
	 * @param atualizacaoTema - respresentando a Entidade Tema.
	 * @since 1.0
	 * @author Chelle
	 * @return Retorna um Optional com a entidade Tema se ela existir, se não
	 *         existir retorna um Optional vazio.
	 */
	public Optional<Tema> atualizarTema(Long id, Tema atualizacaoTema) {
		Optional<Tema> temaExistente = repositoryT.findById(id);

		if (temaExistente.isPresent()) {
			temaExistente.get().setDescricao(atualizacaoTema.getDescricao());
			return Optional.ofNullable(repositoryT.save(atualizacaoTema));
		} else {
			return Optional.empty();
		}

	}
}