public class Estado {
	private static Integer count=0;
	private Integer id;
	private String nome;

	public Estado() {
	}

	public Estado(String nome) {
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
		return "[" + id + "] " + nome;
	}
}
