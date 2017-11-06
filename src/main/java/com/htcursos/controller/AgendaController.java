package com.htcursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htcursos.model.Agenda;
import com.htcursos.repository.AgendaRepository;

@RestController
public class AgendaController {
	
	@Autowired
	private AgendaRepository agendaRepository;
	
	@GetMapping(value = "/agendas")
	public List<Agenda> buscarTodos(){
		return agendaRepository.findAll();
		
	}
	
	@PostMapping(value = "/agendas")
	public void cadastrarAgenda(@RequestBody Agenda agenda) {
		agendaRepository.save(agenda);
		
	}
	
	@PutMapping(value = "/agendas")
	public void editarAgenda(@RequestBody Agenda agenda) {
		agendaRepository.save(agenda);
	}
	
	@DeleteMapping(value = "/agendas")
	public void removerAgenda(@RequestBody Agenda agenda) { 
		agendaRepository.delete(agenda);
	}

}
