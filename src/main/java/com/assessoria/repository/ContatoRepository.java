package com.assessoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessoria.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato ,Long>{

}
