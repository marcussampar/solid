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
		
	public void addItem(Item item, double valor) {
		this.itens.add(item);
		this.valorTotal += valor;		
	}
	
	public boolean validarCarrinho() {
		return itens.size()>0;
	}
	
	public void exibirCarrinho() {
		for(Item item: itens) {
			System.out.println(item.getDescricao());
		}		
	}
	
}
