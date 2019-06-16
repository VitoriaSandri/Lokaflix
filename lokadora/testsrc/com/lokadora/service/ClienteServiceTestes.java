package com.lokadora.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lokadora.bean.Cliente;

class ClienteServiceTestes {

	@Test
	void testValidCPF() {
		ClienteService cSrv = new ClienteService();
		Cliente c = new com.lokadora.bean.Cliente("41085578321", "luanacostaribeiro@gmail.com", "123batatatinha", "Luana", "Ribeiro");
		assertEquals(true, cSrv.validaCPF(c));
		
	}
	
	
}
