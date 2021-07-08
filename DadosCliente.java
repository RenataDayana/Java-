package br.com.generation.classe;

public class DadosCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nome = "Renata";
		cliente1.pedido = "Smartphone";
		cliente1.valor = 900;
		cliente1.formaPagamento = "Cartão de Crédito";
		cliente1.enderecoEntrega = "Rua dos Bobos, nº0";
		
		cliente1.fazerPedido();
		cliente1.compraFinalizada();
		cliente1.preparandoEntrega();
		
		System.out.println(cliente1.nome);
		System.out.println(cliente1.pedido);
	}

}
