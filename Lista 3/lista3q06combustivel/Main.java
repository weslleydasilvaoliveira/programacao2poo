import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int value=1, alcohol=0, gas=0, diesel=0;
	    
	    System.out.println("1.Álcool\n2.Gasolina\n3.Diesel\n");
        
        while(value !=4){
            System.out.print("Informe um codigo: ");
            value = sc.nextInt();
            
            if(value == 1)
                alcohol++;
            else if(value == 2)
                gas++;
            else if(value == 3)
                diesel++;
        }
        
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + diesel);
	}
}
