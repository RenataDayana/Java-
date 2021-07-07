package br.com.generation.vetoresmatrizes;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int [] pontuacao = new int[5];//--> [0][1][2][3][4]
		int pontuacaoMaior = 0;
		int contador;
		
		System.out.println("Informe 5 valores: ");
		// Adicionando valores aos vetores:		
		for(contador = 0; contador < pontuacao.length; contador++) {
			pontuacao[contador] = read.nextInt();
			
			if(pontuacao[contador]>pontuacaoMaior) {
				pontuacaoMaior = pontuacao[contador];
			}
		}
		System.out.println("\nA maior pontuação é: "+ pontuacaoMaior);
		read.close();
	}
}
