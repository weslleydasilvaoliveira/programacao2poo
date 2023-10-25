import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int codigo, quantidade;
	    double preco = 0, total; 
	    
	    System.out.println(" _______________________________");
	    System.out.println("| Código |  Preço do produto\t|");
	    System.out.println(" -------------------------------");
	    System.out.println("|   1    |\tR$ 5.00\t \t|");
	    System.out.println("|   2    |\tR$ 3.50\t \t|");
        System.out.println("|   3    |\tR$ 4.80\t \t|");
        System.out.println("|   4    |\tR$ 8.90\t \t|");
        System.out.println("|   5    |\tR$ 7.32\t \t|\n\n");
        
        System.out.print("Codigo do produto comprado: ");
        codigo = sc.nextInt();
        
        switch(codigo){
            case 1: preco = 5.00; break;
            case 2: preco = 3.50; break;
            case 3: preco = 4.80; break;
            case 4: preco = 8.90; break;
            case 5: preco = 7.32; break;
        }
        
        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();
        total = (double) preco * quantidade;
        System.out.printf("Valor a pagar: R$ %.2f\n", total);

		    
		
	}
}