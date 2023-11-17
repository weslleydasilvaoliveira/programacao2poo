public class Categoria {
	private static Integer count=0;
	private Integer id;
	private String nome;

	public Categoria() {
	}

	public Categoria(String nome) {
		this.id = ++count;
		this.nome = nome;
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

	@Override
	public String toString() {
		return "Categoria [" + id + "] " + nome;
	}
}