package oopExcercises;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		super();
	
	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void eat() {
		System.out.println("My name is " + name);
	}
	
	public void sleep() {
		System.out.println("I'm " + age+" years old");
	}


	@Override
	public String toString() {
		return "Person [suitColor=" + name + ", money=" + age + "]";
	}
	
	
}
