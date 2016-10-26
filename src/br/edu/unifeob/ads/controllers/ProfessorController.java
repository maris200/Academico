package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;
import br.edu.unifeob.ads.dao.ProfessorDAO;
import br.edu.unifeob.ads.models.Professor;

public class ProfessorController {
	
	@Inject
	private ProfessorDAO professorDao;
	
	public void salvar(Professor professor) {
		professorDao.salvar(professor);
    }

}
