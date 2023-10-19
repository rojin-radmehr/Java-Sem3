package Class;

import java.util.Scanner;

public class DayOfWeek {
	private int number;
	Scanner scanner = new Scanner(System.in);
	public void matchtheDay() {
		
		System.out.println("Give a number :");
		number = scanner.nextInt();
		switch(number) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default :
			System.out.println("That is not a valid number please try again.");
		}
	}
}
