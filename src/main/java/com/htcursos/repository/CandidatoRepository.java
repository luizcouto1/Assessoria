package com.htcursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htcursos.model.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato ,Long> {

}
