package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Car extends Vehicle{


	private int doorsNumber;
	private String typeWindows;
	private String carType;


    public Car(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage,String type,String plate, int doorsNumber, String typeWindows, String carType) {
		super(basePrice, salePrice, brand, model, cylinderCapacity, mileage,type, plate);
		this.doorsNumber=doorsNumber;
		this.typeWindows=typeWindows;
		this.carType=carType;

	}



    
}
	