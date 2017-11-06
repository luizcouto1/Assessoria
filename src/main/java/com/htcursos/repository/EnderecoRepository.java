package com.htcursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htcursos.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco ,Long>{

}
