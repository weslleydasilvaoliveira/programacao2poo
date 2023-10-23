import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
	    String nome1,nome2;
	    int idade1,idade2;
	    double media;
	    
		System.out.print("Digite o nome da primeira pessoa: ");
		nome1=sc.nextLine();
		System.out.print("Digite a idade de "+nome1+": ");
		idade1=sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome da segunda pessoa: ");
		nome2=sc.nextLine();
		System.out.print("Digite a idade de "+nome2);
		idade2=sc.nextInt();
		sc.nextLine();
		sc.close();
		
		media=(double)(idade1+idade2)/2;
		
		System.out.println("A media das idades de "+nome1+" e "+nome2+" eh "+media);
	}
}