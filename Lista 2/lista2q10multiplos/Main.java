import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int a, b;
	    
		System.out.println("Digite 2 números inteiros:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0)
		    System.out.println("Sao multiplos");
		else
		    System.out.println("Nao sao multiplos");
	}
}
