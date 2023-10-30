package maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("How many numbers will you type: ");
		n = sc.nextInt();
		
		double numbers[] = new double[n];
		
		for(int i=0; i<n; i++) {
			String p = "";
			if(i == 0)
				p = "st";
			else if(i == 1)
				p = "nd";
			else if(i == 2)
				p = "rd";
			else
				p = "th";
			System.out.printf("Type the %d%s floating point number: ",i+1,p);
			numbers[i] = sc.nextDouble();
		}
		
		sc.close();
		
		double majorNumber = numbers[0];
		int positionMajorNumber = 0;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>majorNumber) {
				majorNumber = numbers[i];
				positionMajorNumber = i;
			}
		}
		
		System.out.println("\nMajor number: " + majorNumber);
		System.out.println("Position of major number: " + positionMajorNumber);

	}
}
