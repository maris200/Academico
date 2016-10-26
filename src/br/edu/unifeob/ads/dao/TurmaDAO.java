package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.edu.unifeob.ads.models.Turma;


@Dependent
public class TurmaDAO {
	
	private EntityManager entityManager;
	
	@Inject
	public TurmaDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void salvar(Turma turma ){
		entityManager.persist(turma);
	}

}
