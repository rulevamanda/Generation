package org.generation.blogPessoal.services;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.model.UsuarioLogin;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
	
	private @Autowired UsuarioRepository repositoryU;

	// ----------------------- USUÁRIOS -----------------------

		/**
		 * Método para cadastrar um novo usuário onde verifica se o email informado já
		 * foi cadastrado ou não.
		 * 
		 * @param novoEmail - String representando a entidade Usuario
		 * @return Retorna um Optional vazio caso o email já esteja registrado no
		 *         database, senão retorna um Optional que salva o novo usuário.
		 * @author Chelle
		 * @author Amanda
		 * @since 1.0
		 */
		public Optional<Object> cadastrarUsuario(Usuario novoUsuario) {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			
			String senhaEncoder = encoder.encode(novoUsuario.getSenha());
			novoUsuario.setSenha(senhaEncoder);
			
			Optional<Usuario> emailExistente = repositoryU.findByEmail(novoUsuario.getEmail());

			if (emailExistente.isEmpty()) {
				
					return Optional.ofNullable(repositoryU.save(novoUsuario));
			
			} else {
				return Optional.empty();
			}
		}
		
		public Optional<UsuarioLogin> logar(Optional<UsuarioLogin> user){
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			Optional<Usuario> usuario = repositoryU.findByEmail(user.get().getEmail());
			
			if(usuario.isPresent()) {
				if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
					String auth = user.get().getEmail() + ":" + user.get().getSenha();
					byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
					
					String authHeader = "Basic " + new String(encodedAuth);
					
					user.get().setToken(authHeader);
					user.get().setNome(usuario.get().getNome());
					
					return user;
				}
			}
			return null;
		}

		/**
		 * Método para atualizar um usuário existente com base em verificação de Id.
		 * 
		 * @param id_usuario    - Long
		 * @param updateUsuario - String
		 * @since 1.0
		 * @author Chelle
		 * @author Amanda
		 * @author Antonio
		 * @return Retorna um Optional para salvar as novas alterações caso o usuário
		 *         seja encontrado, senão retorna um Optional vazio.
		 */
		public Optional<Usuario> atualizarUsuario(Long id_usuario, Usuario atualizacaoUsuario) {
			Boolean atualizar = false;
			Optional<Usuario> usuarioExistente = repositoryU.findById(id_usuario);

			if (usuarioExistente.isPresent()) {
				Optional<Usuario> emailExistente = repositoryU.findByEmail(atualizacaoUsuario.getEmail());

				if (emailExistente.isEmpty()) {

						atualizar = true;

				} else {
					if (atualizacaoUsuario.getEmail().equals(usuarioExistente.get().getEmail())) {

							atualizar = true;
					}
				}
				if (atualizar) {
					BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
					
					String senhaEncoder = encoder.encode(atualizacaoUsuario.getSenha());
					atualizacaoUsuario.setSenha(senhaEncoder);
					usuarioExistente.get().setNome(atualizacaoUsuario.getNome());
					usuarioExistente.get().setSenha(atualizacaoUsuario.getSenha());
					usuarioExistente.get().setEmail(atualizacaoUsuario.getEmail());

					return Optional.ofNullable(repositoryU.save(usuarioExistente.get()));
				} else {
					return Optional.empty();
				}

			}
			return Optional.empty();

		}
}
