package com.assessoria.controller;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessoria.model.Usuario;
import com.assessoria.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping(value = "/usuarios")
	public List<Usuario> buscarTodos(){
		return usuarioRepository.findAll();
		
	}
	
	@PostMapping(value = "/usuarios")
	public void cadastrarUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
		
	}
	
	@PutMapping(value="/usuarios")
	public void editarUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	@DeleteMapping(value = "/usuarios")
	public void removerUsuario(@RequestBody Usuario usuario) { 
		usuarioRepository.delete(usuario);
	}
	
}
