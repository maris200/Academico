package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Dependent
public class ProfessorDAO {
	
private EntityManager entityManager;
	
	@Inject
	public ProfessorDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
