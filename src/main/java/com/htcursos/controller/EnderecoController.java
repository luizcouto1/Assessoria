package com.htcursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htcursos.model.Endereco;
import com.htcursos.repository.EnderecoRepository;

@RestController
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@GetMapping(value = "/enderecos")
	public List<Endereco> buscarTodos(){
		return enderecoRepository.findAll();
		
	}
	
	@PostMapping(value = "/enderecos")
	public void cadastrarEndereco(@RequestBody Endereco endereco) {
		enderecoRepository.save(endereco);
		
	}
	
	@PutMapping(value = "/enderecos")
	public void editarEndereco(@RequestBody Endereco endereco) {
		enderecoRepository.save(endereco);
	}
	
	@DeleteMapping(value = "/enderecos")
	public void removerEndereco(@RequestBody Endereco endereco) { 
		enderecoRepository.delete(endereco);
	}

}
