package br.edu.unifeob.ads.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Modulo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idModulo;

	@NotEmpty
	private String nome;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Modulo")
	private List<Serie> series = new ArrayList<Serie>();

	@ManyToOne(cascade = CascadeType.ALL)
	private Curso curso;

	public Long getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Long idModulo) {
		this.idModulo = idModulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}
