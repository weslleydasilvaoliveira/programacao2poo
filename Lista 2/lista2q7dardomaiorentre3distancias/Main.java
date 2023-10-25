import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double d1, d2, d3, maior;
	    
		System.out.println("Digite as 3 distancias:");
	    d1 = sc.nextDouble();
	    d2 = sc.nextDouble();
	    d3 = sc.nextDouble();
	    maior = d1;
		if(d2 > maior)
		    maior = d2;
		if(d3 > maior)
		    maior = d3;
		    
		System.out.println("MAIOR DISTANCIA: " + maior);
	}
}