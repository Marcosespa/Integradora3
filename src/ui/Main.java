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


			
			
			System.out.println("Please select the type of the vehicle 1.) new 2.) used ");
			int d=sc.nextInt();	
			if(d==1){ // MANDO LOS DATOS DE LOS VEHICULOS CUANDO SON NUEVOS
				plate="Empty plate";
				type="NEW";
				manager.addCar(basePrice, salePrice, brand, model, cylinderCapacity, mileage, type, plate, doorsNumber, typeWindows, carType);

			}else{ // LOS DATOS CUANDO ES UN VEHICULO DE SEGUNDA
				System.out.println("Please select the plate of the vehicle");
				plate=sc.nextLine();					
				type="USED";
				manager.addCar(basePrice, salePrice, brand, model, cylinderCapacity, mileage, type, plate, doorsNumber, typeWindows, carType);

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
		int type;	
		String plate;
		
		System.out.println("Registring the motorcycle ....");


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
		System.out.println("Please select the cylinder capacity of the vehicle");
		cylinderCapacity=sc.nextDouble();	
		System.out.println("Please select the milage of the vehicle");
		mileage=sc.nextDouble();				
		System.out.println("Please select the type of the vehicle 1.) new 2.) used ");
		type=sc.nextInt();	
		if(type==1){ // MANDO LOS DATOS DE LOS VEHICULOS CUANDO SON NUEVOS
			plate="EMPTY PLATE";

		}else{ // LOS DATOS CUANDO ES UN VEHICULO DE SEGUNDA
			System.out.println("Please select the plate of the vehicle");
			plate=sc.nextLine();					

		}

	}

	
}