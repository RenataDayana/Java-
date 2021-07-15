package br.com.generations.collections;

public class Loja {

	private String livros;
	private double valor;
	
	public Loja(String livros, double valor) {
		super();
		this.livros = livros;
		this.valor = valor;
	}

	public String getLivros() {
		return livros;
	}

	public void setLivros(String livros) {
		this.livros = livros;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	public String toString() {
		
		return "Livros: " + this.livros + ", " + "R$" + this.valor + ".";
				
	}
}



	