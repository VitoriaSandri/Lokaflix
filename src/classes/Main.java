package classes;


public class Main {
	
	public static void main( String[] args )
	{
		Cliente cliente01 = new Cliente("41085578321", "luanacostaribeiro@gmail.com", "123batatatinha", "Luana", "Ribeiro");
		System.out.println(cliente01.getCpf());
		
		Dependente dependente01 = new Dependente("filha", "41085578321", "luanacostaribeiro@gmail.com", "123batatinha", "Vitoria", "Sandri");
		System.out.println(dependente01.getCpf());
		
		Video video01 = new Video("Bill Condon", "10/05/2017", "16/03/2017", "A Bela e a Fera", "130", "Moradora de uma pequena aldeia francesa, Bela tem o pai capturado pela Fera e decide entregar sua vida ao estranho ser em troca da liberdade do progenitor. No castelo ela conhece objetos mágicos e descobre que a Fera é na verdade um príncipe que precisa de amor para voltar à forma humana.");
		System.out.println(video01.getTitulo());

    }

	
}
