package org.generation.blogPessoal.services;

import java.util.Optional;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // define que é um service
public class PostagemServices {

	// dependência com o repositorio
	private @Autowired PostagemRepository repository;

	private @Autowired UsuarioRepository repositoryU;

	/**
	 * Método utilizado para verificar se já existe uma postagem com o título que está sendo cadastrado
	 * @param novaPostagem - Objeto Postagem passado pelo controller
	 * @return Optional com uma entidade Postagem caso o título não tenha sido utilizado ou um Optional vazio caso o título já tenha sido utilizado
	 */
	public Optional<Postagem> cadastrarPostagem(Long idUsuario, Postagem novaPostagem){
		Optional<Usuario> usuarioExistente = repositoryU.findById(idUsuario);
		
		if(usuarioExistente.isPresent()) {
		Optional<Postagem> postagemExistente = repository.findByTitulo(novaPostagem.getTitulo());
		
		if(postagemExistente.isPresent()) {
			return Optional.empty();
			//se existir uma postagem com o mesmo titulo será retornado um optional vazio para o controller
		}
		else {
			novaPostagem.setUsuarioPostagem(usuarioExistente.get());
			return Optional.ofNullable(repository.save(novaPostagem));
			//se não existir uma postagem com o mesmo título será retornado um optional criado a partir do objeto passado
		}
		}
		return Optional.empty();
	}

	/**
	 * O método para atualizar uma postagem
	 * 
	 * @param id                 - Id da postagem passada pelo controller
	 * @param atualizadaPostagem - campos do objeto postagem passados pelo
	 *                           controller
	 * @return O método irá buscar se existe uma postagem com o ID passado, caso
	 *         exista será atualizado os campos Texto e titulo da postagem, se não
	 *         existir será retornado um optional vazio para o controller
	 */
	public Optional<Postagem> atualizarPostagem(Long id, Postagem atualizadaPostagem) {
		Optional<Postagem> postagemExistente = repository.findById(id);

		if (postagemExistente.isPresent()) {
			postagemExistente.get().setTexto(atualizadaPostagem.getTexto());
			postagemExistente.get().setTitulo(atualizadaPostagem.getTitulo());
			postagemExistente.get().setTema(atualizadaPostagem.getTema());

			return Optional.ofNullable(repository.save(postagemExistente.get()));
		} else {
			return Optional.empty();
		}
	}
}
