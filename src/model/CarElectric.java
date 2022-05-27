package model;

import java.util.ArrayList;
import java.util.Iterator;

public class CarElectric extends Vehicle{


	private int doorsNumber;
	private String typeWindows;
	private String carType;
	//Electric Atributes
	private String chargerType;
	private double batteryDuration;
	private double batteryConsumption;


    public CarElectric(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage, String type, String plate, Soat soat, MechanicalTechnical mechanicalTechnical, PropertyCard propertyCard, int doorsNumber, String typeWindows, String carType, String chargerType, double batteryDuration, double batteryConsumption) {
		super(basePrice, salePrice, brand, model, cylinderCapacity, mileage,type, plate,soat,mechanicalTechnical,propertyCard);
		this.doorsNumber=doorsNumber;
		this.typeWindows=typeWindows;
		this.carType=carType;
		//ELECTRIC
		this.chargerType=chargerType;
		this.batteryDuration=batteryDuration;
		this.batteryConsumption=batteryConsumption;

	}



    
}