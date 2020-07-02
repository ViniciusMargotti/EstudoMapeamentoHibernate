package com.equipamentos.apirest.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="TAREFA")
public class Tarefa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long tarefa_id;
	
	@NotNull
	private String descricao;

	@ManyToMany(fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
	@JoinTable(
			name = "tarefa_responsavel",
			joinColumns = { @JoinColumn(name = "tarefa_id") },
			inverseJoinColumns = { @JoinColumn(name = "responsavel_id") }
	)
	private List<Responsavel> responsavels;


	public Tarefa(long tarefa_id, List<Responsavel> responsavels) {

		this.tarefa_id = tarefa_id;
		this.responsavels = responsavels;
	}

	public Tarefa(){

	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getTarefa_id() {
		return tarefa_id;
	}

	public void setTarefa_id(long tarefa_id) {
		this.tarefa_id = tarefa_id;
	}

	public List<Responsavel> getResponsavels() {
		return responsavels;
	}

	public void setResponsavels(List<Responsavel> responsavels) {
		this.responsavels = responsavels;
	}
}