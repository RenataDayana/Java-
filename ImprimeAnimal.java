package br.com.generation.ExercicioHeranca;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ImprimeAnimal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Cachorro ca1 = new Cachorro();
		System.out.println("Qual o nome do cachorro: ");
		ca1.setNome(entrada.nextLine());
		
		System.out.println("Nome: "+ ca1.getNome());
		JOptionPane.showMessageDialog(null, ca1.getNome());
		
		entrada.close();
	}

}
