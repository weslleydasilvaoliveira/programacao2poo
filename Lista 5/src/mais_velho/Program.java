package mais_velho;

import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        
        String[] nomes = new String[n];
        int[] idades = new int[n];
        
        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: \n",i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }
        
        sc.close();
        
        int indiceMaiorIdade = 0;
        int maiorIdade = 0;
        
        for(int i=0; i<idades.length; i++){
            if(idades[i] > maiorIdade){
                maiorIdade = idades[i];
                indiceMaiorIdade = i;
            }
        }
        
        System.out.println("PESSOA MAIS VELHA: " + nomes[indiceMaiorIdade]);
    }
}   
