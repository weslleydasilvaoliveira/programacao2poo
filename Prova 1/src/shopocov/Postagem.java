package shopocov;

import java.time.LocalDateTime;

public class Postagem {
	private static int qtd = 0;
	private int id;
	private String text;
	private LocalDateTime instante;

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = ++qtd;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDateTime getInstante() {
		return instante;
	}
	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}
	@Override
	public String toString() {
		return "Postagem [ id=" + id + ", text=" + text + ", instante=" + instante + "]";
	}
		
}