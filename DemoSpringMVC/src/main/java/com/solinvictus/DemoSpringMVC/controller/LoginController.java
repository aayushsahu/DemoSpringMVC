package com.solinvictus.DemoSpringMVC.controller;

import java.util.Date;
import java.util.Map;

import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.solinvictus.DemoSpringMVC.DAO.UserDAO;
import com.solinvictus.DemoSpringMVC.Entity.User;
import com.solinvictus.DemoSpringMVC.Service.UserService;

@RestController
public class LoginController implements IController {

	private final UserService userService;

	public LoginController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin() {
		ModelAndView mv = new ModelAndView("login");

//		Populating data into DB
//		
//		User userA = new User("a", "a", "A_NAME", "A_NAME@EMAIL.COM", new Date());
//		User userB = new User("b", "b", "B_NAME", "B_NAME@EMAIL.COM", new Date());
//		User userC = new User("c", "c", "C_NAME", "C_NAME@EMAIL.COM", new Date());
//		User userD = new User("d", "d", "D_NAME", "D_NAME@EMAIL.COM", new Date());
//		User userE = new User("e", "e", "E_NAME", "E_NAME@EMAIL.COM", new Date());
//		userService.registerUser(userA);
//		userService.registerUser(userB);
//		userService.registerUser(userC);
//		userService.registerUser(userD);
//		userService.registerUser(userE);

		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView showWelcome(@RequestParam Map<String, String> allParams) {
		ModelAndView mv = new ModelAndView();

		String username = allParams.get("user");
		String password = allParams.get("password");

		System.out.println("Parameters are " + allParams.entrySet());

		// request.setAttribute("username", user);

		if (userService.validateUser(username, password)) {
			mv = new ModelAndView("welcome");
			mv.addObject("username", username);
			return mv;
		} else {
			this.showLogin();
		}
		return mv;
	}

}