package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Math;
import java.util.Random;

public class Document{
    private double price;
    private int year;
	private ArrayList<int[][]> documentMatriz; // Es necesaria una matriz diferente para cada tipo de documento?


    public Document(double price, int year){
        this.price=price;
        this.year=year;
        
		documentMatriz= new ArrayList<int[][]>() ;


    }





}