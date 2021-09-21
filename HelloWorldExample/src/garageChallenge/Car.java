package garageChallenge;

public class Car extends Vehicle{

	private String bodyType;

	
	
	
	public Car(String brand, String type, int numOfWheels, double price,int Id,String bodyType) {
		super(brand, type, numOfWheels, price,Id);
		this.bodyType=bodyType;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	@Override
	public double calculateBill() {
		double billAmount=this.getBodyType().length()*100;
		return billAmount;
	}
}
