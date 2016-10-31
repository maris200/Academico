package br.edu.unifeob.ads.models;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ra;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String senha;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "alunos")
	private List<Turma> turmas = new ArrayList<Turma>();
	
	
	public Aluno() {		
	}

	public Aluno(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}

	public Long getRa() {
		return ra;
	}

	public void setRa(Long ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	
	
}
