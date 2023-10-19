package Class;

import java.util.Scanner;

public class votingEligibility {
	private int age;
	Scanner scanner = new Scanner(System.in);

	public void Eligibility() {

		System.out.println("How old are you?");
		age = scanner.nextInt();
		if (age >= 18) {
			System.out.println("You ARE Eligible to vote and you should!");
		} else {
			System.out.println("You are too young to vote!");
		}
	}
}
