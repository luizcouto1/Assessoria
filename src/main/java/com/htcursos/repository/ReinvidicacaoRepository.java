package com.htcursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htcursos.model.Reinvidicacao;

@Repository
public interface ReinvidicacaoRepository extends JpaRepository<Reinvidicacao ,Long> {

}
