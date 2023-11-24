public class PagamentoComCartao extends Pagamento {
	private Integer numeroDeParcelas;

	public PagamentoComCartao(Integer numeroDeParcelas, EstadoPagamento estado) {
		super(estado);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	@Override
	public String toString() {
		return "PagamentoComCartao " + " numeroDeParcelas = " + numeroDeParcelas;
	}
}
