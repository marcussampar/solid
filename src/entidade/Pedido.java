package entidade;

public class Pedido {
	
	private int statusPedido;
	private CarrinhoCompra carrinho;	
	private double valorTotalPedido;
	
	public Pedido() {
		this.statusPedido = 0;
		this.carrinho = new CarrinhoCompra();
		this.valorTotalPedido = 0;
	}
	
	public boolean confirmarPedido() {
		if(carrinho.validarCarrinho()) {
			this.setStatusPedido(1);
			return true;
		}		
		return false;
	}
	
	public boolean faturarPedido() {
		if(carrinho.validarCarrinho()) {
			this.setStatusPedido(2);
			EmailService.enviarEmail();
			return true;
		}		
		return false;
	}
	
	public void exibirValorPedido() {		
		System.out.println(this.getValorTotalPedido());		
	}
	
	public void exibirStatusPedido() {
		System.out.println(this.getStatusPedido());
	}
	
	public CarrinhoCompra getCarrinhoCompra() {
		return this.carrinho;
	}
	
	public int getStatusPedido() {
		return this.statusPedido;
	}
	
	public void setStatusPedido(int statusPedido) {
		this.statusPedido = statusPedido;
	}

	public double getValorTotalPedido() {
		return valorTotalPedido;
	}

	public void setValorTotalPedido(double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}
}
