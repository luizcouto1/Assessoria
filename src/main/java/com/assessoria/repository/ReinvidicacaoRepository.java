package com.assessoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessoria.model.Reinvidicacao;

@Repository
public interface ReinvidicacaoRepository extends JpaRepository<Reinvidicacao ,Long> {

}
