package br.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
