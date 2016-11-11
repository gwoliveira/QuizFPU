package br.com.fpu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_resposta")
public class Resposta {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_resposta")
	private Integer id;
	
	//Certa ou errada
	@Column(nullable = false)
	private String situacao;
	
	private String texto;

	public Resposta() {
	}

	public Resposta(Integer id, String situacao, String texto) {
		this.id = id;
		this.situacao = situacao;
		this.texto = texto;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
}
