import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int n = 0, adder = 1, i = 1;
	    
	    System.out.print("Digite um número inteiro: ");
	    n = sc.nextInt();

	    if(n <= 0)
	        adder = -1; //atende a número negativo, para contar de 1 até o inteiro negativo (decrescente)
	   
	   for(; i != n + adder; i = i + adder)
	        if(i % 2 != 0)
	            System.out.println(i);
	}
}
