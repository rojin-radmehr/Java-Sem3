package Class;

import java.util.Scanner;

public class caseChange {
	Scanner scanner = new Scanner(System.in);
	public void change() {
		String input;
		System.out.println("Type a string :");
		input = scanner.nextLine();
		if (input.toLowerCase().equals(input)) {
			System.out.println("Changed Case String :" + input.toUpperCase());
		} else {
		System.out.println("Changed Case String :" + input.toLowerCase());
		}
	}
}
