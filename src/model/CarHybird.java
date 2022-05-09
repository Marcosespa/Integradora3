package model;

import java.util.ArrayList;
import java.util.Iterator;

public class CarHybird extends Vehicle{


	private int doorsNumber;
	private String typeWindows;
	private String carType;

	//HYBRID
	private double gasolineTankCapacity;
	private String typeGasoline;
	private double oilConsumeByKm;

	private String chargerType;
	private double batteryDuration;	
	private double batteryConsumption;




    public CarHybird(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage,String type,String plate, int doorsNumber, String typeWindows, String carType, double gasolineTankCapacity, String typeGasoline, double oilConsumeByKm, String chargerType, double batteryDuration,double batteryConsumption) {
		super(basePrice, salePrice, brand, model, cylinderCapacity, mileage,type, plate);
		this.doorsNumber=doorsNumber;
		this.typeWindows=typeWindows;
		this.carType=carType;
		// GASOLINE
		this.gasolineTankCapacity=gasolineTankCapacity;
		this.typeGasoline=typeGasoline;
		this.oilConsumeByKm=oilConsumeByKm;
		//ELECTRIC
		this.chargerType=chargerType;
		this.batteryDuration=batteryDuration;		
		this.batteryConsumption=batteryConsumption;
	}



    
}