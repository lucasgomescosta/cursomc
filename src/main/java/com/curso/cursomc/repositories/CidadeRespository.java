package com.curso.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.cursomc.domain.Cidade;

@Repository
public interface CidadeRespository extends JpaRepository<Cidade, Integer> {
	
}
