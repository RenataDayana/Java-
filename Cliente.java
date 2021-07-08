package br.com.generation.classe;

public class Cliente {
	
	String nome;
	String pedido;
	int valor;
	String formaPagamento;
	String enderecoEntrega;
	
	void fazerPedido() {
		System.out.println("Faça seu pedido!!!" );
	}
	void compraFinalizada() {
		System.out.println("Compra efetuada com sucesso!");
	}
	void preparandoEntrega() {
		System.out.println("Seu produto está sendo preparado para entrega!");
	}
}
