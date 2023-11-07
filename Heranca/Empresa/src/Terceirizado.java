
public class Terceirizado extends Funcionario {
	private double taxaAdicional;
	
	public Terceirizado(String nome, double valorHora, double horasTrabalhadas, double taxaAdicional) {
		super(nome, valorHora, horasTrabalhadas);
		this.taxaAdicional = taxaAdicional;
	}

	public double getTaxaAdicional() {
		return taxaAdicional;
	}

	public void setTaxaAdicional(double taxaAdicional) {
		this.taxaAdicional = taxaAdicional;
	}
	@Override
	public double pagamento(){
		double salario = super.pagamento();
		salario+=salario*taxaAdicional;
		return salario;
	}
	
	@Override
	public String toString() {
		return "Terceirizado [taxaAdicional=" + taxaAdicional + "]";
	}
}
