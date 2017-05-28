package com.rifat.rifatapp.springdemo.services;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService implements GenericWelcomeService {
	
	public List <String> getmessage(String message)
	{
		String s="Welcome "+message;
		
		List <String> l=new ArrayList<>();
		l.add("Hello");
		l.add(message);
		
		return l;
	}

}
