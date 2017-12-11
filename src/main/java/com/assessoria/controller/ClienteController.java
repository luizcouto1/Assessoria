package com.assessoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessoria.model.Cliente;
import com.assessoria.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping(value = "/clientes")
	public List<Cliente> buscarTodos(){
		return clienteRepository.findAll();
	}
	
	@PostMapping(value = "/clientes")
	public void cadastrarCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
	}
	@PutMapping(value = "/clientes")
	public void editarCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
	}

}
