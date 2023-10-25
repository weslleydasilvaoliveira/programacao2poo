import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    int x = 1, soma = 0, i = 2;
	    
	    while(x!=0){
	        System.out.print("Digite um número inteiro: ");
	        x = sc.nextInt();
	        soma = 0;
            
            if(x != 0){
    	        if(x %2 != 0)
    	            x += 1;
    	        soma = x;
    	        for(i = 2; i < 10; i = i + 2){
    	            System.out.println("X: " +  x);
    	            soma += x + i;
    	        }
    	        System.out.println("Soma: " + soma);
            }
	        
	    }
		
	}
}
