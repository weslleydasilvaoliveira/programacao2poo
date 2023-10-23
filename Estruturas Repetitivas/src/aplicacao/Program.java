package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		java.util.Scanner sc = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Excluir");
			System.out.println("4 - Sair");
			
			op = sc.nextInt();
		}while(op !=4);
	}
}
