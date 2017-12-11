package com.assessoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessoria.model.Funcionario;
import com.assessoria.repository.FuncionarioRepository;

@RestController
public class FuncionarioController{

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@GetMapping(value = "/funcionarios")
	public List<Funcionario> buscarTodos() {
		return funcionarioRepository.findAll();
	}
	
	@PostMapping(value = "/funcionarios")
	public void cadastrarFuncionario (@RequestBody Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}
	
	@PutMapping(value = "/funcionarios")
	public void editarFuncionario (@RequestBody Funcionario funcionario){
		funcionarioRepository.save(funcionario);
	}
	
	@DeleteMapping(value = "/funcionarios")
	public void deletarFuncionario(@RequestBody Funcionario funcionario){
		funcionarioRepository.delete(funcionario);
		
	}
}
