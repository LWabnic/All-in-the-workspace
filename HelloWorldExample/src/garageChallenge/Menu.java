package garageChallenge;

public class Menu {

	public void startGarage() {
		
		System.out.println("Welcome to the Garage");
		System.out.println("Please select one of the options:");
		System.out.println("1.List all vehicles in the garage");
		System.out.println("2.Add vehicle to the garage");
		System.out.println("3.Remove vehicle");
		System.out.println("4.Print totals for all repairs");
		System.out.println("5.Finish");
		
		//2 ADD VEHICLE MENU
		System.out.println("What type of vehicle would you like to add:");
		System.out.println("1.Bike");
		System.out.println("2.Car");
		System.out.println("3.Lorry");
		//Generic for all vehicle types:
		System.out.println("Enter the brand: ");
		System.out.println("Enter the type: ");
		System.out.println("Enter numberOfWheels: ");
		System.out.println("Enter the price: ");
		System.out.println("Enter the Id; ");
		//2.1 ADD BIKE MENU String brand, String type, int numOfWheels, double price,int Id
		
		System.out.println("Enter the engine size in CC: ");
		//2.2 ADD CAR MENU String brand, String type, int numOfWheels, double price,int Id
		
		System.out.println("Enter the body type: ");
		//2.3 ADD LORRY MENU String brand, String type, int numOfWheels, double price,int Id
	
		System.out.println("Enter the max tonnage: ");
		
		//3 REMOVE VEHICLE MENU
		System.out.println("1.Remove vehicle by Id");
		System.out.println("2.Remove vehicle by Type");
		System.out.println("3.Remove all vehicle from the garage");
		System.out.println("0.Main Menu");
		
		//3.1 REMOVE VEHICLE MENU
		System.out.println("Enter the vehicle Id: ");
		
		
		
		
	}
	
}
