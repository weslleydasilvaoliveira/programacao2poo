import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
	public static void main(String[] args) {

		// cliente
		Estado estado1 = new Estado("Maranhão");
		Cidade cidade1 = new Cidade("Imperatriz", estado1);
		Endereco endereco1 = new Endereco("Getúlio Vargas", "2600", "", "Centro", "7056790", cidade1);
		Endereco enderecoDeEntrega = new Endereco("Rua Iracema", "105", "proximo a rua que dobra", "Nova Imperatriz", "382", cidade1);
		Telefone telefone1 = new Telefone("(99) 98136 3323");
		Telefone telefone2 = new Telefone("(94) 99283 8393");
		Cliente cliente1 = new Cliente("Michael Jackson", "rusbeh@live.com", "12.995.515/0001-01",
				TipoCliente.PESSOAJURIDICA);
		cliente1.addTelefone(telefone1);
		cliente1.addTelefone(telefone2);

		// produtos
		Categoria categoria1 = new Categoria("Eletrodoméstico");
		Categoria categoria2 = new Categoria("Eletrônico");
		Categoria categoria3 = new Categoria("Gamer");
		Produto produto1 = new Produto("Geladeira Electrolux 60 FPS", 3000.00);
		produto1.addCategoria(categoria1);
		Produto produto2 = new Produto("TecPix a mais vendida do Brasil (0800 777 7000)", 600.00);
		produto2.addCategoria(categoria1);
		produto2.addCategoria(categoria2);
		Produto produto3 = new Produto("PC Gamer Apollo YotaByte 10 cores DDR 9000", 4500.00);
		produto3.addCategoria(categoria2);
		produto3.addCategoria(categoria3);

		// pedidos
		ItemPedido itemPedido1 = new ItemPedido(produto1, 4, 300.00);
		ItemPedido itemPedido2 = new ItemPedido(produto2, 2, 100.00);
		ItemPedido itemPedido3 = new ItemPedido(produto3, 3, 400.00);
		PagamentoComBoleto pagamento1 = new PagamentoComBoleto(LocalDate.of(2017, 10, 20), EstadoPagamento.PENDENTE);
		PagamentoComCartao pagamento2 = new PagamentoComCartao(3, EstadoPagamento.PENDENTE);
		Pedido pedido1 = new Pedido(LocalDateTime.of(2017, 9, 30, 10, 32), pagamento1, endereco1);
		pedido1.addItemPedido(itemPedido1);
		pedido1.addItemPedido(itemPedido2);
		Pedido pedido2 = new Pedido(LocalDateTime.of(2017, 9, 30, 10, 32), pagamento2, enderecoDeEntrega);
		pedido2.addItemPedido(itemPedido3);
		
		// cliente, produtos e pedidos (relacionamento)
		cliente1.addPedido(pedido1);
		cliente1.addPedido(pedido2);
		

		System.out.print(cliente1);
	}
}