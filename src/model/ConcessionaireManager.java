package model;

import java.util.ArrayList;
import java.util.Iterator;

import javax.net.ssl.SSLSocket;

public class ConcessionaireManager {
	private String title;

	private ArrayList<Vehicle> vehicles;
	public static final int r=4;
	public static final int c=4;

    private int [][] dSoat = new int [r][c];
    private int [][] dMechanicalTechnical = new int [r][c];
    private int [][] dPropertyCard = new int [r][c];



	public ConcessionaireManager(String title) {
		this.title = title;
		vehicles= new ArrayList<Vehicle>();	
		dSoat = new int [r][c];
        dMechanicalTechnical = new int [r][c];		
        dPropertyCard = new int [r][c];		

	}


    public void randomNumberSoat(){
		for(int i=0;i<c;i++){
				for (int j=0;j<r;j++){
		            dSoat[i][j] = (int)(Math.random()*(100-1+1)+1);
		    }
		  }
	}
    public void randomNumberMechanicalTechnical(){
		for(int i=0;i<c;i++){
				for (int j=0;j<r;j++){
		            dMechanicalTechnical[i][j] = (int)(Math.random()*(100-1+1)+1);
		    }
		  }
	}	
    public void randomNumberPropertyCard(){
		for(int i=0;i<c;i++){
				for (int j=0;j<r;j++){
		            dPropertyCard[i][j] = (int)(Math.random()*(100-1+1)+1);
		    }
		  }
	}		


