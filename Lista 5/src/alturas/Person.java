package alturas;

public class Person{
	private String name;
	private Integer age;
	private Double height;
	
	public Person(String name, int age, double height) {
   		this.name = name;	
	    	this.age = age;
	    	this.height = height;
  	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getHeight() {
		return height;
	}

	public void setHight(Double height) {
		this.height = height;
	}
	
}