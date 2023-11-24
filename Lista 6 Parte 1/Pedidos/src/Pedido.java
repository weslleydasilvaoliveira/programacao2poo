import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private static Integer count = 0;
	private Integer id;
	private LocalDateTime instante;
	private List<ItemPedido> itensPedido = new ArrayList<>();
	private Pagamento pagamento;
	private Endereco enderecoDeEntrega;

	public Pedido(LocalDateTime instante, Pagamento pagamento, Endereco enderecoDeEntrega) {
		this.id = ++count;
		this.instante = instante;
		this.pagamento = pagamento;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	public void addItemPedido(ItemPedido itemPedido) {
		itensPedido.add(itemPedido);
	}

	public void removeItemPedido(ItemPedido itemPedido) {
		itensPedido.remove(itemPedido);
	}

	public Integer getId() {
		return id;
	}

	public LocalDateTime getInstante() {
		return instante;
	}

	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Endereco getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}
	public Double valorTotal() {
		double totalPedido = 0;
		for (ItemPedido itemPedido : itensPedido) {
			totalPedido += itemPedido.preco();
		}
		return totalPedido;
	}
	@Override
	public String toString() {
		String string =  "Pedido [" + id + "]" + "\ninstante = " + instante + "\nitens Pedidos: \n" + itensPedido
				+ "\npagamento = " + pagamento + "\nenderecoDeEntrega = " + enderecoDeEntrega + "\n";
		
		for (ItemPedido itemPedido : itensPedido) {
			string += itemPedido.preco();
		}
		string += "Valor Total do Pedido = " + valorTotal();
		
		return string;
	}
}