	public String soatGenerator(){
		String out="";
		randomNumberSoat();

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){

			  if(i==0 && j==0){
				  out += dSoat[i][j];
			  }
			  if(i==1 && j==0){
				  out += dSoat[i][j];
			  }
			  if(i==2 && j==0){
				  out += dSoat[i][j];
			  }
			  if(i==3 && j==0){
				  out += dSoat[i][j];
			  }
			  if(i==3 && j==1){
				  out += dSoat[i][j];
			  }
			  if(i==3 && j==2){
				  out += dSoat[i][j];
			  }
			  if(i==3 && j==3){
				  out += dSoat[i][j];
			  }

			}
		}		
		
		return out;
	}
	public String TMGenerator(){
		String out="";
		randomNumberMechanicalTechnical();

		for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

              if(i==0 && j==0){
                  out += dMechanicalTechnical[i][j];
              }
              if(i==0 && j==1){
                  out += dMechanicalTechnical[i][j];
              }
              if(i==0 && j==2){
                  out += dMechanicalTechnical[i][j];
              }
              if(i==0 && j==3){
                  out += dMechanicalTechnical[i][j];
              }
              if(i==1 && j==2){
                  out += dMechanicalTechnical[i][j];
              }
              if(i==2 && j==1){
                  out += dMechanicalTechnical[i][j];
              }
              if(i==3 && j==0){
                  out += dMechanicalTechnical[i][j];
              }
              if(i==3 && j==1){
                out += dMechanicalTechnical[i][j];
              }
              if(i==3 && j==2){
                out += dMechanicalTechnical[i][j];
              }
              if(i==3 && j==3){
                out += dMechanicalTechnical[i][j];
              }
			}  
		}	

		 	
		
		return out;
	}
	public String TPGenerator(){
		String out="";
		randomNumberPropertyCard();	

		for(int i=3;i>0;i--){
			for(int j=3;j>0;j--){

			  if(i==3 && j==3){
				  out += dPropertyCard[i][j];
			  }
			  if(i==3 && j==1){
				  out += dPropertyCard[i][j];
			  }
			  if(i==2 && j==2){
				  out += dPropertyCard[i][j];
			  }
			  if(i==2 && j==0){
				  out += dPropertyCard[i][j];
			  }
			  if(i==1 && j==3){
				  out += dPropertyCard[i][j];
			  }
			  if(i==1 && j==1){
				  out += dPropertyCard[i][j];
			  }
			  if(i==0 && j==2){
				  out += dPropertyCard[i][j];
			  }

			}
		}

		return out;
	}		


	// CREAR VEHICULOS
	public void addCarGasoline(double basePrice, double salePrice, String brand,int model, double cylinderCapacity,
	double mileage, String type, String plate,int doorsNumber,String typeWindows,String carType, double gasolineTankCapacity,
	String typeGasoline, double oilConsumeByKm,double priceSoat,int yearSoat,double covergeAmount,String imageDocSoat, double priceTM,
	int yearTM, double gasLevels,String imageDocTM, double priceTP,int yearTP,String owner, String imageDocTP) {	

		Soat soat= new Soat(priceSoat, yearSoat,imageDocSoat,covergeAmount);
		MechanicalTechnical mechanicalTechnical = new MechanicalTechnical(priceTM, yearTM,imageDocTM,gasLevels);
		PropertyCard propertyCard = new PropertyCard(priceTP, yearTP,imageDocTP, owner);
		this.vehicles.add(new CarGasoline(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,soat, mechanicalTechnical,propertyCard,doorsNumber,typeWindows,carType, gasolineTankCapacity, typeGasoline, oilConsumeByKm));	
	}
	public void addCarElectric(double basePrice, double salePrice, String brand,int model, double cylinderCapacity,
	double mileage,String type,String plate, int doorsNumber, String typeWindows, String carType, String chargerType,
	double batteryDuration, double batteryConsumption,double priceSoat,int yearSoat,double covergeAmount,String imageDocSoat, double priceTM,
	int yearTM, double gasLevels,String imageDocTM, double priceTP,int yearTP,String owner, String imageDocTP){
		
		Soat soat= new Soat(priceSoat, yearSoat,imageDocSoat,covergeAmount);
		MechanicalTechnical mechanicalTechnical = new MechanicalTechnical(priceTM, yearTM,imageDocTM,gasLevels);
		PropertyCard propertyCard = new PropertyCard(priceTP, yearTP,imageDocTP, owner);

		this.vehicles.add(new CarElectric(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,soat, mechanicalTechnical,propertyCard,doorsNumber,typeWindows,carType, chargerType, batteryDuration,batteryConsumption));
	}
	public void addCarHybrid(double basePrice, double salePrice, String brand,int model, double cylinderCapacity,
	 double mileage,String type,String plate, int doorsNumber, String typeWindows, String carType, double gasolineTankCapacity,
	  String typeGasoline, double oilConsumeByKm, String chargerType, double batteryDuration, double batteryConsumption,
	  double priceSoat,int yearSoat,double covergeAmount,String imageDocSoat, double priceTM,int yearTM, double gasLevels,String imageDocTM, double priceTP,int yearTP,String owner, String imageDocTP){
		
		Soat soat= new Soat(priceSoat, yearSoat,imageDocSoat,covergeAmount);
		MechanicalTechnical mechanicalTechnical = new MechanicalTechnical(priceTM, yearTM,imageDocTM,gasLevels);
		PropertyCard propertyCard = new PropertyCard(priceTP, yearTP,imageDocTP, owner);


		this.vehicles.add(new CarHybird(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,soat,mechanicalTechnical,propertyCard,doorsNumber,typeWindows,carType,gasolineTankCapacity, typeGasoline, oilConsumeByKm,chargerType, batteryDuration,batteryConsumption));
	
	}


	//CREAR MOTO
	public void addMotorcycle(double basePrice, double salePrice, String brand,int model, double cylinderCapacity,
	 double mileage,String type, String plate, double gasolineCapacity, double oilConsume, String MotoType,
	 double priceSoat,int yearSoat,double covergeAmount,String imageDocSoat, double priceTM,
	  int yearTM, double gasLevels,String imageDocTM, double priceTP,int yearTP,String owner, String imageDocTP) {	
		
		Soat soat= new Soat(priceSoat, yearSoat,imageDocSoat,covergeAmount);
		MechanicalTechnical mechanicalTechnical = new MechanicalTechnical(priceTM, yearTM,imageDocTM,gasLevels);
		PropertyCard propertyCard = new PropertyCard(priceTP, yearTP,imageDocTP, owner);	
		
		this.vehicles.add(new Motorcycle(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,soat, mechanicalTechnical,propertyCard, gasolineCapacity,oilConsume,MotoType));



	}       


	//REQUERIMEINTO 2
	public String calculatePrice(String brand, int model, double cylinder){
		String out ="";
        for(int i = 0; i < vehicles.size(); i++) {
			if(vehicles.get(i).getBrand().equalsIgnoreCase(brand) && vehicles.get(i).getModel()==model && vehicles.get(i).getCylinderCapacity()==cylinder ){
				out+="The vehicle has a price of "+ (vehicles.get(i).getSalePrice());
			}
			out+="There's no record of that vehicle in the store";
        }		
		return out;
	}
	public String showVehicles(){
		String out="";
        for(int i = 0; i < vehicles.size(); i++) {
            out+= (vehicles.get(i).toStringSells());			
        }	
				
		return out;
	}
    

	//REQUERIMIENTO 3
	
	public String reportCars(){ // REPORTE DE TODOS LOS CARROS
		String out="";
		
		for (int i=0;i<vehicles.size();i++){
			if (vehicles.get(i) instanceof Motorcycle){
				out+= vehicles.get(i).toString();
			}
		}

		return out;
	}

}
	