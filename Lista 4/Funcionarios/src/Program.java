import java.util.Locale;
import java.util.Scanner;

import entitities.Employee;
import java.util.Scanner;
public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		double grossSalary;
		double percent;
		double tax;
		
		System.out.print("Digite o nome do funcionario: ");
		name = sc.nextLine();
		System.out.print("Digite o salario de " + name + ": ");
		grossSalary = sc.nextDouble();
		sc.nextLine();
		System.out.print("Digite o valor do imposto: ");
		tax = sc.nextDouble();
		
		Employee e = new Employee();
		e.name = name;
		e.grossSalary = grossSalary;
		e.tax = tax;
		
		System.out.println("Funcionario: " + e.name + ", " + e.netSalary());
		
		System.out.print("Digite a porcentagem que em que o salario sera aumentado: ");
		percent = sc.nextDouble();
		
		e.increaseSalary(percent);
		
		System.out.println("Dados atualizados: " + e.name + ", " + e.netSalary());
		sc.close();
	}
}
