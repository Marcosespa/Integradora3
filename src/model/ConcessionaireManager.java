package model;

import java.util.ArrayList;
import java.util.Iterator;

import javax.net.ssl.SSLSocket;

public class ConcessionaireManager {

	private ArrayList<Vehicle> vehicles;
	public static final int r=4;
	public static final int c=4;


    private int [][] dSoat = new int [r][c];
    private int [][] dMechanicalTechnical = new int [r][c];
    private int [][] dPropertyCard = new int [r][c];

	private int [][] map;
	private Vehicle[][] parking;
	public static final int c1=5;
	public static final int f1=10;



	public ConcessionaireManager() {
		vehicles= new ArrayList<Vehicle>();	
		//dSoat = new int [r][c];
        //dMechanicalTechnical = new int [r][c];		
        //dPropertyCard = new int [r][c];	
        map = new int[f1][c1];	
		parking = new Vehicle[f1][c1];		

	}

/** 
 * 
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

*/	


	public String soatGenerator(){
		String out="";
		//randomNumberSoat();
		for(int i=0;i<c;i++){
			for (int j=0;j<r;j++){
				dSoat[i][j] = (int)(Math.random()*(10-1+1)+1);
		}
		}		

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
		for(int i=0;i<c;i++){
			for (int j=0;j<r;j++){
				dMechanicalTechnical[i][j] = (int)(Math.random()*(10-1+1)+1);
		}
		}	
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
		for(int i=0;i<c;i++){
			for (int j=0;j<r;j++){
				dPropertyCard[i][j] = (int)(Math.random()*(10-1+1)+1);
		}
		}	
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
		CarGasoline cg=new CarGasoline(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,soat, mechanicalTechnical,propertyCard,doorsNumber,typeWindows,carType, gasolineTankCapacity, typeGasoline, oilConsumeByKm);	
		vehicles.add(cg);

		if(type=="USED"&& model<2015){
			for(int i=0;i<f1;i++){
				for(int j=0;j<c1;j++){		
					if(model==2014&&j==0 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=cg;
					}
                	if(model==2013&&j==1 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=cg;
					}
					if(model==2012&&j==2 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=cg;					
					}
					if(model==2011&&j==3 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=cg;							
					}
					if(model<2011&&j==4 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=cg;	
					}
				}
			}						
		}
	}
	public void addCarElectric(double basePrice, double salePrice, String brand,int model, double cylinderCapacity,
	double mileage,String type,String plate, int doorsNumber, String typeWindows, String carType, String chargerType,
	double batteryDuration, double batteryConsumption,double priceSoat,int yearSoat,double covergeAmount,String imageDocSoat, double priceTM,
	int yearTM, double gasLevels,String imageDocTM, double priceTP,int yearTP,String owner, String imageDocTP){
		
		Soat soat= new Soat(priceSoat, yearSoat,imageDocSoat,covergeAmount);
		MechanicalTechnical mechanicalTechnical = new MechanicalTechnical(priceTM, yearTM,imageDocTM,gasLevels);
		PropertyCard propertyCard = new PropertyCard(priceTP, yearTP,imageDocTP, owner);
		CarElectric Ce=new CarElectric(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,soat, mechanicalTechnical,propertyCard,doorsNumber,typeWindows,carType, chargerType, batteryDuration,batteryConsumption);
		vehicles.add(Ce);
		if(type=="USED"&& model<2015){
			for(int i=0;i<f1;i++){
				for(int j=0;j<c1;j++){		
					if(model==2014&&j==0 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Ce;
					}
                	if(model==2013&&j==1 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Ce;
					}
					if(model==2012&&j==2 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Ce;					
					}
					if(model==2011&&j==3 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Ce;							
					}
					if(model<2011&&j==4 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Ce;	
					}
				}
			}						
		}		
	
	
	}
	public void addCarHybrid(double basePrice, double salePrice, String brand,int model, double cylinderCapacity,
	 double mileage,String type,String plate, int doorsNumber, String typeWindows, String carType, double gasolineTankCapacity,
	  String typeGasoline, double oilConsumeByKm, String chargerType, double batteryDuration, double batteryConsumption,
	  double priceSoat,int yearSoat,double covergeAmount,String imageDocSoat, double priceTM,int yearTM, double gasLevels,String imageDocTM, double priceTP,int yearTP,String owner, String imageDocTP){
		
		Soat soat= new Soat(priceSoat, yearSoat,imageDocSoat,covergeAmount);
		MechanicalTechnical mechanicalTechnical = new MechanicalTechnical(priceTM, yearTM,imageDocTM,gasLevels);
		PropertyCard propertyCard = new PropertyCard(priceTP, yearTP,imageDocTP, owner);

		CarHybird Ch=new CarHybird(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,soat,mechanicalTechnical,propertyCard,doorsNumber,typeWindows,carType,gasolineTankCapacity, typeGasoline, oilConsumeByKm,chargerType, batteryDuration,batteryConsumption);
		vehicles.add(Ch);
		if(type=="USED"&& model<2015){
			for(int i=0;i<f1;i++){
				for(int j=0;j<c1;j++){		
					if(model==2014&&j==0 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Ch;
					}
                	if(model==2013&&j==1 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Ch;
					}
					if(model==2012&&j==2 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Ch;					
					}
					if(model==2011&&j==3 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Ch;							
					}
					if(model<2011&&j==4 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Ch;	
					}
				}
			}						
		}		
	}


