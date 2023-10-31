package abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementeos vai ter o vetor? ");
        int n = sc.nextInt();
                
        double[] numeros = new double[n];
        
        for(int i=0; i<n; i++){
            System.out.print("Digite o " + (i+1) + "o valor: ");
            numeros[i] = sc.nextDouble();
        }
        
        sc.close();
        
        double media = 0;
        
        for(int i=0; i<numeros.length; i++){
            media += numeros[i];         
        }
        
        media = media/numeros.length;
        
        System.out.printf("MEDIA DO VETOR: %.3f\n",media);
        
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]<media)
                System.out.printf("%.1f\n",numeros[i]);
        }
    
    }
}