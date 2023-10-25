import java.util.Locale;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double salary;
	    double percent;
	    double aumento;
	    
	    System.out.print("Digite o valor do salário: ");
	    salary = sc.nextDouble();
	    sc.close();
	    aumento = salary;
	    
	    if(salary>=0 && salary<=1000){
	        percent=.2;
	        aumento=salary*percent;
	        salary+=aumento;
	    }else if(salary<=3000){
	        percent=.15;
	        aumento=salary*percent;
	        salary+=aumento;
	    }else if(salary<=8000){
	        percent=.1;
	        aumento=salary*percent;
	        salary+=aumento;
	    }else{
	        percent=.05;
	        aumento=salary*percent;
	        salary+=aumento;
	    }
	    
	    System.out.printf("Novo salário: %.2f\n",salary);
	    System.out.printf("Porcentagem do aumento: %d%%%n",(int)(percent*100));
	    System.out.printf("Aumento: %.2f\n",aumento);
        	    

	}
}
