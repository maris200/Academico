package br.edu.unifeob.ads.interceptors;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;

@Intercepts
public class TransacaoInterceptor{

	private EntityManager entityManager;
	
	public TransacaoInterceptor() {		
	}

	@Inject
	public TransacaoInterceptor(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@AroundCall
	public void trataTransacao(SimpleInterceptorStack stack){
		try{
			entityManager.getTransaction().begin();
			stack.next();
			entityManager.getTransaction().commit();
		}finally{
			if(entityManager.getTransaction().isActive()){
				entityManager.getTransaction().rollback();
			}
		}
		
	}
}
