import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x=1, y=0;
		
		while(x!=y){
		    System.out.println("Digite dois numeros: ");
		    x = sc.nextInt();
		    y = sc.nextInt();
		    if(x>y)
		        System.out.println("DESCRESCENTE!");
		    else if(y>x)
		        System.out.println("CRESCENTE!");
		}
	}
}
