import java.util.Locale;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double n1 = 0.0, n2 = 0.0, notaFinal = 0.0;
        
        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.print("Digite a segnda noTa: ");
        n2 = sc.nextDouble();
        notaFinal = n1 + n2;
        System.out.printf("NOTA FINAL: %.1f\n", notaFinal);
        if(notaFinal < 60.0)
            System.out.println("REPROVADO");
    }
    
}