import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    int n, i;
	    double a = 0, b = 0;
	    
		System.out.print("Quantas divisões voce fara? ");
		n = sc.nextInt();
		
		for(i = 0; i < n; i++){
		    System.out.print("Digite o 1º número: ");
		    a = sc.nextDouble();
		    System.out.print("Digite o 2º número: ");
		    b = sc.nextDouble();
		    
		    if(b == 0)
		        System.out.println("DIVISÃO IMPOSSIVEL");
		    else
		    System.out.println("RESULTADO DA DIVISAO = " + (a/b));
		}
	}
}
