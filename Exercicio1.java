package br.com.generation.lacosdedecisaoexercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3,maiorNumero=0;
		
		System.out.println("Digite o 1º número:");
		numero1 = leia.nextInt();
		System.out.println("Digite o 1º número:");
		numero2 = leia.nextInt();
		System.out.println("Digite o 1º número:");
		numero3 = leia.nextInt();
		
		if(numero1> numero2 && numero1>numero3) {
			maiorNumero = numero1;
		}
		
		else if(numero2> numero1 && numero2>numero3) {
			maiorNumero = numero2;			
		}
		
		else if(numero3> numero1 && numero3>numero2) {
			maiorNumero = numero3;				
		}
			System.out.println("O maior número inteiro digitado é: "+ maiorNumero);
		}
	}

