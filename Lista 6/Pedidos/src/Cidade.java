public class Cidade {
	private static Integer count = 0;
	private Integer id;
	private String nome;
	private Estado estado;

	public Cidade() {
	}

	public Cidade(String nome, Estado estado) {
		this.id = ++count;
		this.nome = nome;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cidade " + " [" + id + "]" + nome + " estado = " + estado;
	}
}
