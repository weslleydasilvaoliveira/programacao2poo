import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;
public class Program{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollarValue, quantite;

		System.out.print("Qual o valor do dollar? ");
		dollarValue = sc.nextDouble();
		System.out.print("Quantos dolares serao comprados? ");
		quantite = sc.nextDouble();
		sc.close();
		
		System.out.printf("Valor a ser pago em reais = %.2f\n", CurrencyConverter.pagarEmReais(dollarValue, quantite)); 
	}
}