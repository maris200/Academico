package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;
import br.com.caelum.vraptor.Controller;
import br.edu.unifeob.ads.dao.AlunoDAO;
import br.edu.unifeob.ads.models.Aluno;

@Controller
public class AlunoController {

	@Inject
	private AlunoDAO alunoDao;
	
	public void salvar(Aluno aluno) {
		alunoDao.salvar(aluno);
    }

}
