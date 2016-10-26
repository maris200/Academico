package br.edu.unifeob.ads.dao;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.edu.unifeob.ads.models.Aluno;


@Dependent
public class AlunoDAO {
	
	@Inject
    private EntityManager manager;
	
	
	public void salvar(Aluno aluno) {
        manager.persist(aluno);
    }
	
	

}
