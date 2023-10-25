package negativos;

import java.util.Locale;
import java.util.Scanner;
public class Program{
	@SuppressWarnings("removal")
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar: ");
		
		int n=11;
		while(n>10 || n<0){
			n = sc.nextInt();
			if(n>10)
				System.out.print("A quantidade não pode ser maior que 10. Tente novamente: ");
			else if(n<0)
				System.out.print("A quantidade nao pode ser um numero negativo. Tente novamente: ");
		}
			
		
		Integer[] numeros = new Integer[n];

		for(int i=0; i<n; i++){
			System.out.print("Digite o " + (i+1) + "o numero: ");
			int num = sc.nextInt();
			numeros[i] = new Integer(num);// i did'nt find another way to do that; i mean, i didn't get the gave note
		}
		sc.close();//fecha canal de leitura

		System.out.println("NUMEROS NEGATIVOS");
		for(int i=0; i<n; i++){
			if(numeros[i]<0)
				System.out.println(numeros[i]);
		}
		
	}

}