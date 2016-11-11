package br.com.fpu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_jogador")
public class Jogador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_jogador")
	private Integer id;
	
	@Column(length = 200, nullable = false)
	private String nome;
	
	@OneToOne
	@JoinColumn(name = "id_jogo")
	private Jogo jogo;
	
	public Jogador() {
	}	
	
	public Jogador(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Integer getIdJogador() {
		return id;
	}
	public void setIdJogador(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
