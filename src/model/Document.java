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


/** 
    public void RandomMatrix(){
        for (int i=0; i< documentMatriz.length; i++ ) { // filas numbers.length
            for (int j = 0; j < documentMatriz.length; j++) { //columnas numbers[0].length					
                int a = (int)(Math.random()*(100-1+1)+1); // NUMERO DEL 0 AL 99 				
                documentMatriz[i][j] = a;
            }
        }	

    }

    public void recorridoL() {
        for (int i=0; i< documentMatriz.length; i++ ) { 

        }

    }
*/



}