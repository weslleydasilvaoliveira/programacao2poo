package Funcionarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionarios serao registrados? ");
		
		int n = sc.nextInt();
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		for (int i=1;i<=n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Funcionario e = new Funcionario(id, name, salary);
			
			funcionarios.add(e);
		}
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionarios);
		}
		
		
	}
	
	public static boolean hasId(List<Funcionario> list,int id) {
		return false;
	}
}
