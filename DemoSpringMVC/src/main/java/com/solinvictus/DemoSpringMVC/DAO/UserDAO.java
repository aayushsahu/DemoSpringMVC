package com.solinvictus.DemoSpringMVC.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.solinvictus.DemoSpringMVC.Entity.User;

//@Repository
public class UserDAO {

	/*
	@PersistenceUnit
	private EntityManagerFactory emf;
*/	
//	@PersistenceContext
//	private EntityManager em;
// @Autowired
//	public UserDAO() {  //(EntityManager em) {
//		this.emf = Persistence.createEntityManagerFactory("user_dao");
//		emf = Persistence.createEntityManagerFactory("user_factory");
//		em = emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(this.user);
//		em.getTransaction().commit();
//		emf.close();
//		em.close();
//	}

/*	
	public void create(User user) {
 
		EntityManager em = emf.createEntityManager();
		if (em != null) {
			if (user != null) {
				em.getTransaction().begin();
				em.persist(user);
				em.getTransaction().commit();
				System.out.println("User created");
			} else
				System.out.println("Could not create");
		} else
			System.out.println("EM ka object nai mil ra h ");
		em.close();
	}

	public User read(Long id) {
		EntityManager em = emf.createEntityManager();
		User user = em.find(User.class, id);
		em.close();
		return user;
	}

	public boolean update(User user, User userUpdated) {
		EntityManager em = emf.createEntityManager();
		if (em.find(User.class, user.getId()).equals(user)) {
			em.persist(userUpdated);
			em.close();
			return true;
		}
		em.close();
		return false;
	}

	public boolean delete(User user) {
		EntityManager em = emf.createEntityManager();
		if (em.find(User.class, user.getId()).equals(user)) {
			em.remove(user);
			em.close();
			return true;
		}
		em.close();
		return false;
	}

	public void destroyEM() {
		// this.emf.close();
		// this.em.close();
	}
	*/

}
