package com.visam.java.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.visam.java.model.FormDetails;

@Controller
public class FormController {
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	 public String userForm(Locale locale,Model model) {
	      model.addAttribute("user", new FormDetails());
	      return "User";
	   }
	   /* public ModelAndView UserForm() {
	        return new ModelAndView("user");
	    }*/
	
	 
	    @RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	    public String submit(@ModelAttribute("user")FormDetails fd, Model model)
	      {
	        model.addAttribute("username", fd.getUsername());
	        model.addAttribute("email", fd.getEmail());
	        model.addAttribute("phonenumber", fd.getPhonenum());
	        return "form";
	    }
	}


