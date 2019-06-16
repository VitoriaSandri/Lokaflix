package com.lokadora.service;

import com.lokadora.bean.Pessoa;

public class PessoaService {
	
	boolean validaNome(Pessoa p) {  
	       if (p.getNome().length() < 2) {     
	           return false;   
	       }
	       return true;
		}

}
