import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double a = 0, b = 0, c = 0;
		
		System.out.print("Quantas medias ponderadas você fara? ");
		n = sc.nextInt();
		
		for(i = 0; i < n; i++){
	        System.out.printf("Digite o 1º valor: ");
	        a = sc.nextDouble()*2;
	        System.out.printf("Digite o 2º valor: ");
	        b = sc.nextDouble()*3;
	        System.out.printf("Digite o 3º valor: ");
	        c = sc.nextDouble()*5;
	        
	        a = (a + b + c)/10;
            System.out.printf("MEDIA = %.1f\n", a);
		}
	}
}
