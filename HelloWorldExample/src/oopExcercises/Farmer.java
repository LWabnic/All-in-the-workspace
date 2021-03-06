package oopExcercises;

public class Farmer extends Person {

	private String hatColor;
	private int sheep;
	
	

	public Farmer(String name, int age, String hatColor, int sheep) {
		super(name, age);
		this.hatColor = hatColor;
		this.sheep = sheep;
	}



	public String getHatColor() {
		return hatColor;
	}



	public void setHatColor(String hatColor) {
		this.hatColor = hatColor;
	}



	public int getSheep() {
		return sheep;
	}



	public void setSheep(int sheep) {
		this.sheep = sheep;
	}



	public void countingSheep() {
		System.out.println("I'm counting my "+this.sheep+" sheep "+"wearing my "+this.hatColor +" hat");
	}

	@Override
	public String toString() {
		return "Farmer [suitColor=" + hatColor + ", money=" + sheep + "]";
	}
	
	
	
}
