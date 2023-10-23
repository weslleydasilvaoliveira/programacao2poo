package entities;

public class Conta {
	private int number;
	private String holder;
	private double balance;

	public Conta(int number, String holder) {
		this.number = number;
		this.holder = holder;
		this.balance = 0;
	}
	
	public int getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void withDraw(double amount){
		this.balance -= amount;
	}
}
