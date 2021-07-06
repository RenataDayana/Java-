package br.com.generation.lacosdedecisaoexercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, infantil, juvenil, adulto;
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("\nVocê se encontra na categoria Infantil!");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("\nVocê se encontra na categoria Juvenil!");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("\nVocê se encontra na categoria Adulto!");
		}
		else {
			System.out.println("Sua idade não pertence a nenhuma categoria cadastrada.");
		}
	}
}
			


