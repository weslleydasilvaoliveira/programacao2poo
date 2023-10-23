package entities;

public class CurrencyConverter{
	private static final double percent = 0.06;
	
	//methods
	public static double pagarEmReais(double dollarValue, double quantite){
		return dollarValue * quantite * (1 + percent);
	}
}
