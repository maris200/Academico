package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;
import br.edu.unifeob.ads.dao.TurmaDAO;
import br.edu.unifeob.ads.models.Turma;

public class TurmaController {
	
	@Inject
	private TurmaDAO turmaDao;
	
	public void salvar(Turma turma) {
		turmaDao.salvar(turma);
    }
}
