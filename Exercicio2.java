package br.com.generation.lacosdedecisaoexercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o 1� n�mero:");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o 2� n�mero:");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o 3� n�mero:");
		numero3 = leia.nextInt();
		
		if(numero1>numero2 && numero1>numero3) {
			if(numero2>numero3){
				System.out.println("A ordem crescente �: " + numero3 + ", " + numero2 + ", " + numero1);
			}
			else if(numero3>numero2) {
				System.out.println("A ordem crescente �: " + numero2 + ", " + numero3 + ", " + numero1);
			}
		}
			
		 if(numero2>numero1 && numero2>numero3) {
			 if(numero1>numero3) {
				 System.out.println("A ordem crescente �: " + numero3 + ", " + numero1 + ", " + numero2);
			 }
			 else if(numero3>numero1) {
				 System.out.println("A ordem crescente �: " + numero1+", " + numero3 +", " + numero2);
				 
			 }
		 }
		if(numero3>numero1 && numero3>numero2) {
				 if(numero1>numero2) {
					 System.out.println("A ordem crescente �: "+ numero2 + ", " +numero1 + ", " + numero3);
				 }
				 else if(numero2>numero1) {
					 System.out.println("A ordem crescente �: " + numero1 + ", " + numero2 +", " + numero3);
				 }
				 leia.close();
			}
						
		}
		
	}


