package com.assessoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Usuario;

public interface LoginRepository extends JpaRepository<Usuario, Long>{

}
