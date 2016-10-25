package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;


@Dependent
public class TurmaDAO {
	
	private EntityManager entityManager;
	
	@Inject
	public TurmaDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