	//CREAR MOTO
	public void addMotorcycle(double basePrice, double salePrice, String brand,int model, double cylinderCapacity,
	 double mileage,String type, String plate, double gasolineCapacity, double oilConsume, String MotoType,
	 double priceSoat,int yearSoat,double covergeAmount,String imageDocSoat, double priceTM,
	  int yearTM, double gasLevels,String imageDocTM, double priceTP,int yearTP,String owner, String imageDocTP) {	
		
		Soat soat= new Soat(priceSoat, yearSoat,imageDocSoat,covergeAmount);
		MechanicalTechnical mechanicalTechnical = new MechanicalTechnical(priceTM, yearTM,imageDocTM,gasLevels);
		PropertyCard propertyCard = new PropertyCard(priceTP, yearTP,imageDocTP, owner);	
		Motorcycle Mt=new Motorcycle(basePrice,salePrice,brand, model,cylinderCapacity,mileage,type,plate,soat, mechanicalTechnical,propertyCard, gasolineCapacity,oilConsume,MotoType);
		vehicles.add(Mt);
		if(type=="USED"&& model<2015){
			for(int i=0;i<f1;i++){
				for(int j=0;j<c1;j++){		
					if(model==2014&&j==0 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Mt;
					}
                	if(model==2013&&j==1 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Mt;
					}
					if(model==2012&&j==2 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Mt;					
					}
					if(model==2011&&j==3 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Mt;							
					}
					if(model<2011&&j==4 && parking[i][j] == null){
						map[i][j]=1;
						parking[i][j]=Mt;	
					}
				}
			}						
		}

	}       


	//REQUERIMEINTO 2
	public String calculatePrice(String brand, int model, double cylinder){
		String out ="";
        for(int i = 0; i < vehicles.size(); i++) {
			out+="There's no record of that vehicle in the store";
			if(vehicles.get(i).getBrand().equalsIgnoreCase(brand) && vehicles.get(i).getModel()==model && vehicles.get(i).getCylinderCapacity()==cylinder ){
				out="The vehicle has a price of "+ (vehicles.get(i).getSalePrice());
			}
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

			if (vehicles.get(i) instanceof CarGasoline){
				out+= vehicles.get(i).toStringBase();
			}
			if (vehicles.get(i) instanceof CarElectric){
				out+= vehicles.get(i).toStringBase();
			}	
			if (vehicles.get(i) instanceof CarHybird){
				out+= vehicles.get(i).toStringBase();
			}			

		}
		return out;
	}
	public String reportMotorcycle(){ // REPORTE DE TODAS LAS MOTOS
		String out="";
		
		for (int i=0;i<vehicles.size();i++){
			if (vehicles.get(i) instanceof Motorcycle){
				out+= vehicles.get(i).toString();
			}
		}

		return out;
	}	

