import java.util.ArrayList;
import java.util.List;

public class Time {
	private int id;
	private static int count = 0;
	private List<Jogador> jogadores = new ArrayList<>();
	private String nome;
	private Jogador capitao;
	private Estadio estadioSede;
	private int saldoVitorias;
	private int saldoGols;
	/*
	 	pesquisar comparable
	 */
	
	
	public Time () {
		id = ++count;
	}


	public Time( String nome) {
		id = ++count;
		this.nome = nome;
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
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	
	public void addJogador(Jogador j) {
		jogadores.add(j);
	}
	
	public void removeJogadores(Jogador j) {
		jogadores.remove(j);
	}
	
	
	
	public Jogador getCapitao() {
		return capitao;
	}


	public void setCapitao(Jogador capitao) {
		this.capitao = capitao;
	}


	public Estadio getEstadioSede() {
		return estadioSede;
	}


	public void setEstadioSede(Estadio estadioSede) {
		this.estadioSede = estadioSede;
	}


	public int getSaldoVitorias() {
		return saldoVitorias;
	}


	public void setSaldoVitorias(int saldoVitorias) {
		this.saldoVitorias = saldoVitorias;
	}


	public int getSaldoGols() {
		return saldoGols;
	}


	public void setSaldoGols(int saldoGols) {
		this.saldoGols = saldoGols;
	}
	
	public void saldoVitorias(int pontosMandante, int pontosVisitante) {
	    if (pontosMandante > pontosVisitante) {
	        this.saldoVitorias++;
	    } else if (pontosMandante < pontosVisitante) {
	        this.saldoVitorias--;
	    } else {
	        this.saldoVitorias = 0;
	    }
	}


	@Override
	public String toString() {
		String string = "\nTime [id=" + id + "]\n" +
				"nome = " + nome + 
				"\nestadioSede = " + estadioSede +
				"jogadores:";
		for (Jogador jogador : jogadores) {
			string += jogador;
		}
		string += "\nCapitao do time = " + capitao.getNome() +
			"\nsaldoVitorias = " + saldoVitorias + 
			"\nsaldoGols = " + saldoGols + "\n";
		return string;
	}	
}