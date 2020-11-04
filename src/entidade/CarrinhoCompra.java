package entidade;
 
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
	
	private List<Integer> idProdutos;	
	private double valorTotal;
	private int statusPedido; 
	
	public CarrinhoCompra() {		
		this.idProdutos = new ArrayList<Integer>();		
		this.valorTotal = 0;
		this.statusPedido = 0;
	}
		
	public void addItem(Integer i, double valor) {
		this.idProdutos.add(i);
		this.valorTotal += valor;		
	}
	
	public void confirmarPedido() {
		if(validarCarrinho()) {
			this.statusPedido = 1;
		}
	}
	
	public void faturarPedido() {
		if(validarCarrinho()) {
			this.statusPedido = 2;
			enviarEmail();
		}
	}
	
	private void enviarEmail() {
		System.out.println("Pedido faturado com sucesso - email enviado");
	}
	
	private boolean validarCarrinho() {
		if(idProdutos.size()==0) {
			System.out.println("Carrinho vazio");
			return false;
		}else {
			return true;
		}
	}
	
	public void exibirItem() {
		for(Integer i: idProdutos) {
			System.out.println(i);
		}		
	}
	
	public void exibirValor() {		
		System.out.println(this.valorTotal);		
	}
	
	public void exibirStatusPedido() {
		System.out.println(this.statusPedido);
	}
	
}
