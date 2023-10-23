import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int segundos = 0, minutos = 0, horas = 0;
	    
		System.out.print("Digite a quantidade de segundos: ");
		segundos = sc.nextInt();
		sc.close();
		horas = segundos/3600;
		segundos = segundos%3600;
		minutos = segundos/60;
		segundos = segundos%60;
		
		System.out.printf("%d : %d : %d\n", horas, minutos, segundos);
	}
}
