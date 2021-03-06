package oopExcercises;

public class Banker extends Person {

	private String suitColor;
	private int money;
	
	
	
	public Banker(String name, int age, String suitColor, int money) {
		super(name, age);
		this.suitColor = suitColor;
		this.money = money;
	}
	
	public Banker(String suitColor, int money) {
	
		this.suitColor = suitColor;
		this.money = money;
	}



	public String getSuitColor() {
		return suitColor;
	}



	public void setSuitColor(String suitColor) {
		this.suitColor = suitColor;
	}



	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	public void countingMoney() {
		System.out.println("I'm counting my "+this.money+" pounds "+"wearing my "+this.suitColor +" suite");
	}



	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I'm hungry I want to eat "+this.getAge()+" sandwiches");
	}



	@Override
	public String toString() {
		return "Banker [suitColor=" + suitColor + ", money=" + money + "] Person [age=" +this.getAge()+" name "+super.getName();
	}
	
	
}
/*Exercise:

      
        
        - All three classes should override the toString() method in order to print some useful information about the class.
        - The Subclass toString() methods should include the same information as Person, but with their own unqiue info on top.
        - Use encapsulation - private class variables with getters & setters.
        - Use a separate runner class with a main method.*/