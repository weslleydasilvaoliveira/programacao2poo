import java.util.Locale;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int senhaCorreta = 2002, senhaDigitada=0;
	    
		System.out.print("Digite a senha: ");
		
		while(senhaDigitada != senhaCorreta){
		    senhaDigitada = sc.nextInt();
		    if(senhaDigitada == senhaCorreta)
		        System.out.println("Acesso permitido!");
		    else
		        System.out.print("Senha Invalida! Tente novamente: ");
		}
		sc.close();
	}
}
