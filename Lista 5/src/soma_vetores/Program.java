package soma_vetores;

import java.util.Locale;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores cada vetor ira guardar: ");
		int n = sc.nextInt();
		
		//asumirei que os valores são do tipo inteiro
		int a[] = new int[n], b[] = new int[n], c[] = new int[n];
		
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i=0; i<n; i++) {
			System.out.print((i+1) + "o: ");
			a[i] = sc.nextInt();
		}
		System.out.println("Agora digite os valores do vetor B: ");
		for(int i=0; i<n; i++) {
			System.out.print((i+1) + "o: ");
			b[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			c[i] = a[i] + b[i];
		}
		System.out.println("VETOR RESULTANTE: ");
		for(int i=0; i<n; i++) {
			System.out.println(c[i]);
		}
	}
}
