package garageChallenge;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles =new ArrayList<Vehicle>();

	public void listAll() {
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle.toString());
			
			
		}
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public void removeVehicle(Vehicle v) {
		if(this.vehicles.remove(v)) {
			System.out.println("Vehicle removed");
		}else {
			System.out.println("Vehicle not found");
		}
		
	}
	public void removeByType(String type) {
		ArrayList<Vehicle> found =new ArrayList<Vehicle>();
		
		for(Vehicle vehicle : vehicles) {
			if (vehicle.getType()==type) {
				found.add(vehicle);
			}
		}
		
		for(Vehicle destroy: found) {
			vehicles.remove(destroy);
		}
	}
	
	public void removeById(int Id) {
		ArrayList<Vehicle> found =new ArrayList<Vehicle>();
		
		for(Vehicle vehicle : vehicles) {
			if (vehicle.getId()==Id) {
				found.add(vehicle);
			}
		}
		for(Vehicle destroy: found) {
			vehicles.remove(destroy);
			System.out.println("Vehicle with Id: "+Id+" was removed");
		}
		
	}
	public void emptyGarage() {
		ArrayList<Vehicle> found =new ArrayList<Vehicle>();
		for(Vehicle vehicle : vehicles) {
				found.add(vehicle);
			}
		for(Vehicle destroy: found) {
			vehicles.remove(destroy);
			
		}
		System.out.println("Garage is empty");
		}
		
		
	
	public void fixVehicle() {
		
		for(Vehicle vehicle : vehicles) {
			if (vehicle instanceof Bike) {
				System.out.println(((Bike)vehicle).calculateBill());	
				
			}
			else if (vehicle instanceof Car) {
				System.out.println(((Car)vehicle).calculateBill());
				
			}
			if (vehicle instanceof Lorry) {
				System.out.println(((Lorry)vehicle).calculateBill());
				
			}
			}
	}
	
	
}
