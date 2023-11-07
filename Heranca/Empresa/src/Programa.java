import java.util.Locale;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Funcionario fNormal = new Funcionario("Wellington Silva",10, 100);
		Terceirizado terceirizado = new Terceirizado("John Constatine", 10, 100,1.1);
		
		System.out.println("FUNCIONARIOS:");
		System.out.println(fNormal.getNome());
		System.out.println(fNormal.pagamento());	
		
		System.out.println("\nFUNCIONARIOS TERCEIRIZADOS0:");
		System.out.println(terceirizado.getNome());
		System.out.println(terceirizado.pagamento());
	}
}
