package br.com.fpu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.sql.Time;
import javax.persistence.Id;

@Entity
public class Jogador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idJogador;
	private String nomeJogador;
	private Time horaInicial;
	private Time horaFinal;
	private Integer placar;
	
	
	
	public Jogador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jogador(Integer idJogador, String nomeJogador, Time horaInicial, Time horaFinal, Integer placar) {
		super();
		this.idJogador = idJogador;
		this.nomeJogador = nomeJogador;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.placar = placar;
	}
	public Integer getIdJogador() {
		return idJogador;
	}
	public void setIdJogador(Integer idJogador) {
		this.idJogador = idJogador;
	}
	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public Time getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(Time horaInicial) {
		this.horaInicial = horaInicial;
	}
	public Time getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(Time horaFinal) {
		this.horaFinal = horaFinal;
	}
	public Integer getPlacar() {
		return placar;
	}
	public void setPlacar(Integer placar) {
		this.placar = placar;
	}


	
	
}
