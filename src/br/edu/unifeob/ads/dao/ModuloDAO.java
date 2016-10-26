package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.edu.unifeob.ads.models.Modulo;

@Dependent
public class ModuloDAO {
	
	@Inject
    private EntityManager manager;
	
	
	public void salvar(Modulo modulo) {
        manager.persist(modulo);
    }
	
}
