package numeros_pares;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("How many numbers will you type up: ");
		n = sc.nextInt();
		ArrayList<Integer> pairNumbers = new ArrayList<>();
		
		int numbers[] = new int[n];
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
			System.out.printf("Type the %d%s integer number: ",i+1,p);
			numbers[i] = sc.nextInt();
			if(numbers[i]%2==0)
				pairNumbers.add(numbers[i]);
		}
		
		sc.close();
		
		System.out.print("PAIR NUMBERS: ");
		for (int i : pairNumbers) {
			System.out.print(i);
			System.out.print("  ");
		}
		System.out.println();
		System.out.print("QUANTITY OF PAIR NUMBERS: " + pairNumbers.size());
	}
}
