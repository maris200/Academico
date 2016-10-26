package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;
import br.edu.unifeob.ads.dao.CursoDAO;
import br.edu.unifeob.ads.models.Curso;

public class CursoController {
	
	@Inject
	private CursoDAO CursoDao;
	
	public void salvar(Curso curso) {
		CursoDao.salvar(curso);
    }

}
