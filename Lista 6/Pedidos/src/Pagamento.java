public abstract class Pagamento {
	private static Integer count = 0;
	private Integer id;
	private EstadoPagamento estado;

	public Pagamento(EstadoPagamento estado) {
		this.id = ++count;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public EstadoPagamento getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Pagamento " + "[" + id + "]" + " estado = " + estado;
	}
}