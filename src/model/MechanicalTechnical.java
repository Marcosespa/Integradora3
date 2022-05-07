package model;

public class MechanicalTechnical extends Document{

    public double gasLevels;

    public MechanicalTechnical(double price, int year, double gasLevels){
        super(price, year);
        this.gasLevels=gasLevels;
        

    }

}
