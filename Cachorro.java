package br.com.generation.exerciciospolimorfismo;

public class Cachorro implements Animal{

	
	public void nome() {
		System.out.println("Nome:Cotonete");
		
	}

	public void idade() {
		System.out.println("Idade: 10 meses");
		
	}

	public void pelo() {
		System.out.println("Pelo: sim");
		
	}

	public void emiteSom() {
		System.out.println("Som: Latido");
		
		
	}

	public void cor() {
		System.out.println("Cor: Branco");
		
	}
	public void corre() {
		System.out.println("Cachorro corre!");
	}
	
}
