import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double nota1 = 11, nota2 = 11, media;
	    
		System.out.print("Digite a 1ª nota: ");
		
		while(nota1 < 0 || nota1 > 10){
		    nota1 = sc.nextDouble();
		    
		    if(nota1 < 0 || nota1 > 10)
		        System.out.print("Valor invalido! Tente novamente (1ª nota): ");
		    else
		        System.out.println("Nota 1 atribuida com sucesso!");
		}
		
		System.out.print("Digite a 2ª nota: ");
		
		while(nota2 < 0 || nota2 > 10){
		    nota2 = sc.nextDouble();
		    
		    if(nota2 < 0 || nota2 > 10)
		        System.out.print("Valor invalido! Tente novamente (2ª nota): ");
		    else
		        System.out.println("Nota 2 atribuida com sucesso!");
		}
		
		media = (nota1 + nota2)/2;
		
	System.out.println("MEDIA = " + media);
		
	}
}
