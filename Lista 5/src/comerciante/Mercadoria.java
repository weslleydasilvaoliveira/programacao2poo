package comerciante;

public class Mercadoria{
	private String nome;
	private double precoCompra;
	private double precoVenda;

	public Mercadoria(String nome, double precoCompra, double precoVenda){
		this.nome = nome;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}

	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public double getPrecoCompra(){
		return this.precoCompra;
	}
	public void setPrecoCompra(double precoCompra){
		this.precoCompra = precoCompra;
	}
	public double getPrecoVenda(){
		return this.precoVenda;
	}
	public void setPrecoVenda(double precoVenda){
		this.precoCompra = precoCompra;
	}
}
