package com.training.junit.spring.dao;

import org.springframework.stereotype.Component;

import com.training.junit.spring.domain.Ticket;

@Component
public class TicketDaoImpl implements TicketDao {

	public int createTicket(Ticket ticket) {
		return 2;
	}

}
