package com.solinvictus.DemoSpringMVC.controller;

import java.util.Date;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.solinvictus.DemoSpringMVC.Entity.Todo;
import com.solinvictus.DemoSpringMVC.Service.TodoService;

@Controller
public class HomeController implements IController {

//	@RequestMapping(value= "/login#ALARM" , method= RequestMethod.POST)
//	public ModelAndView setAnAlarm(@RequestParam Map<String,String> allParams) {
//		ModelAndView mv=new ModelAndView("welcome#ALARM");
//		System.out.println("Parameters are " + allParams.entrySet());
//		
//		return mv;
//	}
//	
//	@RequestMapping(value= "/login#REMINDER" , method= RequestMethod.POST)
//	public ModelAndView createAReminder(@RequestParam Map<String,String> allParams) {
//		ModelAndView mv=new ModelAndView("welcome");
//		System.out.println("Parameters are " + allParams.entrySet());
//		return mv;
//	}
//	
//	
//	@RequestMapping(value= "/login#NOTES" , method= RequestMethod.POST)
//	public ModelAndView makeNotes(@RequestParam Map<String,String> allParams) {
//		ModelAndView mv=new ModelAndView("welcome");
//		System.out.println("Parameters are " + allParams.entrySet());
//		return mv;
//	}

}
