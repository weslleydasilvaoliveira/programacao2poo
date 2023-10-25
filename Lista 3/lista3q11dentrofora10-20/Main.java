import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int limiteInferior = 10, limiteSuperior = 20, n, i = 0,x = 0, dentro = 0, fora = 0;
	    
		System.out.print("Quantos numeros voce ira digitar? ");
		n = sc.nextInt();
		for(; i < n; i++){
		    System.out.print("Digite o " + (i + 1) + "º " + "numero: ");
		    x = sc.nextInt();
		    if(x < 21 && x > 9)
		        dentro++;
		    else
		        fora++;
		}
		System.out.println("Dentro: " + dentro);
		System.out.println("Fora: " + fora);
		
		sc.close();
	}
}
