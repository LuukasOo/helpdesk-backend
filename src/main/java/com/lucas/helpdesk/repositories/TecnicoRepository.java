package com.lucas.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.helpdesk.domain.Tecnico;

public interface  TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
