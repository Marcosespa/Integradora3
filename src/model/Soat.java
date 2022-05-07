package model;

public class Soat extends Document{

    public double covergeAmount;

    public Soat(double price, int year, double covergeAmount){
        super(price, year);
        this.covergeAmount=covergeAmount;
        

    }

}
