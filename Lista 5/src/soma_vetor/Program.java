package soma_vetor;

import java.util.Locale;
import java.util.Scanner;
public class Program{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers are you going to type? ");
		int n = sc.nextInt();
		double numbers[] = new double[n];
 		double sum=0, average=0;

		for(int i=0; i<n;i++){
			String p = "";
			if(i == 0)
				p = "st";
			else if(i == 1)
				p = "nd";
			else if(i == 2)
				p = "rd";
			else
				p = "th";
			System.out.print("Type the " + (i+1) + p + " number: ");
			numbers[i] = sc.nextDouble();
			sum+=numbers[i];
		}
		
		sc.close();//close scan
			
		System.out.print("VALUES = ");
		for(int i=0; i<numbers.length; i++){
			System.out.print(numbers[i]);
			if(i != n-1)
				System.out.print(", ");
		}
		System.out.println("\n");//next line
		average = sum/numbers.length;
		
		System.out.println("SUM = " + sum);
		System.out.println("AVERAGE = " + average);
		
	}
}