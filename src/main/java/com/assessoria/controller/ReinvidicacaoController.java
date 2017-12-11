package com.assessoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessoria.model.Reinvidicacao;
import com.assessoria.repository.ReinvidicacaoRepository;

@RestController
public class ReinvidicacaoController {
	
	@Autowired
	private ReinvidicacaoRepository reinvidicacaoRepository;
	
	@GetMapping(value = "/reinvidicacoes")
	public List<Reinvidicacao> buscarTodos(){
		return reinvidicacaoRepository.findAll();
		
	}
	
	@PostMapping(value = "/reinvidicacoes")
	public void cadastrarReinvidicacao(@RequestBody Reinvidicacao reinvidicacao) {
		reinvidicacaoRepository.save(reinvidicacao);
		
	}
	
	@PutMapping(value = "/reinvidicacoes")
	public void editarReinvidicacao(@RequestBody Reinvidicacao reinvidicacao) {
		reinvidicacaoRepository.save(reinvidicacao);
	}
	
	@DeleteMapping(value = "/reinvidicacoes")
	public void removerReinvidicacao(@RequestBody Reinvidicacao reinvidicacao) { 
		reinvidicacaoRepository.delete(reinvidicacao);
	}

}
