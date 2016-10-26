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
public class Serie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSerie;
	
	@NotEmpty
	private String nome;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Serie")
	private List<Turma> turmas = new ArrayList<Turma>();

	@ManyToOne(cascade = CascadeType.ALL)
	private Modulo modulo;

	public Long getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(Long idSerie) {
		this.idSerie = idSerie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	
}
