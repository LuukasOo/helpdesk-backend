package com.lucas.helpdesk.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.helpdesk.domain.Cliente;

public interface  ClienteRepository extends JpaRepository<Cliente, Integer> {


}
