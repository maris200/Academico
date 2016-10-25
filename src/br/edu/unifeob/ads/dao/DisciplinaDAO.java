package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Dependent
public class DisciplinaDAO {
	
private EntityManager entityManager;
	
	@Inject
	public DisciplinaDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


}
