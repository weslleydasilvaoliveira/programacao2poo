package order;

public class OrderItem {
	private int quantidade;
	private double preco;
	private Produto produto;
	
	public OrderItem(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() { 
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double subTotal() {
		return this.quantidade * this.produto.getPreco();
	}
	@Override
	public String toString() {
		return "OrderItem [quantidade=" + quantidade + ", preco=" + preco + "]";
	}
	
	
}
