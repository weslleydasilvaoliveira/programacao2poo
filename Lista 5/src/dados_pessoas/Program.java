package dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String sexo = "";
        double altura = 0;
        
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        
        Pessoa[] pessoas = new Pessoa[n];
        
        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            altura = sc.nextDouble();
            System.out.print("Sexo da " + (i+1) + "a pessoa: ");
            sexo = sc.NextLine();
            sexo = sexo;
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
                
            if(pessoas[i].getSexo()[0]=='F'){
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
        System.out.ptintln("Quantidade de homens: " + quantidadeHomens);
    }
}

public class Pessoa{
    private String sexo;
    private double altura;
    
    public Pessoa(altura, sexo){
        this.altura = altura;
        this.sexo = sexo;
    }
    
    public double getAltura(){
        return this.altura();
    }
    public void setAltura(altura){
        this.altura = altura;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(sexo){
        this.sexo = sexo;
    }
}