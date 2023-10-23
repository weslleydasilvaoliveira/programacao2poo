import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;
public class Program{
	
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double width, height;

		System.out.println("Entre com largura e altura do retangulo: ");
		width = sc.nextDouble();
		height = sc.nextDouble();
		sc.close();
		Rectangle r = new Rectangle(width, height);
		
		System.out.println("AREA = " + r.area());
		System.out.println("PERIMETRO = " + r.perimeter());
		System.out.println("DIAGONAL = " + r.diagonal());
	}	
}

