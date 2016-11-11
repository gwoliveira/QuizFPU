package br.com.fpu.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_pergunta")
public class Pergunta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_pergunta")
	private Integer id;
	
	@Column(nullable = false)
	private String descricao;
	
	//Caminho da imagem
	private String path;
	
	@OneToMany(targetEntity = Resposta.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Resposta> respostas;
	
	public Pergunta() {
	}

	public Pergunta(Integer id, String descricao, String path, List<Resposta> respostas) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.path = path;
		this.respostas = respostas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}
}