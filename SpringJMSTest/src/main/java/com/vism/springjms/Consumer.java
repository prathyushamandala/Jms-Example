package com.vism.springjms;

import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class Consumer {

	@RequestMapping(value = "/consume", method = RequestMethod.GET)
	public String consume() throws JMSException, NamingException {
		
		InitialContext ic = new InitialContext();
		
		ConnectionFactory connectionFactory  = (ConnectionFactory) ic.lookup("jms/ConnectionFactory");
		
		Queue queue = (Queue)ic.lookup("jms/QUEUE1");
		

		Connection con = connectionFactory.createConnection();

		Session ses = con.createSession(false, Session.AUTO_ACKNOWLEDGE);

		con.start();
		
		MessageConsumer consumer = ses.createConsumer(queue);
		Message msg = consumer.receive();

		return msg.getJMSCorrelationID();

	}

}
