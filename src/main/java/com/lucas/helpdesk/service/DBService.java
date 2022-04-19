package com.lucas.helpdesk.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.helpdesk.domain.Chamado;
import com.lucas.helpdesk.domain.Cliente;
import com.lucas.helpdesk.domain.Tecnico;
import com.lucas.helpdesk.domain.enums.Perfil;
import com.lucas.helpdesk.domain.enums.Prioridade;
import com.lucas.helpdesk.domain.enums.Status;
import com.lucas.helpdesk.repositories.ChamadoRepository;
import com.lucas.helpdesk.repositories.ClienteRepository;
import com.lucas.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
    private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "João Lucas", "554.759.340-02", "joao@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Harry Potter", "145.283.070-30", "harry@gmail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1); 
	
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}
