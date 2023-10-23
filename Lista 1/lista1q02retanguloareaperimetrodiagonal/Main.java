import java.util.Locale;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        double width,height,perimeter,area,diagonal;
        
        System.out.print("Largura do retangulo: ");
        width=sc.nextDouble();
        sc.nextLine();
        System.out.print("Altura do retangulo: ");
        height=sc.nextDouble();
        sc.nextLine();
        sc.close();
        
        perimeter=2*(width+height);
        area=width*height;
        diagonal=Math.sqrt(Math.pow(width,2)+Math.pow(height,2));//Pitágoras
        
        System.out.println();//salta linha
        System.out.printf("AREA = %.4f\n",area);
        System.out.printf("PERIMETRO = %.4f\n",perimeter);
        System.out.printf("DIAGONAL = %.4f\n",diagonal);
    }
}
