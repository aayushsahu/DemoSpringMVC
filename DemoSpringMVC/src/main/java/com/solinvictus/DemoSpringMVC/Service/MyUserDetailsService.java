package com.solinvictus.DemoSpringMVC.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.solinvictus.DemoSpringMVC.Entity.User;
import com.solinvictus.DemoSpringMVC.Repos.UserRepository;
import com.solinvictus.DemoSpringMVC.Security.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService {

	private final UserRepository userRepository;
	
	@Autowired
	public MyUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Iterable<User> it = userRepository.findAll();
		List<User> users = new ArrayList<>();
		System.out.println("loadUserByUsername Service method is invoked");

		it.forEach(e -> {
			users.add(e);
		});
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				System.out.println("_________________" + username + "_________________");
				MyUserDetails myUserDetails = new MyUserDetails(username);
				myUserDetails.setPassword(user.getPassword());
				
				
				return myUserDetails;
			}
		}
		throw new UsernameNotFoundException(username);
	}

}
