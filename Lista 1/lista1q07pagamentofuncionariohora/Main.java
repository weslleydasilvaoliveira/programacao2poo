import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);

        String nome = "";
        double valorHora = 0.0;
        double horasTrabalhadas = 0.0;
        double pagamento = 0.0;

		System.out.print("Digite o nome do(a) funcionario(a): ");
		nome = sc.nextLine();
		System.out.printf("Digite o valor da hora de %s: ", nome);
		valorHora = sc.nextDouble(); //não precisa "limpar" o buffer, pois não irá ler-se String após ler numéricos
		System.out.printf("Digite a quantidade de horas trabalhadas por %s: ", nome);
		horasTrabalhadas = sc.nextDouble();//Double para aceitar frações de horas
		sc.close();//fecha Scanner sc
		
		pagamento = valorHora * horasTrabalhadas;
		
		System.out.printf("O pagamento para %s deve ser R$%.2f\n", nome, pagamento);
		
	}
}
