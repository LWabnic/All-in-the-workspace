package Adapters;

public class AdapterClass implements UkPlugSocket{

	IncompatiblePlug twoPin;
	
	public AdapterClass(IncompatiblePlug twoPin) {
		
		this.twoPin=twoPin;
	}
	
	@Override
	public void InsertThe3pinPlug() {
		
		twoPin.iHave2pins();
		System.out.println("But it's cool because we have an adapter");
	}
}
