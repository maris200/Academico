package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.edu.unifeob.ads.dao.TurmaDAO;
import br.edu.unifeob.ads.models.Aluno;
import br.edu.unifeob.ads.models.Curso;
import br.edu.unifeob.ads.models.Disciplina;
import br.edu.unifeob.ads.models.Modulo;
import br.edu.unifeob.ads.models.Professor;
import br.edu.unifeob.ads.models.Serie;
import br.edu.unifeob.ads.models.Turma;

@Controller
public class GerarDadosController {
	
	@Inject
	TurmaDAO TurmaDAO;
	
	@Get
	@Path("/gerardados")
	public void gerar(){
		
		Curso ads = new Curso("Análise e Desenvolvimento de Sistemas");
		Modulo moduloQuatro = new Modulo("Módulo Quatro", ads);
		Serie serieQuatro = new Serie("4", moduloQuatro);
		Turma turmaA = new Turma("A", serieQuatro);
		
		Disciplina ltpIV = new Disciplina("Linguagem e Técnicas de Programação IV");
		Professor anderson = new Professor("Anderson Luis Ribeiro");
		Professor joao = new Professor("João Ricardo");
		Aluno caio = new Aluno("Caio", "xxx");
				
		turmaA.getDisciplinas().add(ltpIV);
		turmaA.getAlunos().add(caio);
		ltpIV.getProfessores().add(anderson);
		ltpIV.getProfessores().add(joao);
		
		TurmaDAO.salvar(turmaA);
		
	}

}
