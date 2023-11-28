package midterm;

import java.util.Scanner;

abstract class Vehicle {
	void printInfo() {
		System.out.println("Vehicle Details");
	}
	abstract void vehicleInfo();
}
class Car extends Vehicle { //this is the child of the Vehicle class
	public void vehicleInfo() {
		// we ask for the details 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter car brand: ");
		String brand = sc.nextLine();
		System.out.print("Enter car model: ");
		String model = sc.nextLine();
		System.out.print("Enter car price: ");
		String price = sc.nextLine();
		System.out.print("Car availability: ");
		String av = sc.next();
		sc.close();
		
		System.out.println();
		super.printInfo(); //user the printInfo function of the parent class
		// then we return the details
		System.out.println("Car brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Availability: " + av);
		
	}
}

