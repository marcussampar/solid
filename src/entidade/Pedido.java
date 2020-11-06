package entidade;

public class Pedido {
	
	private int statusPedido;
	private CarrinhoCompra carrinho;	 
	
	public Pedido() {
		this.statusPedido = 0;
		this.carrinho = new CarrinhoCompra(); 
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
		System.out.println("--Exibindo valor do pedido: "+this.carrinho.getValorTotal());		
	}
	
	public void exibirStatusPedido() {
		System.out.println("--Exibindo status do pedido: "+this.getStatusPedido());
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
 
}
