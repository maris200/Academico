package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;
import br.edu.unifeob.ads.dao.DisciplinaDAO;
import br.edu.unifeob.ads.models.Disciplina;

public class DisciplinaController {

	@Inject
	private DisciplinaDAO disciplinaDap;
	
	public void salvar(Disciplina disciplina) {
		disciplinaDap.salvar(disciplina);
    }
}
