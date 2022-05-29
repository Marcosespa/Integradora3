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

	/**
	 * 	private int doorsNumber;
	private String typeWindows;
	private String carType;
	//Gasoline Atributes
	private double gasolineTankCapacity;
	private String typeGasoline;
	private double oilConsumeByKm;
	 * @return
	 */
    public String toStringGasoline(){
        String out= "Base price: " + getBasePrice() + "\n" +
        "Sale price: " + getSalePrice() + "\n" +
        "Brand: " + getBrand() + "\n" +
        "Model: " + getModel() + "\n" +
        "Cylinder Capacity: " + getCylinderCapacity() + "\n" +
		"Milage: " + getMileage() + "\n" +
        "Type: " + getType() + "\n" ;
        if(getType().equalsIgnoreCase("USED")){
            out+="Plate: " + getPlate() + "\n";
        }else{
            out+="Plate: There's no plate\n";
		}
		out+= "Doors Number: " + doorsNumber + "\n" +
        "Type Windows: " + typeWindows + "\n" +
        "Car Type: " + carType + "\n" +
        "Gasoline Tank Capacity: " + gasolineTankCapacity + "\n" +
        "Type Gasoline: " + typeGasoline + "\n" +
		"Oil consume: " + oilConsumeByKm + "\n" +
        "\n" ;		

		return out;
	}
    public String toStringBase(){
        String out= "Base price: " + getBasePrice() + "\n" +
        "Sale price: " + getSalePrice() + "\n" +
        "Brand: " + getBrand() + "\n" +
        "Model: " + getModel() + "\n" +
        "Cylinder Capacity: " + getCylinderCapacity() + "\n" +
        "Milage: " + getMileage() + "\n" +
        "Type: " + getType() + "\n" ;
        if(getType().equalsIgnoreCase("USED")){
            out+="Plate: " + getPlate() + "\n";
        }else{
            out+="Plate: There's no plate\n";
        }
        return out;
    }    

    
}
	