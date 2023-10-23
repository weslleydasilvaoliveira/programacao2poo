import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program{
	
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double grade1, grade2, grade3;

		System.out.print("Entre com o nome do aluno: ");
		name = sc.nextLine();
		System.out.print("Entre com a 1ª nota do aluno " + name + " : ");
		grade1 = sc.nextDouble();
		System.out.print("Entre com a 2ª nota do aluno " + name + " : ");
		grade2 = sc.nextDouble();
		System.out.print("Entre com a 3ª nota do aluno " + name + " : ");
		grade3 = sc.nextDouble();
		
		sc.close();
		
		Student s = new Student(name, grade1, grade2, grade3);
		
		System.out.println(s.finalGrade());
		
	}	
}
