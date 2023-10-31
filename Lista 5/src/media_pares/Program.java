package media_pares;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class Program{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        
        int[] numeros = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.print("Digite o " + (i+1) + "o valor: ");
            numeros[i] = sc.nextInt();
        }
        
        sc.close();
        
        ArrayList<Integer>numerosPares = new ArrayList<>();
        
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]%2==0)
                numerosPares.add(numeros[i]);
        }
        
        double mediaPares = 0;
        
        if(numerosPares.size()==0)
            System.out.println("NENHUM NUMERO PAR");
        else{
            for(Integer i: numerosPares){
                mediaPares+=(double)i/numerosPares.size();
            }
            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
        }
    }
}