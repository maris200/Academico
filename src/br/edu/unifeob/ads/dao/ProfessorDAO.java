package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.edu.unifeob.ads.models.Professor;

@Dependent
public class ProfessorDAO {
	
	@Inject
    private EntityManager manager;
	
	
	public void salvar(Professor professor) {
        manager.persist(professor);
    }
	
}
