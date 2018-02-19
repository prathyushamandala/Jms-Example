package com.vism.springjms;

import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class Producer {

	/**
	 * @throws JMSException
	 * @throws NamingException 
	 */
	@RequestMapping(value = "/sendMessage", method = RequestMethod.GET)
	public boolean sendMessage() throws JMSException, NamingException {

		InitialContext ic = new InitialContext();

		ConnectionFactory connectionFactory = (ConnectionFactory) ic.lookup("jms/ConnectionFactory");

		Queue queue = (Queue) ic.lookup("jms/QUEUE1");

		Connection con = connectionFactory.createConnection();

		Session ses = con.createSession(false, Session.AUTO_ACKNOWLEDGE);

		con.start();

		MessageProducer sender = ses.createProducer(queue);

		TextMessage msg = ses.createTextMessage();

		msg.setText("hello message");
		msg.setJMSCorrelationID("4654646");

		sender.send(msg);

		return true;
	}

}
