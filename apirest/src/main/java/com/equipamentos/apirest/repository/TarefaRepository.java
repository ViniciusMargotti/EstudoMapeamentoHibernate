package com.equipamentos.apirest.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import com.equipamentos.apirest.models.Tarefa;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
	Tarefa findById(long id);

	@Override
	<S extends Tarefa> List<S> findAll(Example<S> example);
}