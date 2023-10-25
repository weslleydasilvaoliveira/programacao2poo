import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int a, b, c, minor;
	    
		System.out.print("Digite o primeiro numero: ");
		a = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		b = sc.nextInt();
		System.out.print("Digite o terceiro numero: ");
		c = sc.nextInt();
		
		minor = a;
		if(!(b > a))
		    minor = b;
		if(!(c > minor))
		    minor = c;
		
		System.out.printf("MENOR: %d\n", minor);
		
	}
}
