import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int idade = 0, count=1;
	    double media=0;
	    
	    System.out.println("Digite as idades:");
	    idade = sc.nextInt();
	    media += idade;
	    
	    if(idade<0)
	        System.out.println("IMPOSSIVEL CALCULAR!");
	    else{
    	    while(idade >= 0){
    	        idade = sc.nextInt();
    	        if(idade>=0){
    	            media += idade;
    	            count++;
    	        }
    	    }
	        System.out.println("MEDIA = " + (double)media/count);
	    }
	}
}
