package entitities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percent) {
		this.grossSalary += this.grossSalary * percent / 100;
	}
}