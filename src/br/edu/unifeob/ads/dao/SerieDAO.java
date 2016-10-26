package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.edu.unifeob.ads.models.Serie;

@Dependent
public class SerieDAO {
	
	private EntityManager entityManager;
	
	@Inject
	public SerieDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void salvar(Serie serie ){
		entityManager.persist(serie);
	}

}