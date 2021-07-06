package br.com.generation.lacosdedecisaoexercicios;

import java.util.Scanner;
 
public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número digitado é par e sua raiz é:");
			System.out.println(Math.sqrt(numero));
		}
		else{
			System.out.println("Seu número é ímpar e sua potência é:");
			System.out.println(Math.pow(numero, 2));
		}
			
	}

}
