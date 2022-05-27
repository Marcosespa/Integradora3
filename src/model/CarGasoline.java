package model;

import java.util.ArrayList;
import java.util.Iterator;

public class CarGasoline extends Vehicle{


	private int doorsNumber;
	private String typeWindows;
	private String carType;
	//Gasoline Atributes
	private double gasolineTankCapacity;
	private String typeGasoline;
	private double oilConsumeByKm;



    public CarGasoline(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage, String type, String plate, Soat soat, MechanicalTechnical mechanicalTechnical, PropertyCard propertyCard, int doorsNumber, String typeWindows, String carType, double gasolineTankCapacity, String typeGasoline, double oilConsumeByKm) {
		super(basePrice, salePrice, brand, model, cylinderCapacity, mileage,type, plate,soat,mechanicalTechnical,propertyCard);
		this.doorsNumber=doorsNumber;
		this.typeWindows=typeWindows;
		this.carType=carType;
		// GASOLINE
		this.gasolineTankCapacity=gasolineTankCapacity;
		this.typeGasoline=typeGasoline;
		this.oilConsumeByKm=oilConsumeByKm;

	}



    
}
	