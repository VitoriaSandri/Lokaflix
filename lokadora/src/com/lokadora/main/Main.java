package com.lokadora.main;

import com.lokadora.bean.Cliente;
import com.lokadora.bean.Dependente;
import com.lokadora.bean.Video;

public class Main {
	
	public static void main( String[] args )
	{
		Cliente cliente01 = new Cliente("41085578321", "luanacostaribeiro@gmail.com", "123batatatinha", "Luana", "Ribeiro");
		System.out.println(cliente01.getCpf());
		
		Dependente dependente01 = new Dependente("filha", "Vitoria", "Sandri", cliente01.getCpf(), cliente01.getEmail() , cliente01.getSenha() , cliente01.getNome(), cliente01.getSobrenome() );
		System.out.println(dependente01.getCpf());
		System.out.println(dependente01.getParentesco());
		
		Video video01 = new Video("Bill Condon", "10/05/2017", "16/03/2017", "A Bela e a Fera", "130", "Moradora de uma pequena aldeia francesa, Bela tem o pai capturado pela Fera e decide entregar sua vida ao estranho ser em troca da liberdade do progenitor. No castelo ela conhece objetos m�gicos e descobre que a Fera � na verdade um pr�ncipe que precisa de amor para voltar � forma humana.");
		System.out.println(video01.getTitulo());
		System.out.println(video01.getSinopse());
		System.out.println(video01.getDataAquisicao());
    }

	
}
