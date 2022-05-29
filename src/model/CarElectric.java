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
    public String toStringHybrid(){
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
        "Charger Type: " + chargerType + "\n" +
        "Battery Duration: " + batteryConsumption + "\n" +
		"Battery consumption: " + batteryConsumption + "\n" +
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