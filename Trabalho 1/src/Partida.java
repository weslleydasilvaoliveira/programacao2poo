import java.time.LocalDate;

public class Partida {
	private int id;
	private static int count = 0;
	private LocalDate data;
	private Integer pontuacaoMandante;
	private Integer pontuacaoVisitante;
	private Time mandante;
	private Time visitante;
	
	public Partida() {
		id = ++count;
	}

	public Partida(LocalDate data, Integer pontuacaoMandante, Integer pontuacaoVisitante, Time mandante,
			Time visitante) {
		id = ++count;
		this.data = data;
		this.pontuacaoMandante = pontuacaoMandante;
		this.pontuacaoVisitante = pontuacaoVisitante;
		this.mandante = mandante;
		this.visitante = visitante;
	}
	public Partida(LocalDate data, Time mandante, Time visitante) {
		id = ++count;
		this.data = data;
		this.mandante = mandante;
		this.visitante = visitante;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Integer getPontuacaoMandante() {
		return pontuacaoMandante;
	}

	public void setPontuacaoMandante(Integer pontuacaoMandante) {
		this.pontuacaoMandante = pontuacaoMandante;
	}

	public Integer getPontuacaoVisitante() {
		return pontuacaoVisitante;
	}

	public void setPontuacaoVisitante(Integer pontuacaoVisitante) {
		this.pontuacaoVisitante = pontuacaoVisitante;
	}

	public Time getMandante() {
		return mandante;
	}

	public void setMandante(Time mandante) {
		this.mandante = mandante;
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Partida [id = " + id + "]"+
				"\ndata = " + data + 
				"\npontuacaoMandante = " + pontuacaoMandante +
				"\npontuacaoVisitante = " + pontuacaoVisitante + 
				"\nmandante = " + mandante + 
				"\nvisitante = " + visitante + "\n";
	}
	
	
	


}