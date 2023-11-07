import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, deltaAoQuadrado, x1, x2;
		
		System.out.print("Coeficiente a: ");
		a = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		c = sc.nextDouble();
		
		deltaAoQuadrado = b*b + (-4*a*c);
		
		if(deltaAoQuadrado < 0){
		    System.out.println("Esta equacao nao possui raizes reais.");
		}else{
    		delta = Math.sqrt(deltaAoQuadrado);
    		x1 = ((-1)*b+delta)/(2*a);
    		System.out.printf("x1 = %.4f\n", x1);
    		x2 = ((-1)*b-delta)/(2*a);
    		System.out.printf("x2 = %.4f\n", x2);
    	}
	}
}
