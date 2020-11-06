package controller;
import entidade.*; 

public class mainClass {
	
	public static void main (String args[]) {
		Pedido p1 = new Pedido();
		p1.exibirStatusPedido();
		p1.exibirValorPedido();
		p1.faturarPedido();
		
		Item i1 = new Item(1, "Celular", 750);
		Item i2 = new Item(2, "Fone", 30);
		
		p1.getCarrinhoCompra().addItem(i1);
		p1.getCarrinhoCompra().addItem(i2);
		
		p1.exibirValorPedido();
		p1.faturarPedido();
		p1.getCarrinhoCompra().exibirCarrinho();
		p1.exibirStatusPedido();
	}
}
