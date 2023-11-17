import java.time.LocalDate;

public class PagamentoComBoleto extends Pagamento {
	private LocalDate dataVencimento;
	private LocalDate dataPagamento;

	public PagamentoComBoleto(LocalDate dataVencimento, LocalDate dataPagamento, EstadoPagamento estado) {
		super(estado);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public PagamentoComBoleto(LocalDate dataVencimento, EstadoPagamento estado) {
		super(estado);
		this.dataVencimento = dataVencimento;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	@Override
	public String toString() {
		return "PagamentoComBoleto " + "dataVencimento = " + dataVencimento + ", dataPagamento = " + dataPagamento;
	}
}
