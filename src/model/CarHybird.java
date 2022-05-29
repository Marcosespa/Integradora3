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




    public CarHybird(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage, String type, String plate, Soat soat, MechanicalTechnical mechanicalTechnical, PropertyCard propertyCard, int doorsNumber, String typeWindows, String carType, double gasolineTankCapacity, String typeGasoline, double oilConsumeByKm, String chargerType, double batteryDuration,double batteryConsumption) {
		super(basePrice, salePrice, brand, model, cylinderCapacity, mileage,type, plate,soat,mechanicalTechnical,propertyCard);
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
        "Gasoline Tank Capacity: " + gasolineTankCapacity + "\n" +
        "Type Gasoline: " + typeGasoline + "\n" +
		"Oil consume: " + oilConsumeByKm + "\n" +        
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
    

    /**
     * @return int return the doorsNumber
     */
    public int getDoorsNumber() {
        return doorsNumber;
    }

    /**
     * @param doorsNumber the doorsNumber to set
     */
    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    /**
     * @return String return the typeWindows
     */
    public String getTypeWindows() {
        return typeWindows;
    }

    /**
     * @param typeWindows the typeWindows to set
     */
    public void setTypeWindows(String typeWindows) {
        this.typeWindows = typeWindows;
    }

    /**
     * @return String return the carType
     */
    public String getCarType() {
        return carType;
    }

    /**
     * @param carType the carType to set
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }

    /**
     * @return double return the gasolineTankCapacity
     */
    public double getGasolineTankCapacity() {
        return gasolineTankCapacity;
    }

    /**
     * @param gasolineTankCapacity the gasolineTankCapacity to set
     */
    public void setGasolineTankCapacity(double gasolineTankCapacity) {
        this.gasolineTankCapacity = gasolineTankCapacity;
    }

    /**
     * @return String return the typeGasoline
     */
    public String getTypeGasoline() {
        return typeGasoline;
    }

    /**
     * @param typeGasoline the typeGasoline to set
     */
    public void setTypeGasoline(String typeGasoline) {
        this.typeGasoline = typeGasoline;
    }

    /**
     * @return double return the oilConsumeByKm
     */
    public double getOilConsumeByKm() {
        return oilConsumeByKm;
    }

    /**
     * @param oilConsumeByKm the oilConsumeByKm to set
     */
    public void setOilConsumeByKm(double oilConsumeByKm) {
        this.oilConsumeByKm = oilConsumeByKm;
    }

    /**
     * @return String return the chargerType
     */
    public String getChargerType() {
        return chargerType;
    }

    /**
     * @param chargerType the chargerType to set
     */
    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    /**
     * @return double return the batteryDuration
     */
    public double getBatteryDuration() {
        return batteryDuration;
    }

    /**
     * @param batteryDuration the batteryDuration to set
     */
    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }

    /**
     * @return double return the batteryConsumption
     */
    public double getBatteryConsumption() {
        return batteryConsumption;
    }

    /**
     * @param batteryConsumption the batteryConsumption to set
     */
    public void setBatteryConsumption(double batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
    }

}