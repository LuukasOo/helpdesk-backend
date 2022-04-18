package com.lucas.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.helpdesk.domain.Pessoa;

public interface  PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
