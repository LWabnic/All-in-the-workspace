package garageChallenge;

public class Vehicle {

	private String brand;
	private String type;
	private int numOfWheels;
	private double price;
	private int Id;
	
	public Vehicle(String brand, String type, int numOfWheels, double price,int Id) {
		super();
		this.brand = brand;
		this.type = type;
		this.numOfWheels = numOfWheels;
		this.price = price;
		this.Id=Id;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double calculateBill() {
		double billAmount=this.getNumOfWheels()*100;
		return billAmount;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", type=" + type + ", numOfWheels=" + numOfWheels + ", price=" + price
				+ ", Id=" + Id + "]";
	}
	
	
}
