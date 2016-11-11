package br.com.fpu.entity;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_jogo")
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_jogo")
	private Integer id;

	@Column(name = "hora_inicial", nullable = false)
	@Temporal(value = TemporalType.TIME)
	private Date horaInicial;

	@Column(name = "hora_final", nullable = false)
	@Temporal(value = TemporalType.TIME)
	private Date horaFinal;
	
	@Column
	private Integer pontuacao;

	@OneToMany(targetEntity = Pergunta.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Pergunta> listPergunta;

		
	public Jogo() {
	}

	public Jogo(Integer id, Date horaInicial, Date horaFinal, Integer pontuacao, List<Pergunta> listPergunta) {
		super();
		this.id = id;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.pontuacao = pontuacao;
		this.listPergunta = listPergunta;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public Date getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(Date horaInicial) {
		this.horaInicial = horaInicial;
	}


	public Date getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(Date horaFinal) {
		this.horaFinal = horaFinal;
	}


	public Integer getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}


	public List<Pergunta> getListPergunta() {
		return listPergunta;
	}
	public void setListPergunta(List<Pergunta> listPergunta) {
		this.listPergunta = listPergunta;
	}
}
