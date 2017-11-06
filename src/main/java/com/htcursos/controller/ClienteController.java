package com.htcursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htcursos.model.Cliente;
import com.htcursos.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping(value = "/cliente")
	public List<Cliente> buscarTodos(){
		return clienteRepository.findAll();
		
	}
	
	@PostMapping(value = "/cliente")
	public void cadastrarCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		
	}
	
	@PutMapping(value = "/cliente")
	public void editarCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	@DeleteMapping(value = "/cliente")
	public void removerCliente(@RequestBody Cliente cliente) { 
		clienteRepository.delete(cliente);
	}

}
