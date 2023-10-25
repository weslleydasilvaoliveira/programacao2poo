import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double glicose;
	    
		System.out.print("Digite a quantidade de glicose (gm/dl): ");
		glicose = sc.nextDouble();
		if(glicose <=100.00)
		    System.out.println("Classificacao: normal");
	    else if(glicose <=140.00)
		    System.out.println("Classificacao: elevado");
		else
		    System.out.println("Classificacao: diabetes");
	}
}
