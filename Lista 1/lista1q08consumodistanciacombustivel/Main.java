import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double km = 0, combustivelGasto = 0, consumoMedio = 0; 
        
		System.out.print("Digite a quantidade de Quilometros (Km) percorridos: ");
		km = sc.nextDouble();
		System.out.print("Digite a quantidade de combustivel gasta: ");
		combustivelGasto = sc.nextDouble();
		sc.close();
		
		consumoMedio = km/combustivelGasto;
		
		System.out.printf("O consumo medio de combustivel por Km foi %.3f\n",consumoMedio);
	}
}
