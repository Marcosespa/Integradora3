package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Math;
import java.util.Random;

public abstract class Document{
    private double price;
    private int year;
    private String imageDoc;

    public static final int row=4;
    public static final int column=4;
    
    public Document(double price, int year, String imageDoc){
        this.price=price;
        this.year=year;
        this.imageDoc=imageDoc;
    }
    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return int return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return String return the imageDoc
     */
    public String getImageDoc() {
        return imageDoc;
    }

    /**
     * @param imageDoc the imageDoc to set
     */
    public void setImageDoc(String imageDoc) {
        this.imageDoc = imageDoc;
    }




}