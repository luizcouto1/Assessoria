package com.htcursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htcursos.model.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda ,Long>{

}
