package com.equipamentos.apirest.resources;

import com.equipamentos.apirest.repository.TarefaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Cidades")
public class TarefaResource {
	
	@Autowired
	TarefaRepository tarefaRepository;

	@ApiOperation(value="Salva uma tarefa")
	@PostMapping("/tarefa")
	public com.equipamentos.apirest.models.Tarefa salvatarefa(@RequestBody @Valid com.equipamentos.apirest.models.Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}

	@ApiOperation(value="Salva uma tarefa")
	@GetMapping("/tarefa")
	public List<com.equipamentos.apirest.models.Tarefa> getTarefa() {
		return tarefaRepository.findAll();
	}

	private class Tarefa {
	}
}