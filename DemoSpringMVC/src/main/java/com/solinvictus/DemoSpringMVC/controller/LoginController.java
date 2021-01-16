package com.solinvictus.DemoSpringMVC.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.solinvictus.DemoSpringMVC.Entity.Todo;
import com.solinvictus.DemoSpringMVC.Entity.User;
import com.solinvictus.DemoSpringMVC.Service.TodoService;
import com.solinvictus.DemoSpringMVC.Service.UserService;

@RestController
public class LoginController implements IController {
	
	
	private String username;
	private String password;
	private User user;

	private final UserService userService;
	private final TodoService todoService;

	public LoginController(UserService userService, TodoService todoService) {
		this.userService = userService;
		this.todoService = todoService;
	}
	
	//LOGIN MAPPING
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin() {
		ModelAndView mv = new ModelAndView("login");

		// Populating data into DB
		User userA = new User("a", "a", "A_NAME", "A_NAME@EMAIL.COM", new Date());
		User userB = new User("b", "b", "B_NAME", "B_NAME@EMAIL.COM", new Date());
		User userC = new User("c", "c", "C_NAME", "C_NAME@EMAIL.COM", new Date());
		User userD = new User("d", "d", "D_NAME", "D_NAME@EMAIL.COM", new Date());
		User userE = new User("e", "e", "E_NAME", "E_NAME@EMAIL.COM", new Date());
		userService.registerUser(userA);
		userService.registerUser(userB);
		userService.registerUser(userC);
		userService.registerUser(userD);
		userService.registerUser(userE);

		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLoginCredentials(HttpServletRequest request , @RequestParam Map<String, String> allParams) {
		this.username = allParams.get("user");
		this.password = allParams.get("password");

		System.out.println("Parameters are " + allParams.entrySet());
		
		if (userService.validateUser(username, password)) {
			this.user= userService.getUser();
			ModelAndView mv = new ModelAndView("redirect:/home");
			System.out.println("Validation passed");
			request.setAttribute(View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.MOVED_PERMANENTLY);
			System.out.println("++++++" + View.RESPONSE_STATUS_ATTRIBUTE+ "   "+   HttpStatus.MOVED_PERMANENTLY);
			return mv;
			
			//this.showHome();
		} else {
			System.out.println("Validation failed");
			//this.showLogin();
			//request.setAttribute(View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.MOVED_PERMANENTLY);
			return new ModelAndView("redirect:/login");
		}
		
	}
	
	//HOME MAPPING
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView showHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("username", this.username);
		List<Todo> listOfTodo = todoService.fetchAllTodoItemForUser();
		System.out.println(listOfTodo);
		if (listOfTodo != null)
			mv.addObject("allTodoItemsForUser", listOfTodo);
		return mv;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView addTaskToDo(HttpServletRequest request, @RequestParam Map<String, String> allParams) {
		ModelAndView mv = new ModelAndView("redirect:/home");

		System.out.println("Task added");
		// call DB insert service
		Todo todoTask = new Todo(this.user, new Date(), allParams.get("todo_input"), false);
		todoService.createTodoItem(todoTask);
		request.setAttribute(View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.MOVED_PERMANENTLY);
		System.out.println("Parameters are " + allParams.entrySet());
		return mv;
	}
}