package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Motorcycle extends Vehicle{

	private double gasolineCapacity;
	private double oilConsume;
    private String MotoType;

    public Motorcycle(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage,String type, String plate, Soat soat, MechanicalTechnical mechanicalTechnical, PropertyCard propertyCard, double gasolineCapacity, double oilConsume, String MotoType) {
		super(basePrice, salePrice, brand, model, cylinderCapacity, mileage,type, plate,soat,mechanicalTechnical,propertyCard);
		this.gasolineCapacity=gasolineCapacity;
		this.oilConsume=oilConsume;
        this.MotoType=MotoType;

	}
    


}