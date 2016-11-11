package br.com.fpu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pergunta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPergunta;
	private String descricaoPergunta;
	private String respostaA;
	private String respostaB;
	private String respostaC;
	private String respostaCorreta;	
	
	
	public Pergunta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pergunta(Integer idPergunta, String descricaoPergunta, String respostaA, String respostaB, String respostaC,
			String respostaCorreta) {
		super();
		this.idPergunta = idPergunta;
		this.descricaoPergunta = descricaoPergunta;
		this.respostaA = respostaA;
		this.respostaB = respostaB;
		this.respostaC = respostaC;
		this.respostaCorreta = respostaCorreta;
	}
	public Integer getIdPergunta() {
		return idPergunta;
	}
	public void setIdPergunta(Integer idPergunta) {
		this.idPergunta = idPergunta;
	}
	public String getDescricaoPergunta() {
		return descricaoPergunta;
	}
	public void setDescricaoPergunta(String descricaoPergunta) {
		this.descricaoPergunta = descricaoPergunta;
	}
	public String getRespostaA() {
		return respostaA;
	}
	public void setRespostaA(String respostaA) {
		this.respostaA = respostaA;
	}
	public String getRespostaB() {
		return respostaB;
	}
	public void setRespostaB(String respostaB) {
		this.respostaB = respostaB;
	}
	public String getRespostaC() {
		return respostaC;
	}
	public void setRespostaC(String respostaC) {
		this.respostaC = respostaC;
	}
	public String getRespostaCorreta() {
		return respostaCorreta;
	}
	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}
	
	
	
	
}
