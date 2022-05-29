package model;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Vehicle{

	private double basePrice;
	private double salePrice;
	private String brand;
	private int model;
	private double cylinderCapacity;
	private double mileage;
	private String type; //Nuevo o usado
	private String plate;
	private Soat soat;
	private MechanicalTechnical mechanicalTechnical;
	private PropertyCard propertyCard;
    public static final int DOCS = 3;
    private Document [] docs ;



    public Vehicle(double basePrice, double salePrice, String brand,int model, double cylinderCapacity, double mileage, String type, String plate, Soat soat, MechanicalTechnical mechanicalTechnical, PropertyCard propertyCard) {
		this.basePrice = basePrice;
		this.salePrice = salePrice;
		this.brand = brand;
		this.model = model;
		this.cylinderCapacity = cylinderCapacity;
		this.mileage = mileage;	
		this.type=type;
		this.plate=plate;
		this.soat=soat;
		this.mechanicalTechnical=mechanicalTechnical;
		this.propertyCard=propertyCard;
		docs = new Document[DOCS];

	}



	
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }



    public void addDocumentS(Soat document) {
        docs[0]= document;
    }
    public void addDocumentM(MechanicalTechnical mechanicalTechnical){
        docs[1]= mechanicalTechnical;
    }
    public void addDocumentTP(PropertyCard propertyCard){
        docs[2]= propertyCard;
    }    

    

    public String toStringSells(){

        return "Brand: " + getBrand() + "\n" +
               "Year: " + getModel() + "\n" +
               "Cylinder: " + getCylinderCapacity() + "\n" +
               "\n";
    }  

/**
 * 	private double basePrice;
	private double salePrice;
	private String brand;
	private int model;
	private double cylinderCapacity;
	private double mileage;
	private String type; //Nuevo o usado
	private String plate;
 */
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
    public String toStringGasoline(){
        return "";}
    public String toStringElectric(){
        return "";}        
    public String toStringHybrid(){
        return "";}
     
    /**
     * @return double return the basePrice
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * @return double return the salePrice
     */
    public double getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return String return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return int return the model
     */
    public int getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(int model) {
        this.model = model;
    }

    /**
     * @return double return the cylinderCapacity
     */
    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * @param cylinderCapacity the cylinderCapacity to set
     */
    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    /**
     * @return double return the mileage
     */
    public double getMileage() {
        return mileage;
    }

    /**
     * @param mileage the mileage to set
     */
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    /**
     * @return String return the plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * @return Soat return the soat
     */
    public Soat getSoat() {
        return soat;
    }

    /**
     * @param soat the soat to set
     */
    public void setSoat(Soat soat) {
        this.soat = soat;
    }

    /**
     * @return MechanicalTechnical return the mechanicalTechnical
     */
    public MechanicalTechnical getMechanicalTechnical() {
        return mechanicalTechnical;
    }

    /**
     * @param mechanicalTechnical the mechanicalTechnical to set
     */
    public void setMechanicalTechnical(MechanicalTechnical mechanicalTechnical) {
        this.mechanicalTechnical = mechanicalTechnical;
    }

    /**
     * @return PropertyCard return the propertyCard
     */
    public PropertyCard getPropertyCard() {
        return propertyCard;
    }

    /**
     * @param propertyCard the propertyCard to set
     */
    public void setPropertyCard(PropertyCard propertyCard) {
        this.propertyCard = propertyCard;
    }
    /**
     * @return Document [] return the docs
     */
    public Document [] getDocs() {
        return docs;
    }

    /**
     * @param docs the docs to set
     */
    public void setDocs(Document [] docs) {
        this.docs = docs;
    }


    public int getSoatYear(){
        return soat.getYear();
    }
    public String getSoatString(){
        return soat.toString();
    }

    public String getPropertyCardtImg(){
        return propertyCard.getImageDoc();
    }    


    public int getMechanicalTechnicalYear(){
        return mechanicalTechnical.getYear();
    }      
    public String getMechanicalTechnicalString(){
        return mechanicalTechnical.toString();
    }    

    




}
	