import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int n, fatorial = 1;
	    
		System.out.print("Digite um numero para obter seu fatorial: ");
		n = sc.nextInt();
		
		while(n < 0 || n > 15){
		    System.out.print("O numero deve ser um numero natural e nao maior que 15. Tente novamente: ");
		    n = sc.nextInt();
		}
		
		while(n > 0){
		    fatorial = fatorial * n;
		    n--;
		}
		System.out.println("Fatorial = " + fatorial);
		
	}
}

