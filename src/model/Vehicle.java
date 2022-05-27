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
    public static final int DOCS = 2;
    private Document [] docs =  new Document [DOCS];



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

	}



	
/** 	
 	public int getEmptyPositionDocuments(){	// EMPTY POSITION DOCUMENTS 
        boolean emptyPosition = false;
		int position = -1;
		for (int i=0; i<MAX && !emptyPosition; i++){
			if(documents[i] == null){
				emptyPosition = true;
				position = i;
			}
		}
		return position;
    }

	public String addSoat(String name, String scientificName, String migratoryType, String type) {
		String out = "";		
		int emptyPos=getEmptyPositionSpecies(); //busco la primera posición vacía
		// si el arreglo está lleno?
		out = "Entra al metodo";
		if(emptyPos == -1){ // está lleno
			//no se puede agregar
			out = "El arreglo está lleno";
		}else{ //Si no está lleno

			species[emptyPos]= new Species(name, scientificName, migratoryType, type); 
			out = "El registro fue exitoso";
		}
		return out;
	}	
*/
    public void addDocumentS(Soat document) {
        docs[0]= document;
        //return "Registro Exitoso";
    }

    

    public String toStringSells(){

        return "Brand: " + getBrand() + "\n" +
               "Year: " + getModel() + "\n" +
               "Cylinder: " + getCylinderCapacity() + "\n" +
               "\n";
    }     

    

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



}
	