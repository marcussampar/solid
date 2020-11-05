package entidade;

public class Item {
	
	private int idProduto;
	private String descricao;
	private double valor;
	
	public Item() {
		this.idProduto = 0;
		this.descricao = "";
		this.valor = 0;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
