package com.htcursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htcursos.model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Short>{

}
