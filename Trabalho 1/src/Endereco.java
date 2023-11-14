public class Endereco {
	private int id;
	private static int count = 0;
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String bairro;
	
	public Endereco (){
		id = ++count;
	}

	public Endereco(String logradouro, Integer numero, String complemento, String bairro) {
		id = ++count;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Endereco [id = " + id + "]" +
				"\nlogradouro = " + logradouro + 
				"\nnumero = " + numero + 
				"\ncomplemento = " + complemento + 
				"\nbairro = " + bairro + "";
	}
}