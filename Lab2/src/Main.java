import java.util.Scanner;

import factory.Dealership;
import factory.Motorcycle;
import factory.MotorcycleWarehouse;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dealership dealership = new Dealership();
		MotorcycleWarehouse warehouse;
		Motorcycle motorcycle;
		int userMake = 0;
		int userModel = 0;
		
		do {
			try {
				System.out.println("Enter the number corresponding to the motorcycle brand you would like to order:");
				System.out.println("1. Honda");
				System.out.println("2. Yamaha");
				System.out.println("3. Harley-Davidson");
				System.out.println("Enter 9 to quit.");
				userMake = scanner.nextInt();
				
				if (userMake == 9) {
					break;
				} else {
					warehouse = dealership.pickBrand(userMake);
					
					System.out.println("Enter the number corresponding to the motorcycle model you would like to order:");
					System.out.println("1. Cruiser");
					System.out.println("2. Sport");
					System.out.println("3. Adventure");
					userModel = scanner.nextInt();			
		
					motorcycle = warehouse.buildMotorcycle(userModel);
					System.out.printf("The total due for the " + motorcycle.getDescription() +" is " + "%.2f", motorcycle.cost());
					System.out.print("\n \n");
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e);
			}
		} while (userMake != 9);
		
		scanner.close();
	}
}
