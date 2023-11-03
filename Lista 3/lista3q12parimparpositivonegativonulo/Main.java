import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int n, x = 0, i = 0;
	    String magnitude = "", flag = "";
	    
		System.out.print("Quantos numeros voce ira digitar? ");
		n = sc.nextInt();
		
		for(; i < n; i++){
		    System.out.print("Digite o " + (i + 1) + "ª " + "numero: ");
		    x  = sc.nextInt();
		    
		    if(x == 0)
		        flag = "";
		    else if(x != 0 && x % 2 == 0)
		        flag = "PAR";
		    else
		        flag = "IMPAR";
		        
		    if(x == 0)
		        magnitude = "NULO";
		    else if(x > 0)
		        magnitude = "POSITIVO";
		    else
		        magnitude = "NEGATIVO";
		        
		    System.out.println(flag + magnitude);
		}
	}
}
