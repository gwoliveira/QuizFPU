package br.com.fpu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_gestor")
public class Gestor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 200, nullable = false)
	private String nome;
	
	@Column(name ="nome_usuario" ,length = 200, nullable = false)
	private String nomeUsuario;

	@Column(length = 8 ,nullable = false)
	private String senha;
	
	public Gestor() {
	}

	public Gestor(Integer id, String nome, String nomeUsuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
