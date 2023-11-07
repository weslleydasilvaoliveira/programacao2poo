import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int n, i, qtd = 0, c = 0, r = 0, s = 0, qtdTotal = 0;
	    char tipo = '\n';
	    
		System.out.print("Quantos casos de teste serão digitados? ");
		n = sc.nextInt();
		for(i = 0; i < n; i++){
		    System.out.print("Quantidade de cobaias: ");
		    qtd = sc.nextInt();
		    qtdTotal += qtd;
		    System.out.print("Tipo de cobaia: ");
		    tipo = sc.next().charAt(0);
		    System.out.println(tipo);
		    
		    if(tipo == 'c' || tipo == 'C')
		        c += qtd;
		    else if(tipo == 'r' || tipo == 'R')
		        r += qtd;
		    else if(tipo == 's' || tipo == 'S')
		        s += qtd;
		}
		sc.close();
		System.out.println("RELATORIO FINAL:");
		System.out.println("Total: " + qtdTotal + " cobaias");
		System.out.println("Total de coelhos: " + c);
		System.out.println("Total de ratos: " + r);
		System.out.println("Total de sapos: " + s);
		System.out.printf("Percentual de coelhos: %.2f\n", (double)c/qtdTotal*100);
		System.out.printf("Percentual de ratos: %.2f\n", (double)r/qtdTotal*100);
		System.out.printf("Percentual de sapos: %.2f\n", (double)s/qtdTotal*100);
	}
}
