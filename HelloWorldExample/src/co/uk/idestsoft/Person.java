package co.uk.idestsoft;

public class Person {
	
	double height;
	String name;
	double shoeSize;
	String jobTitle;
	int age;
	
	public Person(double height, String name, double shoeSize, String jobTitle, int age) {
		this.height = height;
		this.name = name;
		this.shoeSize = shoeSize;
		this.jobTitle = jobTitle;
		this.age = age;
	}
	
	public Person(double height, String name) {
		this.height = height;
		this.name = name;
	
	}
	
	public void Greet() {
		System.out.println("Hi "+name);
	}
	public int Age() {
		return age;
	}
}
