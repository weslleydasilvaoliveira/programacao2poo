import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double a = 0, b = 0, c=0, quadrado = 0, triangulo = 0, trapezio = 0;
	    
		System.out.print("Digite a medida A: ");
		a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		b = sc.nextDouble();
        System.out.print("Digite a medida C: ");
	    c = sc.nextDouble();
	    sc.close();
	    quadrado = a*a;
	    triangulo = a*b/2;
	    trapezio = (a+b)*c/2;
	    
	    System.out.printf("AREA DO QUADRADO = %.4f\n", quadrado);
	    System.out.printf("AREA DO TRIANGULO = %.4f\n", triangulo);
	    System.out.printf("AREA DO TRAPEZIO = %.4f\n", trapezio);
	    
	}
}
