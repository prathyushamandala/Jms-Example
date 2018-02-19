package com.visam.java.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.visam.java.model.Offers;

public class OffersDAOImp implements OffersDAO {
	
	 private SessionFactory sessionFactory;

	    public void setSessionFactory(SessionFactory sf) {
	        this.sessionFactory = sf;
	    }

		@Override
		public List<Offers> getHotelOffers() {
			  Session session = this.sessionFactory.getCurrentSession();
			  List<Offers> lstOff= session.createQuery("from Offers where OffType='Hotel'").list();
		        
			 
			return lstOff;
		}

}
