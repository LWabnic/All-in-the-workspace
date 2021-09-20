package oopExcercises;

public class Encapsulation {
private String name;
private int age;
private double salary;
private float holidays;
private long daysInEmployment;



public Encapsulation() {
	super();
}

public Encapsulation(String name, int age, double salary, float holidays, long daysInEmployment) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.holidays = holidays;
	this.daysInEmployment = daysInEmployment;
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

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public float getHolidays() {
	return holidays;
}

public void setHolidays(float holidays) {
	this.holidays = holidays;
}

public long getDaysInEmployment() {
	return daysInEmployment;
}

public void setDaysInEmployment(long daysInEmployment) {
	this.daysInEmployment = daysInEmployment;
}

@Override
public String toString() {
    return "[Encapsulation: name " + name + " age " + age + " salary "+salary+" holidays "+holidays+" days in employment " + daysInEmployment+" ]";
}

}
