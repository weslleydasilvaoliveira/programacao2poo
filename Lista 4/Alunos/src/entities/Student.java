package entities;

public class Student{
	private String name;
	private double grade1;
	private double grade2;
	private double grade3;
	private double finalGrade;
	
	//builder
	public Student(String name, double grade1, double grade2, double grade3){
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	//methods
	public String finalGrade(){
		this.finalGrade = this.grade1 + this.grade2 + this.grade3;
		String text = "";

		if(finalGrade >= 60)
			text = "APROVADO";
		else{
			text = "REPROVADO";
			double missing = 60 - this.finalGrade;
			text += "\n" + "FALTARAM " + missing + " PONTOS";
		}
		
		return text;
	}
}