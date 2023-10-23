import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc=new Scanner(System.in);
	    
	    int x,y;
	    
		System.out.print("Digite um valor inteiro para X: ");
		x=sc.nextInt();
		System.out.print("Digite um valor inteiro para Y: ");
		y=sc.nextInt();
		
		System.out.printf("A soma dos dois numeros eh %d",x+y);
	}
}
