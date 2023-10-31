package comerciante;

import java.util.Locale;
import java.util.Scanner;
public class Program{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome="";
		double precoCompra=0, precoVenda=0;
		
		System.out.print("Quantos produtos serao digitados? ");
		int n = sc.nextInt();
		
		
		Mercadoria[] mercadorias = new Mercadoria[n];
		
		for(int i=0; i<n; i++){
			sc.nextLine();//clássico
			System.out.print("Nome do produto " + (i+1) + ": ");
			nome = sc.nextLine();
			System.out.print("Preco de compra do(a) " + nome + " : ");
			precoCompra = sc.nextDouble();
			System.out.print("Preco de venda do(a) " + nome + " : ");
			precoVenda = sc.nextDouble();
			
			Mercadoria m = new Mercadoria(nome, precoCompra, precoVenda);
			mercadorias[i] = m;
		}

		sc.close();

		int menosQue10Percent = 0, de10a20Percent = 0, maisQue20Percent = 0;
		double totalCompra = 0, totalVenda = 0;
		
		for(int i=0; i<n; i++){
			if((mercadorias[i].getPrecoVenda() - mercadorias[i].getPrecoCompra())/n<0.1)
				menosQue10Percent++;
			else if((mercadorias[i].getPrecoVenda() - mercadorias[i].getPrecoCompra())/n<=20)
				de10a20Percent++;
			else
				maisQue20Percent++;
			
			totalCompra += mercadorias[i].getPrecoCompra();
			totalVenda += mercadorias[i].getPrecoVenda();
		}

		System.out.println("RELATORIO:");		

		System.out.println("Lucro abaixo de 10%: " + menosQue10Percent);
		System.out.println("Lucro entre 10% e 20%: " + de10a20Percent);
		System.out.println("Lucro acima de 20%: " + maisQue20Percent);

		System.out.println("Valor total de compra: " + totalCompra);
		System.out.println("Valor total de venda: " + totalVenda);
		
	}
	
}

