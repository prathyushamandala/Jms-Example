package com.visam.java.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.visam.java.model.Offers;
import com.visam.java.service.OfferSevice;

import java.util.List;


@Controller
public class OffersController {
	
	@Autowired
	OfferSevice offerService;
	
	@RequestMapping(value="/Offers",method = RequestMethod.GET)
	public ModelAndView getOffers(@RequestParam("Opt1") String hotel,@RequestParam("Opt2") String Vacation ){
		
		//<beans:property name="OffersDAO" ref="OffersDAO"></beans:property>
		
		List<Offers> offersList = offerService.getHotelDetails();
		
		
		return new ModelAndView("Offers");
		
	}
	
	

}
