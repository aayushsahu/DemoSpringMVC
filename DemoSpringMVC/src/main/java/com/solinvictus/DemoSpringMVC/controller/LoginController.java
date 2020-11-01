package com.solinvictus.DemoSpringMVC.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.solinvictus.DemoSpringMVC.Entity.User;
import com.solinvictus.DemoSpringMVC.Service.UserService;

@RestController
public class LoginController implements IController {
	
	@RequestMapping(value= "/login" , method= RequestMethod.GET)
	public ModelAndView showLogin(){
		ModelAndView mv =new ModelAndView("login");
		return mv;
	}	
	
	@RequestMapping(value= "/login" , method= RequestMethod.POST)
	public ModelAndView showWelcome( @RequestParam Map<String,String> allParams) {
		ModelAndView mv = new ModelAndView("welcome");
		String user = allParams.get("user");
		mv.addObject("username", user);
		//request.setAttribute("username", user);
		//System.out.println( "Parameters are " + allParams.entrySet());
		return mv;
	}
	
	
}