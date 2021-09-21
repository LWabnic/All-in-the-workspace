package garageChallenge;

public class Lorry extends Vehicle {

	private int maxTonnage;
	
	
	public Lorry(String brand, String type, int numOfWheels, double price,int Id,int maxTonnage) {
		super(brand, type, numOfWheels, price,Id);
		this.maxTonnage=maxTonnage;
	}

	public int getMaxTonnage() {
		return maxTonnage;
	}

	public void setMaxTonnage(int maxTonnage) {
		this.maxTonnage = maxTonnage;
	}
	@Override
	public double calculateBill() {
		double billAmount=getMaxTonnage()*100;
		return billAmount;
	}
}
