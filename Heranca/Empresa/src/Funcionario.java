
public class Funcionario {
	private String nome;
	private double valorHora;
	private double horasTrabalhadas;
	
	public Funcionario(String nome, double valorHora, double horasTrabalhadas) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double pagamento(){
		double salario = this.getHorasTrabalhadas()*this.getValorHora();
		return salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", valorHora=" + valorHora + ", horasTrabalhadas=" + horasTrabalhadas
				+ "]";
	}
	
	
}
