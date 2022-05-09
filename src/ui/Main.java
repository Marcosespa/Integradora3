package ui;

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

            break;
	
		case 3:
			//createNumericMatrix();
			break;

		case 4:
			
			break;
		
		default:
			System.out.println("Error, wrong option");
		
		}
	

	}

	private void registerVehicle() {
		System.out.println("Registring the vehicle ....");
		int decision;
		System.out.println("Please select  the type of vehicle you want to register \n 1.) Car \n 2.) Motorcycle");
		decision=sc.nextInt();

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
			//TARJETA DE PROPIEDAD
			double priceTP;
			int yearTP;			
			double gasLevels;

			System.out.println("Registring the car ....");


			System.out.println("Please select  the base price of the vehicle");
			basePrice=sc.nextInt();
			System.out.println("Please select  the sale price of the vehicle");
			salePrice=sc.nextInt();
			System.out.println("Please select  the brand of the vehicle");
			brand=sc.nextLine();
			System.out.println("Please select the model of the vehicle");
			model=sc.nextInt();			
			System.out.println("Please select the cylinder capacity of the vehicle");
			cylinderCapacity=sc.nextDouble();					
			System.out.println("Please select the milage of the vehicle");
			mileage=sc.nextDouble();
			System.out.println("Please select the number of doors of the vehicle");
			doorsNumber=sc.nextInt();
			System.out.println("Please select the type of doors of the vehicle \n 1.) Polarizada \n 2.)No polarizada");
			int tWindows=sc.nextInt();	
			if(tWindows==1){
				typeWindows="Polarizada";
			}else{
				typeWindows="No Polarizada";
			}

			System.out.println("Please select the type of the vehicle \n "
			+ "1.) SEDAN \n" +
			" 2.)VAN \n ");
			int tcar=sc.nextInt();	
			if(tcar==1){
				carType="SEDAN";
			}else{
				carType="VAN";
			}			


			System.out.println("Please select the type of the vehicle \n 1.) new \n 2.) used ");
			int d=sc.nextInt();	
			if(d==1){ // MANDO LOS DATOS DE LOS VEHICULOS CUANDO SON NUEVOS
				plate="Empty plate";
				type="NEW";

			}else{ // LOS DATOS CUANDO ES UN VEHICULO DE SEGUNDA
				System.out.println("Please select the plate of the vehicle");
				plate=sc.nextLine();					
				type="USED";
			}

			System.out.println("Please select the type of gasoline of the vehicle \n 1.) gasoline \n 2.) electric \n 3.) hybrid ");
			int d1=sc.nextInt();	
			if(d1==1){ // GASOLINE CAR
				double gasolineTankCapacity;
				String typeGasoline="";
				double oilConsumeByKm;
				System.out.println("Please select the type of gasoline capacity of the vehicle ");
				gasolineTankCapacity=sc.nextDouble();
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
				oilConsumeByKm = gasolineTankCapacity*(cylinderCapacity/150);	

				manager.addCarGasoline(basePrice, salePrice, brand, model, cylinderCapacity, mileage, type, plate, doorsNumber, typeWindows, carType, gasolineTankCapacity, typeGasoline, oilConsumeByKm);



			}if(d1==2){// ELECTRIC CAR 
				String chargerType="";
				double batteryDuration;
				double batteryConsumption;

				System.out.println("Please select the battery duration of the vehicle by km");
				batteryDuration=sc.nextDouble();
				System.out.println("Please select the charger type of the vehicle \n 1.) fast \n 2.) normal ");
				int d3=sc.nextInt();		

				if(d3==1){
					chargerType="Fast";
					batteryConsumption=(batteryDuration+13)*(cylinderCapacity/100);
				}else{
					chargerType="Normal";
					batteryConsumption=(batteryDuration+18)*(cylinderCapacity/100);

				}
				System.out.println("Please select the battery duration of the vehicle by km");
				batteryDuration=sc.nextDouble();
				manager.addCarElectric(basePrice, salePrice, brand, model, cylinderCapacity, mileage, type, plate, doorsNumber, typeWindows, carType, chargerType, batteryDuration,batteryConsumption);
			
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
				System.out.println("Please select the charger type of the vehicle \n 1.) fast \n 2.) normal ");
				int d3=sc.nextInt();		
				if(d3==1){
					chargerType="Fast";
					batteryConsumption=batteryDuration*(cylinderCapacity/200);
				}else{
					chargerType="Normal";
					batteryConsumption=(batteryDuration+7)*(cylinderCapacity/200);
				}
	
				manager.addCarHybrid(basePrice, salePrice, brand, model, cylinderCapacity, mileage, type, plate, doorsNumber, typeWindows, carType, gasolineTankCapacity, typeGasoline, oilConsumeByKm, chargerType, batteryDuration,batteryConsumption);			
			}



		}

	}

	private void registerMotorcycle() {

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

		System.out.println("Registring the motorcycle ....");

		System.out.println("Please select  the base price of the vehicle");
		basePrice=sc.nextInt();
		System.out.println("Please select  the sale price of the motorcycle");
		salePrice=sc.nextInt();
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
		System.out.println("Please select the type of the motorcycle\n 1.) new \n2.) used ");
		int d1=sc.nextInt();	
		if(d1==1){ // MANDO LOS DATOS DE LOS VEHICULOS CUANDO SON NUEVOS
			type="New vehicle";
			plate="EMPTY PLATE";

		}else{ // LOS DATOS CUANDO ES UN VEHICULO DE SEGUNDA
			type="Used vehicle";
			System.out.println("Please select the plate of the vehicle");
			plate=sc.nextLine();					
		}
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
		

		manager.addMotorcycle(basePrice, salePrice, brand, model, cylinderCapacity, mileage, type, plate, gasolineCapacity, oilConsume, MotoType);
	}

	
}