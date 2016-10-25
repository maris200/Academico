package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Dependent
public class AlunoDAO {
	
private EntityManager entityManager;
	
	@Inject
	public AlunoDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


}
