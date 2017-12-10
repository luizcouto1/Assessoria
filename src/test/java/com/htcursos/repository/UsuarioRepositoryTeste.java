package com.htcursos.repository;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.Usuario;
import com.example.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional

public class UsuarioRepositoryTeste {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Test
	public void deveCadastrarUsuario(){
		
		Usuario usuario = new Usuario();
		usuario.setLogin("jao");
		usuario.setSenha("123");
		
		Usuario usuarioSalvo = usuarioRepository.save(usuario);
		Assert.assertNotNull(usuarioSalvo.getId());
		
	}

}
