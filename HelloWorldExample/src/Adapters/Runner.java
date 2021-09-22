package Adapters;

public class Runner {

	public static void main(String[] args) {
		CompatiblePlug threePin=new CompatiblePlug();
		
		IncompatiblePlug twoPin=new IncompatiblePlug();
		
		UkPlugSocket accept2pins = new AdapterClass(twoPin);
		
		
		System.out.println("Compatible plug :");
		threePin.InsertThe3pinPlug();
		System.out.println("-----------------------");
		System.out.println("Incompatible plug :");
		twoPin.iHave2pins();
		System.out.println("-----------------------");
		System.out.println("Adapting 2 pins to 3 pins :");
		accept2pins.InsertThe3pinPlug();
	}
}
