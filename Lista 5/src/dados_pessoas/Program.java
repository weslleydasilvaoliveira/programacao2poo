package dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double altura = 0;
        char sexo = '\0';
       
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        
        Pessoa[] pessoas = new Pessoa[n];
        
        for(int i=0; i<n; i++){
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Sexo da " + (i+1) + "a pessoa: ");
            sexo = sc.next().charAt(0);
            pessoas[i] = new Pessoa(altura, sexo);
        }
        
        sc.close();
        
        double maiorAltura = pessoas[0].getAltura();
        double menorAltura = pessoas[0].getAltura();
        
        double mediaAlturaMulheres = 0;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;
        
        for(int i=0; i<n; i++){
            if(pessoas[i].getAltura()>maiorAltura)
                maiorAltura = pessoas[i].getAltura();
            if(pessoas[i].getAltura()<menorAltura)
                menorAltura = pessoas[i].getAltura();
                
            if(pessoas[i].getSexo()=='F'){
                mediaAlturaMulheres += pessoas[i].getAltura();
                quantidadeMulheres++;
            }
            else
                quantidadeHomens++;
        }
        
        mediaAlturaMulheres = (double)mediaAlturaMulheres/quantidadeMulheres;
        
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Media das aluturas das mulheres: %.2f\n", mediaAlturaMulheres);
        System.out.println("Quantidade de homens: " + quantidadeHomens);
    }
}


