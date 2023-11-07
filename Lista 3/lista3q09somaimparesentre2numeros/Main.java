import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0, aux, soma = 0;
		
		System.out.print("Digite o 1º numero: ");
		a = sc.nextInt();
		System.out.print("Digite o 2º numero: ");
		b = sc.nextInt();
		
		if(b < a){ //para simplificar, colocarei valor o menor sempre em 'a'.
		    aux = a;
		    a = b;
		    b = aux;
		}
		
		if(a == b)
		    System.out.println("Os valores não podem ser iguais.");
		else if(b % 2 != 0 && a % 2 != 0 && b - a < 3)
		    System.out.println("Nao ha numeros inteiros impares entre " + a + " e " + b + ".");
		else if(b - a < 2)
		     System.out.println("Nao ha numeros inteiros entre " + a + " e " + b + ".");
		else{
		    a += 1; // para que a verificação comece somente no próximo inteiro (a+1)
		    for(; a < b; a++){
		        if(a % 2 != 0)
		            soma += a;
		    }
		    System.out.println("SOMA DOS IMPARES = " + soma);
		}
		
		
	}
}
