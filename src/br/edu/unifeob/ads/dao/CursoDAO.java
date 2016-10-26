package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.edu.unifeob.ads.models.Curso;


@Dependent
public class CursoDAO {
	
	@Inject
    private EntityManager manager;
	
	
	public void salvar(Curso curso) {
        manager.persist(curso);
    }
	

}
