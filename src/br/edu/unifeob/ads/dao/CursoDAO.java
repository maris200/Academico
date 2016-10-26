package br.edu.unifeob.ads.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.edu.unifeob.ads.models.Curso;

@Dependent
public class CursoDAO {
	
private EntityManager entityManager;
	
	@Inject
	public CursoDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void salvar(Curso curso){
		entityManager.persist(curso);
	}
	

}
