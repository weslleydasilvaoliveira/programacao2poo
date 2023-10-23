import java.util.Locale;
import java.util.Scanner;
import entities.Conta;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		String holder;
		double balance;
		
		System.out.print("Você vai querer criar já fazendo um deposito?");
		
		Conta conta = new Conta(1, "Manoel Silva");
		
	}
}
