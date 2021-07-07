package br.com.generation.vetoresmatrizes;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		/*
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
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
		System.out.println("A m�dia aritm�tica dos lan�amentos �:"+ media);
		System.out.println("\nA maior pontua��o �: "+ maiorPontuacao);
		read.close();
	}
}
