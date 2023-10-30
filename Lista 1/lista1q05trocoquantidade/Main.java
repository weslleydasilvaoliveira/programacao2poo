import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precoProduto=0.00;
		int quantidade=0;
		double total=0.00;
		double troco=0.00;
		double valorEmDinheiro=0.00;
		
		System.out.print("Digite o preço unitário do produto: ");
		precoProduto = sc.nextDouble();
		System.out.print("Digite a quantidade: ");
		quantidade = sc.nextInt();
		System.out.print("Digite o valor em dinheiro recebido do cliente: ");
		valorEmDinheiro = sc.nextDouble();
		total = (double) precoProduto * quantidade;
		troco = valorEmDinheiro - total;
		
		System.out.printf("O valor do troco é %.2f\n",troco);
		
	}
}