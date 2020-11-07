package com.solinvictus.DemoSpringMVC.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solinvictus.DemoSpringMVC.Entity.User;
import com.solinvictus.DemoSpringMVC.Repos.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public boolean validateUser(String username, String password) {
		Iterable<User> it = userRepository.findAll();
		List<User> users = new ArrayList<>();

		it.forEach(e -> {
			users.add(e);
		});
		for (User user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password))
				return true;
		}
		return false;
	}

	public void registerUser(User user) {
		userRepository.save(user);
	}
}