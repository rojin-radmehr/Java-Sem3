package classexercise;

import java.util.Scanner;

 abstract class AbstractExample {
	abstract void customerPin();
	void printInfo() {
		System.out.println("Abstract class");
	}
	
}
class Bank extends AbstractExample{
	@Override
	void customerPin() {
		System.out.print("Enter Your Pin: ");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		System.out.print("Enter Amount: ");
		float amt = sc.nextFloat();
		System.out.print("Withdraw cash & card! ");
		sc.close();
	}
	void printInfo() {
		super.printInfo();
		System.out.println("Extended class");
	}
}

