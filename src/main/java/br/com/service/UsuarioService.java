package br.com.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.model.Usuario;
import br.com.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void insert(Usuario user) {
		user.setDataCriacao(new Date());
		usuarioRepository.save(user);
	}
	
	public List<Usuario> list(){
		return usuarioRepository.findAll();
	}
	
	public void  delete(String id) {
		usuarioRepository.deleteById(id);
	}
}
