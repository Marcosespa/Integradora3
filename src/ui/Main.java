package ui;

import java.beans.DesignMode;
import java.util.Scanner;
import model.ConcessionaireManager;

/*
To compile: javac -cp src src/ui/Main.java -d bin
To excecute: java -cp bin ui.Main
*/

public class Main {
	
	private Scanner sc;
	private ConcessionaireManager manager;

	
	public Main(){
		sc= new Scanner(System.in);
		//calculator = new MatrixCalculator();
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to the vehicle dealer");
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Main menu, please pick an option\n" +
				"(1) Register vehicles (new or used) for sale. \n" +
				"(2) Show the contents of all matrices \n"+
				"(3) Numeric matrices\n"+
				"(4) String matrices\n" +  
				"(0) To leave the application"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			registerVehicle();
			break;
		case 2:
			calculatePrice();
            break;
		case 3:
			reportVehicles();
			break;

		case 4:
			
			break;
		
		default:
			System.out.println("Error, wrong option");
		
		}
	

	}

	public void registerVehicle() {
		System.out.println("Registring the vehicle ....");
		System.out.println("Please select  the type of vehicle you want to register \n 1.) Car \n 2.) Motorcycle");
		int decision=sc.nextInt();
		sc.nextLine();

		if(decision==2){// CREAR UNA MOTO NUEVO 
			registerMotorcycle();
		}else{ // REGISTRA UN CARRO USADO
			//VEHICULE ATRIBUTES
			double basePrice;
			double salePrice;
			String brand;
			int model;
			double cylinderCapacity;
			double mileage;
			String type;
			String plate;
			int doorsNumber;
			String typeWindows;

			String carType;	
			
			//DOCUMENTS ATRIBUTE
			// SOAT
			double priceSoat;
			int yearSoat;	
			double covergeAmount;
			String imageDocSoat;
			//TECNOMECANICA 
			double priceTM;
			int yearTM;			
			double gasLevels;
			String imageDocTM;
			//TARJETA DE PROPIEDAD
			double priceTP;
			int yearTP;		
			String owner;			
			String imageDocTP;

			System.out.println("Registring the car ....");


			System.out.println("Please select  the base price of the vehicle");
			basePrice=sc.nextInt();
			sc.nextLine();
			System.out.println("Please select  the sale price of the vehicle");
			salePrice=sc.nextInt();
			sc.nextLine();
			System.out.println("Please select  the brand of the vehicle");
			brand=sc.nextLine();
			sc.nextLine();
			System.out.println("Please select the model of the vehicle");
			model=sc.nextInt();			
			sc.nextLine();
			System.out.println("Please select the cylinder capacity of the vehicle");
			cylinderCapacity=sc.nextDouble();					
			sc.nextLine();
			System.out.println("Please select the milage of the vehicle");
			mileage=sc.nextDouble();
			sc.nextLine();
			System.out.println("Please select the number of doors of the vehicle");
			doorsNumber=sc.nextInt();
			sc.nextLine();
			System.out.println("Please select the type of doors of the vehicle \n 1.) Polarizada \n 2.)No polarizada");
			int tWindows=sc.nextInt();	
			sc.nextLine();


			if(tWindows==1){
				typeWindows="Polarizada";
			}else{
				typeWindows="No Polarizada";
			}

			System.out.println("Please select the type of the vehicle \n "
			+ "1.) SEDAN \n" +
			" 2.)VAN \n ");
			int tcar=sc.nextInt();	
			sc.nextLine();
			if(tcar==1){
				carType="SEDAN";
			}else{
				carType="VAN";
			}			


			System.out.println("Please select the type of the vehicle \n 1.) new \n 2.) used ");
			int d=sc.nextInt();	
			sc.nextLine();

			if(d==1){ // MANDO LOS DATOS DE LOS VEHICULOS CUANDO SON NUEVOS
				plate="Empty plate";
				type="NEW";
				// SOAT EMPTY
				priceSoat=0;
				yearSoat=0;	
				covergeAmount=0;	
				imageDocSoat="";
				//TECNOMECANICA PREGUNTAR

				System.out.println("Please select the mechanical technical price");
				priceTM=sc.nextDouble();	
				sc.nextLine();
				System.out.println("Please select the year of the tecno");
				yearTM=sc.nextInt();
				sc.nextLine();			
				System.out.println("Please select the gas level of the vehicule");
				gasLevels=sc.nextDouble();	
				sc.nextLine();
				System.out.println("The Soat number it's going to be aleatory");
				imageDocTM=manager.TMGenerator();
				sc.nextLine();

				//TARJETA DE PROPIEDAD VACIA 
				priceTP=0;
				yearTP=0;		
				owner="";		
				imageDocTP="";

                if(yearTM<2022){

                    salePrice += 500000;
                }else{
                    salePrice += 0;
                }						


			}else{ // LOS DATOS CUANDO ES UN VEHICULO DE SEGUNDA

				System.out.println("Please select the plate of the vehicle");
				plate=sc.nextLine();
				sc.nextLine();
				type="USED";

				// EL VEHICULO TIENE SOAT
				System.out.println("Please select the vehicule price");
				priceSoat=sc.nextDouble();	
				sc.nextLine();
				System.out.println("Please select the year of the soat");
				yearSoat=sc.nextInt();
				sc.nextLine();
				System.out.println("Please select the coverage amount of the soat");
				covergeAmount=sc.nextDouble();		
				sc.nextLine();
				System.out.println("The Soat number it's going to be aleatory");
				imageDocSoat=manager.soatGenerator();
				sc.nextLine();


				
				// EL VEHICULO TIENE TECNOMECANICA 
				System.out.println("Please select the mechanical technical price");
				priceTM=sc.nextDouble();
				sc.nextLine();
				System.out.println("Please select the year of the tecno");
				yearTM=sc.nextInt();
				sc.nextLine();
				System.out.println("Please select the gas level of the vehicule");
				gasLevels=sc.nextDouble();	
				sc.nextLine();
				System.out.println("The mechanical Technical number it's going to be aleatory");
				imageDocTM=manager.TMGenerator();
				sc.nextLine();

				//TARJETA DE PROPIEDAD DEL VEHICULO
				System.out.println("Please select the price of the property card");
				priceTP=sc.nextDouble();
				sc.nextLine();
				System.out.println("Please select the year of the property card");
				yearTP=sc.nextInt();		
				sc.nextLine();
				System.out.println("Please select the name of the owner of the property card");
				owner=sc.nextLine();
				sc.nextLine();
				System.out.println("The Property Card number it's going to be aleatory");
				imageDocTP=manager.TMGenerator();				
				sc.nextLine();

                if(yearTM<2022){
                    salePrice += 500000;
                }
				if(yearSoat<2022){
                    salePrice += 500000;
				}
	

			}

				



			System.out.println("Please select the type of gasoline of the vehicle \n 1.) gasoline \n 2.) electric \n 3.) hybrid ");
			int d1=sc.nextInt();
			sc.nextLine();
			if(d1==1){ // GASOLINE CAR
				double gasolineTankCapacity;
				String typeGasoline="";
				double oilConsumeByKm;
				System.out.println("Please select the type of gasoline capacity of the vehicle ");
				gasolineTankCapacity=sc.nextDouble();
				sc.nextLine();
				System.out.println("Please select the type of gasoline of the vehicle \n 1.)Extra \n 2.) Regular \n 3.) diesel");
				int d2=sc.nextInt();
				sc.nextLine();
				if(d2==1){
					typeGasoline="Extra";
				}if(d2==2){
					typeGasoline="Regular";
				}if(d2==3){
					typeGasoline="Diesel";
				}
				System.out.println("The oil consume by km it's being calculated \n");
				oilConsumeByKm = gasolineTankCapacity*(cylinderCapacity/150);	

				if(d==2){
					salePrice=salePrice*0.9;
				}
				manager.addCarGasoline(basePrice, salePrice, brand, model, cylinderCapacity, mileage, type, plate, doorsNumber, typeWindows, carType, gasolineTankCapacity, typeGasoline, oilConsumeByKm,priceSoat,yearSoat,covergeAmount,imageDocSoat,priceTM,yearTM,gasLevels,imageDocTM,priceTP,yearTP,owner,imageDocTP);



			}if(d1==2){// ELECTRIC CAR 
				String chargerType="";
				double batteryDuration;
				double batteryConsumption;

				System.out.println("Please select the battery duration of the vehicle by km");
				batteryDuration=sc.nextDouble();
				sc.nextLine();
				System.out.println("Please select the charger type of the vehicle \n 1.) fast \n 2.) normal ");
				int d3=sc.nextInt();		
				sc.nextLine();

				if(d3==1){
					chargerType="Fast";
					batteryConsumption=(batteryDuration+13)*(cylinderCapacity/100);
				}else{
					chargerType="Normal";
					batteryConsumption=(batteryDuration+18)*(cylinderCapacity/100);

				}
				System.out.println("Please select the battery duration of the vehicle by km");
				batteryDuration=sc.nextDouble();
				sc.nextLine();
								
				salePrice=salePrice*1.20;
				
				if(d==2){
					salePrice=salePrice*0.9;
				}
				
				manager.addCarElectric(basePrice, salePrice, brand, model, cylinderCapacity, mileage, type, plate, doorsNumber, typeWindows, carType, chargerType, batteryDuration,batteryConsumption,priceSoat,yearSoat,covergeAmount,imageDocSoat,priceTM,yearTM,gasLevels,imageDocTM,priceTP,yearTP,owner,imageDocTP);
			


			}if(d1==3){// HYBRID CAR
				//GASOLINE ATRIBUTES
				double gasolineTankCapacity;
				String typeGasoline="";
				double oilConsumeByKm;
				//ELECTRIC ATRIBUTES
				String chargerType="";
				double batteryDuration;
				double batteryConsumption;

				System.out.println("Please select the type of gasoline capacity of the vehicle ");
				gasolineTankCapacity=sc.nextDouble();
				sc.nextLine();
				System.out.println("Please select the type of gasoline of the vehicle \n 1.)Extra \n 2.) Regular \n 3.) diesel");
				int d2=sc.nextInt();
				if(d2==1){
					typeGasoline="Extra";
				}if(d2==2){
					typeGasoline="Regular";
				}if(d2==3){
					typeGasoline="Diesel";
				}
				System.out.println("The oil consume by km it's being calculated \n");
				oilConsumeByKm = gasolineTankCapacity*(cylinderCapacity/180);	
				// ELECTRIC
				System.out.println("Please select the battery duration of the vehicle by km");
				batteryDuration=sc.nextDouble();				
				sc.nextLine();
				System.out.println("Please select the charger type of the vehicle \n 1.) fast \n 2.) normal ");
				int d3=sc.nextInt();		
				if(d3==1){
					chargerType="Fast";
					batteryConsumption=batteryDuration*(cylinderCapacity/200);
				}else{
					chargerType="Normal";
					batteryConsumption=(batteryDuration+7)*(cylinderCapacity/200);
				}
				
				salePrice=salePrice*1.15;

				if(d==2){
					salePrice=salePrice*0.9;
				}	
				manager.addCarHybrid(basePrice, salePrice, brand, model, cylinderCapacity, mileage, type, plate, doorsNumber, typeWindows, carType, gasolineTankCapacity, typeGasoline, oilConsumeByKm, chargerType, batteryDuration,batteryConsumption,priceSoat,yearSoat,covergeAmount,imageDocSoat,priceTM,yearTM,gasLevels,imageDocTM,priceTP,yearTP,owner,imageDocTP);			

			}



		}

	}

	public void registerMotorcycle() {

		double basePrice;
		double salePrice;
		String brand;
		int model;
		double cylinderCapacity;
		double mileage;
		String type;	
		String plate;
		//MOTORCYCLE ATRIBUTES
		double gasolineCapacity;
		double oilConsume;
		String MotoType="";
		//DOCUMENTS ATRIBUTE
		// SOAT
		double priceSoat;
		int yearSoat;	
		double covergeAmount;
		String imageDocSoat;
		//TECNOMECANICA 
		double priceTM;
		int yearTM;			
		double gasLevels;
		String imageDocTM;
		//TARJETA DE PROPIEDAD
		double priceTP;
		int yearTP;		
		String owner;			
		String imageDocTP;

		System.out.println("Registring the motorcycle ....");

		System.out.println("Please select  the base price of the vehicle");
		basePrice=sc.nextInt();
		sc.nextLine();
		System.out.println("Please select  the sale price of the motorcycle");
		salePrice=sc.nextInt();
		sc.nextLine();
		System.out.println("Please select  the brand of the motorcycle");
		brand=sc.nextLine();
		System.out.println("Please select the model of the motorcycle");
		model=sc.nextInt();			
		System.out.println("Please select the cylinder capacity of the motorcycle");
		cylinderCapacity=sc.nextDouble();					
		System.out.println("Please select the cylinder capacity of the motorcycle");
		cylinderCapacity=sc.nextDouble();	
		System.out.println("Please select the milage of the vehicle");
		mileage=sc.nextDouble();				
		
		System.out.println("Please select the gasoline Capacity of the motorcycle");
		gasolineCapacity=sc.nextDouble();		
		System.out.println("The oil consume by km it's being calculated \n");
		oilConsume = gasolineCapacity*(cylinderCapacity/75);	
		System.out.println("Please select the type of the motorcycle\n 1.) Standard \n 2.) Sport \n 3.) Scooter \n 4.) Cross");
		int d2=sc.nextInt();
		if(d2==1){
			MotoType="Standard";
		}if(d2==2){
			MotoType="Sport";
		}if(d2==3){
			MotoType="Scooter";
		}if(d2==4){
			MotoType="Cross";
		}

		System.out.println("Please select the type of the vehicle \n 1.) new \n 2.) used ");
		int d=sc.nextInt();	
		if(d==1){ // MANDO LOS DATOS DE LOS VEHICULOS CUANDO SON NUEVOS
			plate="Empty plate";
			type="NEW";
			// SOAT EMPTY
			priceSoat=0;
			yearSoat=0;	
			covergeAmount=0;
			imageDocSoat ="";

			//TECNOMECANICA PREGUNTAR

			System.out.println("Please select the mechanical technical price");
			priceTM=sc.nextDouble();	
			System.out.println("Please select the year of the tecno");
			yearTM=sc.nextInt();
			System.out.println("Please select the gas level of the vehicule");
			gasLevels=sc.nextDouble();	
			System.out.println("The Soat number it's going to be aleatory");
			imageDocTM=manager.TMGenerator();

			//TARJETA DE PROPIEDAD VACIA 
			priceTP=0;
			yearTP=0;		
			owner="";	
			imageDocTP="";
			
			salePrice=salePrice*1.04;

			if(yearTM<2022){

				salePrice += 500000;
			}else{
				salePrice += 0;
			}	



		}else{ // LOS DATOS CUANDO ES UN VEHICULO DE SEGUNDA

			System.out.println("Please select the plate of the vehicle");
			plate=sc.nextLine();					
			type="USED";

			// EL VEHICULO TIENE SOAT
			System.out.println("Please select the vehicule price");
			priceSoat=sc.nextDouble();	
			System.out.println("Please select the year of the soat");
			yearSoat=sc.nextInt();
			System.out.println("Please select the coverage amount of the soat");
			covergeAmount=sc.nextDouble();		
			System.out.println("The Soat number it's going to be aleatory");
			imageDocSoat=manager.soatGenerator();


			
			// EL VEHICULO TIENE TECNOMECANICA 
			System.out.println("Please select the mechanical technical price");
			priceTM=sc.nextDouble();	
			System.out.println("Please select the year of the tecno");
			yearTM=sc.nextInt();
			System.out.println("Please select the gas level of the vehicule");
			gasLevels=sc.nextDouble();	
			System.out.println("The mechanical Technical number it's going to be aleatory");
			imageDocTM=manager.TMGenerator();

			//TARJETA DE PROPIEDAD DEL VEHICULO
			System.out.println("Please select the price of the property card");
			priceTP=sc.nextDouble();
			System.out.println("Please select the year of the property card");
			yearTP=sc.nextInt();			
			System.out.println("Please select the name of the owner of the property card");
			owner=sc.nextLine();
			System.out.println("The Property Card number it's going to be aleatory");
			imageDocTP=manager.TMGenerator();				

			salePrice=salePrice*0.98;

			if(yearTM<2022){
				salePrice += 500000;
			}
			if(yearSoat<2022){
				salePrice += 500000;
			}


		}
	

		manager.addMotorcycle(basePrice, salePrice, brand, model, cylinderCapacity, mileage, type, plate, gasolineCapacity, oilConsume, MotoType,priceSoat,yearSoat,covergeAmount,imageDocSoat,priceTM,yearTM,gasLevels,imageDocTM,priceTP,yearTP,owner,imageDocTP);
	}

	public void calculatePrice(){
		System.out.println("Let's calculate the vehicle price....");
		System.out.println("Please take a look of all the vehicles we have");
		System.out.println(manager.showVehicles());

		System.out.println("Please select the brand of the vehicle you want to calculate the price");
		String brand=sc.nextLine();
		sc.nextLine();
		System.out.println("Please select the model of the vehicle you want to calculate the price");
		int model=sc.nextInt();
		sc.nextLine();
		System.out.println("Please select the cylinder of the vehicle you want to calculate the price");
		double cylinder=sc.nextDouble();

		System.out.println(manager.calculatePrice(brand,model,cylinder));
	}

	public void reportVehicles(){
		System.out.println("Please chose the type of report you wish. \n 1.) Type of vehicle \n 2.) Type of gasoline \n 3.) New or used");
		int decision= sc.nextInt();
		switch (decision){
			case 1:
				System.out.println("Please select the type of vehicle \n 1.) Car \n 2.) Motorcycle");
				int d1=sc.nextInt();
					switch(d1){
						case 1:// REPORTE DE TODOS LOS CARROS
							//reportCars();
							break;
						case 2: // REPORTE DE TODAS LAS MOTOS
							//reportMotorcycle;
							break;
					}
				break;
			case 2:
				System.out.println("Please select the type of gasoline \n 1.) Gasoline \n 2.) Electric \n 3.) Hybrid");
				int d2=sc.nextInt();
				switch(d2){
					case 1:
					//	reportGasoline();
						break;
					case 2:
						//reportElectric();
						break;
					case 3:
						//reportHybrid();
						break;
				}	
				break;	
			case 3:
			System.out.println("Please select the type  \n 1.) new \n 2.) used \n ");
			int d3=sc.nextInt();
			switch(d3){
				case 1:
				//	reportNew();
					break;
				case 2:
					//reportUsed();
					break;
				}				
			break;
					





		}
	}








}