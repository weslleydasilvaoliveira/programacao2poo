import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    char escala;
	    double temp, convert;
	    
		System.out.print("Escolha a escala de temperatura (C/F): ");
	    escala = sc.next().charAt(0);
	    
		switch(escala){
		    case 'C':
		        System.out.print("Digite a temperatura em Celsius: ");
		        temp = sc.nextDouble();
		        convert = temp*9/5 + 32;
		        System.out.printf("Temperarura equivalente em Fahrenheit: %.2f\n", convert);
		        break;
		    case 'F':
		        System.out.print("Digite a temperatura em Fahrenheit: ");
		        temp = sc.nextDouble();
		        convert = (temp - 32)*5/9;
		        System.out.printf("Temperatura equivalnte em Celsius: %.2f\n", convert);
		        break;
		    default:
		        System.out.println("Verifique se voce inseriu comrretamente os dados em formato numerico e a opcao de escala em maisculo");
		}
		    
		
	}
}