package br.com.generation.lacosdedecisaoexercicios;

import java.util.Scanner;
 
public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um n�mero: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero digitado � par e sua raiz �:");
			System.out.println(Math.sqrt(numero));
		}
		else{
			System.out.println("Seu n�mero � �mpar e sua pot�ncia �:");
			System.out.println(Math.pow(numero, 2));
		}
			
	}

}
