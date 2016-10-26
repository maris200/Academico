package br.edu.unifeob.ads.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDisciplina;

	private String nome;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "disciplina")
	private List<Turma> turmas = new ArrayList<Turma>();

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Professor> professores = new ArrayList<Professor>();

	public Long getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Long idDisciplina) {
		this.idDisciplina = idDisciplina;
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

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	
}
