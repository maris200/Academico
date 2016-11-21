package br.edu.unifeob.ads.dao;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.unifeob.ads.models.Aluno;


@Dependent
public class AlunoDAO {
	
	@Inject
    private EntityManager manager;	
	
	public void salvar(Aluno aluno) {
        manager.persist(aluno);
    }
	
	public Aluno encontrarPorId(Long id){
		return manager.find(Aluno.class, id);
	}
	
	public Aluno encontrarPorRaESenha(Long ra, String senha){
		Query query = manager.createQuery("from Aluno where ra = :ra and senha = :senha", Aluno.class);		
		query.setParameter("ra", ra);
		query.setParameter("senha", senha);
		return (Aluno) query.getSingleResult();
	}
	
	public Aluno encontrarPorToken(String token){
		Query query = manager.createNamedQuery("from Aluno where token = :token", Aluno.class);
		query.setParameter("token", token);
		return (Aluno) query.getSingleResult();		
	}
	
	

}
