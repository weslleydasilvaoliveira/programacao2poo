import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		int age, n;
		double sum = 0.0;

		System.out.print("Digite o numero de alunos que serao cadastrados: ");
		n = sc.nextInt();
		sc.nextLine();
		
		Student[] students = new Student[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome do aluno: ");
			name = sc.nextLine();
			System.out.print("Digite a idade de " + name + " : ");
			age = sc.nextInt();
			sc.nextLine();
			
			Student s = new Student(name, age);
			students[i] = s;
			
			sum += students[i].getAge();
		}
		
		sc.close();
		
		System.out.println("A media das idades e " + sum/n);
	}
}
