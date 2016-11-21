package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;
import javax.persistence.NoResultException;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.edu.unifeob.ads.annotations.SemSeguranca;
import br.edu.unifeob.ads.dao.AlunoDAO;
import br.edu.unifeob.ads.models.Aluno;

@Controller
public class AccessTokenController {

	@Inject
	private Result result;
	
	@Inject
	private AlunoDAO alunoDAO;	
	
	@Path("/access_token")
	@SemSeguranca
	public void recuperarTocken(Long ra, String senha){
		try {
			Aluno aluno = alunoDAO.encontrarPorRaESenha(ra, senha);
			result.use(Results.json()).withoutRoot().from(aluno).exclude("senha").serialize();
		} catch (NoResultException e) {
			result.use(Results.status()).badRequest("Unauthorized");
		}
		
	}
	
}
