public class ItemPedido {
	private Produto produto;
	private Integer quantidade;
	private Double desconto;

	public ItemPedido(Produto produto, Integer quantidade, Double desconto) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.desconto = desconto;
	}
		
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	public Double preco() {
		return produto.getPreco()*this.quantidade - this.desconto;
	}

	@Override
	public String toString() {
		return "ItemPedido = " + produto + 
				"\nquantidade = " + quantidade +
				"\ndesconto = " + desconto +
				"\nValor itemPedido = " + this.preco() + "\n";
	}
}