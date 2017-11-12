package com.htcursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htcursos.model.Usuario;

public interface LoginRepository extends JpaRepository<Usuario, Long>{

}
