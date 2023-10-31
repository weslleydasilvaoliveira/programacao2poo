package aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        String nome="";
        double nota1 = 0, nota2 = 0;
                
        Aluno[] alunos = new Aluno[n];
        
        for(int i=0; i<n; i++){
            sc.nextLine(); //consome o '\n' que está no buffer de leitura
            
            System.out.println("Digite nome, primeira e segunda nota do aluno (cada um seguido da tecla 'Enter'): ");
            
            nome = sc.nextLine();
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            
            alunos[i] = new Aluno(nome, nota1, nota2);
        }
        
        sc.close();
        
        System.out.println("Alunos aprovados: ");
        
        for(int i=0; i<alunos.length; i++){
            if(!((alunos[i].getNota1()+alunos[i].getNota2())/2<6))
                System.out.println(alunos[i].getNome());
        }
    }
}
