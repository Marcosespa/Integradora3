package model;

public class Soat extends Document{

    public double covergeAmount;
    protected int [][] soatDocument = new int [row][column];


    public Soat(double price, int year, String imageDoc, double covergeAmount){
        super(price, year, imageDoc);
        this.covergeAmount=covergeAmount;
    }

    /**
     * @return double return the covergeAmount
     */
    public double getCovergeAmount() {
        return covergeAmount;
    }

    /**
     * @param covergeAmount the covergeAmount to set
     */
    public void setCovergeAmount(double covergeAmount) {
        this.covergeAmount = covergeAmount;
    }

    public String toString(){

        return "Price: " + getPrice() + "\n" +
               "Year: " + getYear() + "\n" +
               "Number: " + getImageDoc() + "\n" +
               "Amount of coverage: " + getCovergeAmount() + "\n";
    }    


}
