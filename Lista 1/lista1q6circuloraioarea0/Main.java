import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double raio=0;
	    double area=0;
	    
		System.out.print("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();
		area = raio*raio*Math.PI;
		sc.close();
		System.out.printf("A area do circulo eh %.3f\n",area);//a última casa decimal é exibida arredondada (lastDecial >= 5 ? arround+ : arround-)
	}
}
