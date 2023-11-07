import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int minutos;
	    double fatura=50;
	    
		System.out.print("Entre com a quantidade de minutos: ");
		minutos = sc.nextInt();
		if(minutos > 100)
		    fatura += (minutos - 100)*2;
		System.out.printf("Valor a pagar: R$ %.2f\n", fatura);
	}
}
