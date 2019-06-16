package com.lokadora.service;

import com.lokadora.bean.Cliente;

public class ClienteService extends PessoaService {

	boolean validaCPF(Cliente c) {
		
		String CPF = c.getCpf();
		try {
			CPF = CPF.replace(".", "");  
		    CPF = CPF.replace("-", "");
		    
		    if (CPF.length() != 11) {     
		           return false;   
		       }
		       return true;
		    
		}
		catch (Exception ex) {
			return false;
		}
	}
	
}
