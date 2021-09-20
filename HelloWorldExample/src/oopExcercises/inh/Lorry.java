package interfaces;

public class Lorry implements Vehicle,Wipers {

	@Override
	public void start() {
		System.out.println("Turn the ignition");
		
	}

	@Override
	public void brake() {
		System.out.println("Air brakes");
		
	}

	@Override
	public void honk() {
		System.out.println("Pull the honk line");	
		}

	@Override
	public void turnWipersOn() {
		System.out.println("Flick the wiper rod");
	}

}
