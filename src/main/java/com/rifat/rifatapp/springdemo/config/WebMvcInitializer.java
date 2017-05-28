package com.rifat.rifatapp.springdemo.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebMvcInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContex) throws ServletException {
		// TODO Auto-generated method stub
        
		AnnotationConfigWebApplicationContext rootcontext=new AnnotationConfigWebApplicationContext();
		
		rootcontext.register(WebMvcConfig.class);
		
		ServletRegistration.Dynamic registration = servletContex.addServlet("dispatcher", new DispatcherServlet(rootcontext));
		registration.addMapping("/");
		registration.setLoadOnStartup(1);
		
		
	}

}
