package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Vehicle{

	private double basePrice;
	private double salePrice;
	private String brand;
	private int model;
	private double cylinderCapacity;
	private double mileage;
	private String type;
	private String plate;



    public Vehicle(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage, String type, String plate) {
		this.basePrice = basePrice;
		this.salePrice = salePrice;
		this.brand = brand;
		this.model = model;
		this.cylinderCapacity = cylinderCapacity;
		this.mileage = mileage;	
		this.type=type;
		this.plate=plate;
	}



    
}
	