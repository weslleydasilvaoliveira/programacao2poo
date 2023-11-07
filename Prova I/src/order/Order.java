package order;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
	private LocalDateTime momento;
	private String staus;
	ArrayList<OrderItem>orderItems = new ArrayList<>();
	
	public Order(LocalDateTime momento, String staus) {
		this.momento = momento;
		this.staus = staus;
	}	
	
	public void addItem(OrderItem orderItem) {
		this.orderItems.add(orderItem);
	}
	public void removeItem(OrderItem orderItem) {
		this.orderItems.remove(orderItem);
	}
	public double getTotal() {
		double tot = 0;
		for(OrderItem oI: orderItems) {
			tot+=oI.subTotal();
		}
		return tot;
	}
	public LocalDateTime getMomento() {
		return momento;
	}
	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}
	public String getStaus() {
		return staus;
	}
	public void setStaus(String staus) {
		this.staus = staus;
	}
	@Override
	public String toString() {
		return "Order [momento=" + momento + ", staus=" + staus + "]";
	}
}
