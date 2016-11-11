package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Pergunta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_pergunta;
	private String descricao_pergunta;
	private String resposta_a;
	private String resposta_b;
	private String resposta_c;
	private String resposta_correta;
	
public Pergunta(){
	
}	

public Pergunta(Integer id_pergunta, String descricao_pergunta, String resposta_a, String resposta_b, String resposta_c, String resposta_correta){
	
	this.id_pergunta = id_pergunta;
	this.descricao_pergunta = descricao_pergunta;
	this.resposta_a = resposta_a;
	this.resposta_b = resposta_b;
	this.resposta_c = resposta_c;
	this.resposta_correta = resposta_correta;
	
}
	
}
