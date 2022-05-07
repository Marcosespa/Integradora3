package model;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcessionaireManager {
	private String title;

	private ArrayList<Vehicle> vehicles;


	public ConcessionaireManager(String title) {
		this.title = title;
		vehicles= new ArrayList<Vehicle>();	
	}

	public void addCar(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage,String type,String plate, int doorsNumber, String typeWindows, String carType) {
			
		this.vehicles.add(new Car(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,doorsNumber,typeWindows,carType)));
	}
	public void addMotorcycle(String name, String lastName,String address, String city, String country, String wish) {
			
		this.vehicles.add(new Motorcycle(name,lastName,address, city,country,wish));
	}          

    
}
	