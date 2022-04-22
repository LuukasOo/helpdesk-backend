package com.lucas.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucas.helpdesk.service.DBService;

@Configuration
@Profile("dev")
public class DevConfig {

	
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;


	@Bean
	public boolean instaciaDB() {
		if(value.equals("create")) {
			this.dbService.instanciaDB();
		}
		return false;
	}
}
