package interfaces;

public class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Feet on pedals");
		
	}

	@Override
	public void brake() {
		System.out.println("Press brake");
		
	}

	@Override
	public void honk() {
		System.out.println("Ring bell");
		
	}

}
