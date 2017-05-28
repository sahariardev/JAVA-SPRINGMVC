package com.rifat.rifatapp.springdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rifat.rifatapp.springdemo.services.GenericWelcomeService;
import com.rifat.rifatapp.springdemo.services.WelcomeService;

@Controller
public class WelcomeController {
	@Autowired
	private GenericWelcomeService we;
	
	@RequestMapping("/")
	public String doWelcome(Model model)
	{
		//1.Retriving the process data
		//we=new WelcomeService();
		List <String> l=we.getmessage("Rifat");
		
		
		//add data to the model
		
		model.addAttribute("mywelcomemessage",l);
		
		//returning the data
		
		
		return "welcomeNew";
	}
	@RequestMapping("/rifat")
	public String rifat()
	{
		return "welcomeNew2";
	}

}
