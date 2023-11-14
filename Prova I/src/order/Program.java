package order;

import java.time.LocalDateTime;
import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		//criando produto
		Produto p1 = new Produto("Suco",6.25);
		Produto p2 = new Produto("Biscoito",4.0);
		
		//criando orderItem
		OrderItem orderItem = new OrderItem(p1,3);
		LocalDateTime momento = LocalDateTime.now();
		String status = "Processing...";
		Order order = new Order(momento, status);
		order.addItem(orderItem);
		
		orderItem = new OrderItem(p2,4);
		momento = LocalDateTime.now();
		status = "Processing...";
		order.addItem(orderItem);
		
		
		
		//criando cliente
		LocalDate nascimento = LocalDate.parse("2000-02-29");
		Cliente cliente = new Cliente("João Marcus Carvalho Silva","joaomarcuscarvalho@unifesspa.edu.br",nascimento,order);
		
		System.out.println(cliente);
		System.out.println(cliente.getOrder().getTotal());
	}
}