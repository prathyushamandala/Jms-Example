package com.visam.java.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class HomeController {

	    @RequestMapping(value="/")
	    public ModelAndView mainPage() {
	        return new ModelAndView("home");
	   
	    }
	    
	    
	
}
