import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double x = 100, y = 100;
	    String position;
		while(x != 0 && y != 0){
		    
		    System.out.println("Digite os valores das coordenadas X e Y: ");
		    
		    x = sc.nextDouble();
		    y = sc.nextDouble();
		    
            if(x > 0 && y > 0)
    		    position = "Quadrante Q1";
    		else if(x > 0 && y < 0)
    		    position = "Quadrante Q4";
            else if(x < 0 && y < 0)
                position = "Quadrante Q3";
            else
                position = "Quadrante Q2";
            
            if(x != 0 && y != 0)    
                System.out.println(position);
		}
	}
}