package garageChallenge;

public class Bike extends Vehicle {

	private int engineSizeCC;
	
	
	
	
	
	public Bike(String brand, String type, int numOfWheels, double price,int Id,int engineSizeCC) {
		super(brand, type, numOfWheels, price,Id);
		this.engineSizeCC=engineSizeCC;
	}

	public int getEngineSizeCC() {
		return engineSizeCC;
	}

	public void setEngineSizeCC(int engineSizeCC) {
		this.engineSizeCC = engineSizeCC;
	}

	@Override
	public double calculateBill() {
		double billAmount=this.getEngineSizeCC()*100;
		return billAmount;
	}
	
	

	
}
