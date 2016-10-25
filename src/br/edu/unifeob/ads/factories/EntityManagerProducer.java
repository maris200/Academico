package br.edu.unifeob.ads.factories;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProducer {
	
	@ApplicationScoped
	@Produces
	public EntityManagerFactory createEntityMananagerFactory(){
		return Persistence.createEntityManagerFactory("vraptor");
	}

	@RequestScoped
	@Produces
	public EntityManager createEntityManager(EntityManagerFactory entityManagerFactory){
		return entityManagerFactory.createEntityManager();
	}
	
}
