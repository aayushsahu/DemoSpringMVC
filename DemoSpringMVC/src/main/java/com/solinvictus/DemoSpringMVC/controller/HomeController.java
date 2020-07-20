package com.solinvictus.DemoSpringMVC.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController implements IController{
	
	@RequestMapping(value= "/login#ALARM" , method= RequestMethod.POST)
	public ModelAndView setAnAlarm(@RequestParam Map<String,String> allParams) {
		ModelAndView mv=new ModelAndView("welcome#ALARM");
		
		return mv;
	}
	
	@RequestMapping(value= "/login#REMINDER" , method= RequestMethod.POST)
	public ModelAndView createAReminder(@RequestParam Map<String,String> allParams) {
		ModelAndView mv=new ModelAndView("welcome");
		return mv;
	}
	
	@RequestMapping(value= "/login#TO-DO" , method= RequestMethod.POST)
	public ModelAndView addTaskToDo(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView("welcome");
		return mv;
	}
	
	@RequestMapping(value= "/login#NOTES" , method= RequestMethod.POST)
	public ModelAndView makeNotes(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView("welcome");
		return mv;
	}
	
}
