import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double x, y;
	    String position;
	    
		System.out.print("Valor de X: ");
		x = sc.nextDouble();
		System.out.print("Valor de Y: ");
		y = sc.nextDouble();
		
		if(x == 0 && y == 0)
		    position = "Origem";
		else if(x == 0)
		    position = "Eixo X";
		else if(y == 0)
		    position = "Eixo Y";
		else if(x > 0 && y > 0)
		    position = "Q1";
		else if(x > 0 && y < 0)
		    position = "Q4";
        else if(x < 0 && y < 0)
            position = "Q3";
        else
            position = "Q2";
            
        System.out.println(position);
	}
}
