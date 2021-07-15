package br.com.generations.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaLoja {
	public static void main(String[] args) {
		
		try (Scanner read = new Scanner(System.in)) {
			ArrayList<Loja> produtos = new ArrayList<>();

			System.out.println("Informe a quantidade de livros que deseja adicionar: ");
			int numero = read.nextInt();
			int i;

			for (i = 0; i < numero; i++) {
				System.out.print("Nome do livro: ");
				String livros = read.next();
				
				System.out.println("Valor: ");
				double valor = read.nextDouble();
				

				produtos.add(new Loja(livros, valor));

			}
			for (Loja u : produtos) {
				System.out.println(u);
			}

			int resposta;
			
			do {
				System.out.println();
				System.out.println("Deseja remover um item? \n 1-Sim | 2-Não");
				resposta = read.nextInt();
				
				if (resposta == 1) {
					System.out.println();
					System.out.println("Selecione o indice do produto: ");
					i = read.nextInt();
					produtos.get(i);
					produtos.remove(i - 1);
					
					for (i = 0; i < produtos.size(); i++) {
						System.out.println(produtos.get(i));
					}
				}

			} 
			
			while (resposta == 1);
			System.out.println("Programa finalizado!");
			read.close();
		}
	}
}
