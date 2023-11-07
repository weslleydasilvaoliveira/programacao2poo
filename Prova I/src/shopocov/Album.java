package shopocov;

import java.util.ArrayList;
import java.time.LocalDateTime;
public class Album {
	private static int count=0;
	private int id;
	private String titulo;
	private LocalDateTime instante;
	private ArrayList<Foto> fotos = new ArrayList<>();
	public Album(String titulo, LocalDateTime instante) {
		this.id = ++count;
		this.titulo = titulo;
		this.instante = instante;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDateTime getInstante() {
		return instante;
	}
	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}
	public void addFoto(Foto foto) {
		this.fotos.add(foto);
	}
	@Override
	public String toString() {
		String string = "Album [id=" + id + ", titulo=" + titulo + ", instante=" + instante + "]\n";
		return string;
	}
	
}
