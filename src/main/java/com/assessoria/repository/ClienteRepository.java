package com.assessoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessoria.model.Cliente;

public interface ClienteRepository	extends JpaRepository<Cliente, Short>{

}
