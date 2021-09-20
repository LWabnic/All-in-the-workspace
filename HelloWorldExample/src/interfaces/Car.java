package interfaces;

public class Car implements Vehicle,Wipers{

	@Override
	public void start() {
		
		System.out.println("Press start button");
	}

	@Override
	public void brake() {
		System.out.println("Press brake pedal");
		
	}

	@Override
	public void honk() {
		System.out.println("Hit beep on the steering wheel");
	}

	@Override
	public void turnWipersOn() {
		System.out.println("Turn the wipers knob");
	}

}