	public String reportCarsGasoline(){ // REPORTE DE TODOS LOS CARROS GASOLINA
		String out="";		
		for (int i=0;i<vehicles.size();i++){
			if (vehicles.get(i) instanceof CarGasoline){
				out+= vehicles.get(i).toStringGasoline();
			}
		}
		return out;
	}	
	public String reportCarsElectric(){ // REPORTE DE TODOS LOS CARROS ELECTRICOS
		String out="";		
		for (int i=0;i<vehicles.size();i++){
			if (vehicles.get(i) instanceof CarElectric){
				out+= vehicles.get(i).toStringElectric();
			}
		}
		return out;
	}	
	public String reportCarsHybrid(){ // REPORTE DE TODOS LOS CARROS HIBRIDOS
		String out="";		
		for (int i=0;i<vehicles.size();i++){
			if (vehicles.get(i) instanceof CarHybird){
				out+= vehicles.get(i).toStringHybrid();
			}
		}
		return out;
	}		


	public String reportVehicleNew(){ // REPORTE DE TODOS LOS CARROS NUEVOS 
		String out="";
		
		for (int i=0;i<vehicles.size();i++){
			if (vehicles.get(i).getType().equalsIgnoreCase("NEW")){
				out+= vehicles.get(i).toString();
			}
		}

		return out;
	}	
	public String reportVehicleUsed(){ // REPORTE DE TODOS LOS CARROS USADOS 
		String out="";
		
		for (int i=0;i<vehicles.size();i++){
			if (vehicles.get(i).getType().equalsIgnoreCase("USED")){
				out+= vehicles.get(i).toString();
			}
		}

		return out;
	}		
	public String reportDocuments(String brand, int model, double cylinder){
		String out ="";
        for(int i = 0; i < vehicles.size(); i++) {
			out+="There's no record of that vehicle in the store";
			if(vehicles.get(i).getBrand().equalsIgnoreCase(brand) && vehicles.get(i).getModel()==model && vehicles.get(i).getCylinderCapacity()==cylinder ){
				
				if (vehicles.get(i).getPropertyCardtImg().equalsIgnoreCase("")){
					out+= "Does not have property card";
				}else {
					out+= "The property card code is:" + vehicles.get(i).getPropertyCardtImg() + "\n";			
				}
				
				if (vehicles.get(i).getSoatYear()==2022){
					out += "\nSOAT valid" + "\n" +
					vehicles.get(i).getSoatString();	
				}if (vehicles.get(i).getSoatYear()<=2021){
					out += "\nSOAT expired" + "\n" + 
					vehicles.get(i).getSoatString();
				}else{
					out += "\nThere is no SOAT registred" + "\n" ;}

				if (vehicles.get(i).getMechanicalTechnicalYear()==2022){
					out += "\nRevision Mechanical Technical valid" + "\n" +
					vehicles.get(i).getMechanicalTechnicalString() + "\n";		
				}
				if (vehicles.get(i).getMechanicalTechnicalYear()<=2021){
					out += "\nRevision Mechanical Technical expired" + "\n" +
					vehicles.get(i).getMechanicalTechnicalString() + "\n";	
				}else{
					out += "\nThere is no  Mechanical Technical registred" + "\n" ;}			
				
				out="The vehicle has a price of "+ (vehicles.get(i).getSalePrice());
			}
        }		
		return out;
	}		
	
	//REQUERIMIENTO 5
	public String parkingMap(){
		String out="";
		for (int i=0; i<f1; i++ ) { // filas numbers.length
			for (int j=0; j <c1; j++) { //columnas numbers[0].length
				out += map[i][j] + " ";
			}
			out += "\n";
		}		
		return null;
	}

	//REQUERIMEITNPO 6
	public String reportRangeYears(){
		return null;

	}	

}
	