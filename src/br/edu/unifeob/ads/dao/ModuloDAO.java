package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Dependent
public class ModuloDAO {
	
private EntityManager entityManager;
	
	@Inject
	public ModuloDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
