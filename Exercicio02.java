package br.com.generation.vetoresmatrizes;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
		 */
		
		Scanner read = new Scanner(System.in);
		
		double[] dados = new double [10];
		double maiorPontuacao =0.0, media = 0.0, soma = 0.0;
		int contador;
				
		System.out.println("Informe um valor: ");
		
		for(contador = 0; contador<dados.length; contador++) {
			dados[contador]=read.nextDouble();
			
			soma+=dados[contador];
			media = soma/10;
			
			if(dados[contador]> maiorPontuacao) {
				maiorPontuacao = dados[contador];
			}
		}
		System.out.println("A média aritmética dos lançamentos é:"+ media);
		System.out.println("\nA maior pontuação é: "+ maiorPontuacao);
		read.close();
	}
}
