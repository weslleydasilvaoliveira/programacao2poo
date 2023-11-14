package order;

import java.time.LocalDate;

public class Cliente {
	private String nome;
	private String email;
	private LocalDate nascimento;
	private Order order;
	
	public Cliente(String nome, String email, LocalDate nascimento, Order order) {
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
		this.order = order;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", nascimento=" + nascimento + "]";
	}
	

}
