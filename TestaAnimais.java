package br.com.generation.exerciciospolimorfismo;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		System.out.println("----------Dados cachorro----------");
		dog.nome();
		dog.idade();
		dog.pelo();
		dog.emiteSom();
		dog.cor();
		dog.corre();
		
		System.out.println("\n----------Dados cavalo----------");
		horse.nome();
		horse.idade();
		horse.pelo();
		horse.emiteSom();
		horse.cor();
		horse.corre();
		
		System.out.println("\n----------Dados preguiça----------");
		sloth.nome();
		sloth.idade();
		sloth.pelo();
		sloth.emiteSom();
		sloth.cor();
		sloth.subirArvore();
		
		
	}
}
