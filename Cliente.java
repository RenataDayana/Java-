package br.com.generation.classe;

public class Cliente {
	
	String nome;
	String pedido;
	int valor;
	String formaPagamento;
	String enderecoEntrega;
	
	void fazerPedido() {
		System.out.println("Fa�a seu pedido!!!" );
	}
	void compraFinalizada() {
		System.out.println("Compra efetuada com sucesso!");
	}
	void preparandoEntrega() {
		System.out.println("Seu produto est� sendo preparado para entrega!");
	}
}
