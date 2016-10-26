package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.edu.unifeob.ads.models.Serie;

@Dependent
public class SerieDAO {
	
	@Inject
    private EntityManager manager;
	
	
	public void salvar(Serie serie) {
        manager.persist(serie);
    }

}