package entidades;

import java.util.ArrayList;

public class RH {
	ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
	
	void cadastrar(Funcionario f) {
		funcs.add(f);
	}
	
	void excluir() {
		funcs.remove();
	}
}
