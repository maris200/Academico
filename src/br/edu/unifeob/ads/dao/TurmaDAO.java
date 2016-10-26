package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.edu.unifeob.ads.models.Turma;


@Dependent
public class TurmaDAO {
	
	@Inject
    private EntityManager manager;
	
	
	public void salvar(Turma turma) {
        manager.persist(turma);
    }

}
