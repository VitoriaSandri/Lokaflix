package com.lokadora.main;

import java.util.List;

import com.lokadora.bean.*;

public class ChamadaInterface {
	
	ProcessamentoCadastro pl = new ProcessamentoCadastro();
	
	public List<Cliente> insereCliente(Cliente cliente) {
		return pl.novoCliente(cliente);

	}
	
	public void insereVideo (Video video) {
		pl.novoVideo(video);
	}
	
	public List<Cliente> returnCliente () {
		return pl.lstCliente();
	}
	
	public List<Video> returnVideo () {
		return pl.lstVideo();
	}
	
	public List<Dependente> insereDependente(Dependente dependente) {
		return pl.novoDependente(dependente);

	}
	
	public List<Dependente> returnDependente () {
		return pl.lstDependente();
	}
}
