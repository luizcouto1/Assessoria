package com.assessoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessoria.model.Contato;
import com.assessoria.repository.ContatoRepository;

@RestController
public class ContatoController {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@GetMapping(value = "/contatos")
	public List<Contato> buscarTodos(){
		return contatoRepository.findAll();
		
	}
	
	@PostMapping(value = "/contatos")
	public void cadastrarCliente(@RequestBody Contato contato) {
		contatoRepository.save(contato);
		
	}
	
	@PutMapping(value = "/contatos")
	public void editarCliente(@RequestBody Contato contato) {
		contatoRepository.save(contato);
	}
	
	@DeleteMapping(value = "/contatos")
	public void removerCliente(@RequestBody Contato contato) { 
		contatoRepository.delete(contato);
	}
}
