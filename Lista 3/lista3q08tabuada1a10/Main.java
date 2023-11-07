import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int n = 0, i = 1;
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		for(; i < 11; i++)
		    System.out.println(n + " x " + i + " = " + (n * i));
	}
}
