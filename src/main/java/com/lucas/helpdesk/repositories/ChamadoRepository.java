package com.lucas.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.helpdesk.domain.Chamado;

public interface  ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
