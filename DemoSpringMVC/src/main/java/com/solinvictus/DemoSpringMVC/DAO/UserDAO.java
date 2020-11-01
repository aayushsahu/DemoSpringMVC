package com.solinvictus.DemoSpringMVC.DAO;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.solinvictus.DemoSpringMVC.Entity.User;

public class UserDAO {
	
	@Autowired
	EntityManager em;
	
	public void createUser(User user) {
		em.persist(user);
	}

//	public User findUser(User user) {
//		em.find(User.class, user.getId());
//
//	}

	public boolean updateUser() {
		return false;

	}

	public boolean deleteUser() {
		return false;

	}

}
