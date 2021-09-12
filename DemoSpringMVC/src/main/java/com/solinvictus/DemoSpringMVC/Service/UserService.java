package com.solinvictus.DemoSpringMVC.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.solinvictus.DemoSpringMVC.Entity.User;
import com.solinvictus.DemoSpringMVC.Repos.UserRepository;
import com.solinvictus.DemoSpringMVC.Security.MyUserDetails;

@Service
public class UserService{

	private final UserRepository userRepository;
	private User user;
	private PasswordEncoder passwordEncoder;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}
	
	public void registerUser(User user) {
		userRepository.save(user);
	}

//	public boolean validateUser(String username, String password) {
//
//		User user = (User)this.loadUserByUsername(username);
//		if (passwordEncoder.matches(password, user.getPassword())) {
//			this.setUser(user);
//			return true;
//		}
//		return false;
//	}
}