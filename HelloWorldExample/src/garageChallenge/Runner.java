package garageChallenge;

public class Runner {

	public static void main(String[] args) {
	
		Vehicle bike = new Bike("Kawasaki","Racing", 2, 100, 1, 500);
		Vehicle car = new Car("Bentley", "Executive", 4, 200, 2, "Convertible");
		Vehicle lorry= new Lorry("Scania", "HGV", 6, 300, 3, 18);
		
		Garage garage =new Garage();
		
garage.addVehicle(bike);
garage.addVehicle(car);
garage.addVehicle(lorry);
//garage.listAll();		
//garage.fixVehicle();
//garage.removeVehicle(bike);
//garage.listAll();
//garage.addVehicle(bike);
//garage.listAll();
//garage.removeByType("Racing");
//garage.removeById(1);
//garage.emptyGarage();
garage.listAll();
	}

}
