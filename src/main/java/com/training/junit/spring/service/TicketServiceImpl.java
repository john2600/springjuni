package com.training.junit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.junit.spring.dao.TicketDao;
import com.training.junit.spring.domain.Ticket;

@Component
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDao dao;
	
	public TicketDao getDao() {
		return dao;
	}

	public void setDao(TicketDao dao) {
		this.dao = dao;
	}
	
	/***
	 * this class return a integer refered to a buy of tickey 
	 */

	public int buyTicket(String passangerName, String phone) {
		Ticket ticket = new Ticket();
		ticket.setPassangerName(passangerName);
		ticket.setPhone(phone);
		return dao.createTicket(ticket);
		
	}

}
