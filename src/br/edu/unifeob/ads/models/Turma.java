package br.edu.unifeob.ads.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTurma;

	@NotEmpty
	private String nome;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Aluno> alunos = new ArrayList<Aluno>();

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	@ManyToOne(cascade=CascadeType.ALL)
	private Serie serie;
	
	public Turma() {
	}

	public Turma(String nome, Serie serie) {
		this.nome = nome;
		this.serie = serie;
	}

	public Long getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Long idTurma) {
		this.idTurma = idTurma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	

}
