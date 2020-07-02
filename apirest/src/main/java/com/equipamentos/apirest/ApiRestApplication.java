package com.equipamentos.apirest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.equipamentos.apirest.models.Tarefa;
import com.equipamentos.apirest.resources.TarefaResource;

@SpringBootApplication
public class ApiRestApplication {
	
	 @Autowired
	 TarefaResource cidadeResource;

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}
}
