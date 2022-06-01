package model;

public class MechanicalTechnical extends Document{

    public double gasLevels;


    public MechanicalTechnical(double price, int year, String imageDoc, double gasLevels){
        super(price, year,imageDoc);
        this.gasLevels=gasLevels;        
    }

    public double getgasLevels() {
        return gasLevels;
    }

    /**
     * @param gasLevels the gasLevels to set
     */
    public void setGasLevels(double gasLevels) {
        this.gasLevels = gasLevels;
    }

    public String toString(){

        return "Price: " + getPrice() + "\n" +
               "Year: " + getYear() + "\n" +
               "Number: " + getImageDoc() + "\n" +
               "Gas levels: " + getgasLevels() + "\n";
    }    
}
