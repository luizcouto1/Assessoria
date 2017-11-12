package com.htcursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htcursos.model.Cliente;

public interface ClienteRepository	extends JpaRepository<Cliente, Short>{

}
