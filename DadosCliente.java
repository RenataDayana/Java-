package br.com.generation.classe;

public class DadosCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nome = "Renata";
		cliente1.pedido = "Smartphone";
		cliente1.valor = 900;
		cliente1.formaPagamento = "Cart�o de Cr�dito";
		cliente1.enderecoEntrega = "Rua dos Bobos, n�0";
		
		cliente1.fazerPedido();
		cliente1.compraFinalizada();
		cliente1.preparandoEntrega();
		
		System.out.println(cliente1.nome);
		System.out.println(cliente1.pedido);
	}

}
