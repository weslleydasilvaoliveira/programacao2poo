import java.time.LocalDate;

public class Jogador {
	private int id;
	private String nome; 
	private LocalDate dataDeNascimento; 
	private String genero;
	private Double altura;
	private static int count = 0;
	
	public Jogador() {
		id = ++count;
	}
	public Jogador(String nome, LocalDate dataDeNascimento, String genero, Double altura) {
		id = ++count;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.genero = genero;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "\n[id=" + id + "]" + 
				" " + nome + 
				" | dataDeNascimento = " + dataDeNascimento + 
				" | genero = " + genero +
				" | altura = " + altura + " | ";
	}
}