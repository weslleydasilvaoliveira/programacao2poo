public class Estadio {
	private int id;
	private static int count = 0;
	private Endereco enderecoEstadio;
	private String nome;
	
	public Estadio () {
		id = ++count;
	}

	public Estadio(Endereco enderecoEstadio, String nome) {
		id = ++count;
		this.enderecoEstadio = enderecoEstadio;
		this.nome = nome;
	}

	public Endereco getEnderecoEstadio() {
		return enderecoEstadio;
	}

	public void setEnderecoEstadio(Endereco enderecoEstadio) {
		this.enderecoEstadio = enderecoEstadio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Estadio [id=" + id + "]"
				+ "\nendereco do Estadio = " + enderecoEstadio 
				+ "\nnome = " + nome + "\n";
	}
}