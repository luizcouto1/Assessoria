package com.assessoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessoria.model.Usuario;

public interface LoginRepository extends JpaRepository<Usuario, Long>{

}
