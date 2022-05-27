package model;

public class PropertyCard extends Document{

    public String owner;
    protected int [][] propertyCardDocument = new int [row][column];

    public PropertyCard(double price, int year, String imageDoc, String owner){
        super(price, year,imageDoc);
        this.owner=owner;
    }

    /**
     * @return String return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }    

    public String toString(){

        return "Price: " + getPrice() + "\n" +
               "Year: " + getYear() + "\n" +
               "Number: " + getImageDoc() + "\n" +
               "Owner: " + getOwner() + "\n";
    }      
    

}