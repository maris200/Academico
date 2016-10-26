package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.edu.unifeob.ads.models.Modulo;

@Dependent
public class ModuloDAO {
	
private EntityManager entityManager;
	
	@Inject
	public ModuloDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void salvar(Modulo modulo ){
		entityManager.persist(modulo);
	}

}
