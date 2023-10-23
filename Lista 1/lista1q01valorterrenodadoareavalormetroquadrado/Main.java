import java.util.Locale;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        double areaTerreno=0,largura=0,comprimento=0,valorMetroQuadrado=0,valorTerreno=0;

        System.out.print("Digite a largura do terreno: ");
        largura=sc.nextDouble();
        sc.nextLine();//limpa Buffer
        System.out.print("Digite o comprimento do terreno: ");
        comprimento=sc.nextDouble();
        sc.nextLine();//limpa buffer
        System.out.print("Digite o valordo metro quadrado: ");
        valorMetroQuadrado=sc.nextDouble();
        sc.nextLine();//limpa buffer
        
        areaTerreno=largura*comprimento;
        valorTerreno=areaTerreno*valorMetroQuadrado
        
        System.out.printf("Área do terreno: %.2f\n",areaTerreno);
        System.out.printf("Preço do Terreno: %.2f\n",valorTerreno);
    }
}