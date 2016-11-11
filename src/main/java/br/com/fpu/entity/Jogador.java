package com.example.domain;

import javax.persistence.Entity;
import java.sql.Time;
import javax.persistence.Id;

@Entity
public class Jogador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_jogador;
	private String nome_jogador;
	private Time hora_inicial;
	private Time hora_final;
	private Integer placar;

public Jogador(){
	
}

public Jogador(Integer id_jogardor, String nome_jogador, Time hora_inicial, Time hora_final, Integer placar){
	
	this.id_jogador = id_jogador;
	this.nome_jogador = nome_jogador;
	this.hora_inicial = hora_inicial;
	this.hora_final = hora_final;
	this.placar = placar;
}
	
	
}
