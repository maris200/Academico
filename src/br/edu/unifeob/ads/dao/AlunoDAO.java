package br.edu.unifeob.ads.dao;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.edu.unifeob.ads.models.Aluno;

@Dependent
public class AlunoDAO {
	
	private EntityManager entityManager;
	
	@Inject
	public AlunoDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void salvar(Aluno aluno){
		entityManager.persist(aluno);
	}
	
	

}
