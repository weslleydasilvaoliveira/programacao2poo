package alturas;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will you register? ");
		int n = sc.nextInt();

		ArrayList<Person> people = new ArrayList<Person>();

		for (int i = 0; i < n; i++) {
			sc.nextLine();//clear buffer
			System.out.printf("Type the name of the penson %d: ", i + 1);
			String name = sc.nextLine();
			System.out.printf("Type the age of %s: ", name);
			int age = sc.nextInt();
			System.out.printf("Type the height of %s: ", name);
			double height = sc.nextDouble();
			people.add(new Person(name, age, height));
		}

		sc.close();

		double sumHeights = 0;//sums heights for the average
		ArrayList<Person>peopleLessSixteen = new ArrayList<>();//Array to save the ones who are less than sixteen
		
		for (Person person : people) {
			sumHeights += person.getHeight();
			if(person.getAge()<16)
				peopleLessSixteen.add(person);
		}
        
		double averageHeight = sumHeights / people.size();
		
		System.out.printf("\nAverage Height: %.2f\n", averageHeight);
		System.out.printf("People less than 16: %.1f %%\n", (double)peopleLessSixteen.size()/people.size()*100);
		
		for (Person person : peopleLessSixteen) {
			System.out.println(person.getName());
		}
	}
}