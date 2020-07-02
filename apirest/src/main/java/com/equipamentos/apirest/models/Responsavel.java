package com.equipamentos.apirest.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="RESPONSAVEL")
public class Responsavel implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long responsavel_id;


	private String nome;


	public Responsavel() {

	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public long getResponsavel_id() {
		return responsavel_id;
	}

	public void setResponsavel_id(long responsavel_id) {
		this.responsavel_id = responsavel_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}