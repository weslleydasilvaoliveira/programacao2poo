import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double price;
		int quantity;
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Name: ");
		price = sc.nextDouble();
		System.out.print("Name: ");
		quantity = sc.nextInt();
	}
}
