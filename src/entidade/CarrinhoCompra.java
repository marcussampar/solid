package entidade;
 
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
	
	private List<Item> itens;	
	private double valorTotal;	 
	
	public CarrinhoCompra() {		
		this.itens = new ArrayList<Item>();		
		this.valorTotal = 0;		
	}
		
	public void addItem(Item item) {
		System.out.println(item.getDescricao()+ " adicionado");
		this.itens.add(item);
		this.setValorTotal(this.getValorTotal() + item.getValor());		
	}
	
	public boolean validarCarrinho() {
		System.out.println(itens.size());
		return itens.size()>0;
	}
	
	public void exibirCarrinho() {
		for(Item item: itens) {
			System.out.println(item.getDescricao());
		}		
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
}
