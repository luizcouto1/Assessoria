package com.assessoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessoria.model.Candidato;
import com.assessoria.repository.CandidatoRepository;

@RestController
public class CandidatoController {
	
	@Autowired
	private CandidatoRepository candidatoRepository;
	
	@GetMapping(value = "/candidatos")
	public List<Candidato> buscarTodos(){
		return candidatoRepository.findAll();
		
	}
	
	@PostMapping(value = "/candidatos")
	public void cadastrarCandidato(@RequestBody Candidato candidato) {
		candidatoRepository.save(candidato);
		
	}
	
	@PutMapping(value = "/candidatos")
	public void editarCandidato(@RequestBody Candidato candidato) {
		candidatoRepository.save(candidato);
	}
	
	@DeleteMapping(value = "/candidatos")
	public void removerCandidato(@RequestBody Candidato candidato) { 
		candidatoRepository.delete(candidato);
	}

}
