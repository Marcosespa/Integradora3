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

	// CREAR VEHICULOS
	public void addCarGasoline(double basePrice, double salePrice, String brand,int model,double cylinderCapacity, double mileage,String type,String plate, int doorsNumber,  String typeWindows, String carType, double gasolineTankCapacity, String typeGasoline, double oilConsumeByKm) {	
		this.vehicles.add(new CarGasoline(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,doorsNumber,typeWindows,carType, gasolineTankCapacity, typeGasoline, oilConsumeByKm));
	}
	public void addCarElectric(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage,String type,String plate, int doorsNumber, String typeWindows, String carType, String chargerType, double batteryDuration, double batteryConsumption){
		this.vehicles.add(new CarElectric(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,doorsNumber,typeWindows,carType, chargerType, batteryDuration,batteryConsumption));
	}
	public void addCarHybrid(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage,String type,String plate, int doorsNumber, String typeWindows, String carType, double gasolineTankCapacity, String typeGasoline, double oilConsumeByKm, String chargerType, double batteryDuration, double batteryConsumption){
		this.vehicles.add(new CarHybird(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,doorsNumber,typeWindows,carType,gasolineTankCapacity, typeGasoline, oilConsumeByKm,chargerType, batteryDuration,batteryConsumption));
	}

	public void addMotorcycle(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage,String type, String plate, double gasolineCapacity, double oilConsume, String MotoType) {	
		this.vehicles.add(new Motorcycle(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate, gasolineCapacity,oilConsume,MotoType));
	}       
	
	public void addSoat2CarGasoline(){}
	public void addSoat2CarElectric(){}
	public void addSoat2CarHybrid(){}
	
	
	public void addSoat2Motorcycle(){}
    
}
	