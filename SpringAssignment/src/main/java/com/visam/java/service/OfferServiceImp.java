package com.visam.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.visam.java.dao.OffersDAO;
import com.visam.java.model.Offers;

public class OfferServiceImp implements OfferSevice {

	@Autowired
	OffersDAO offerDao;
	
	@Override
	public List<Offers> getHotelDetails() {
		return offerDao.getHotelOffers();
	}

}
