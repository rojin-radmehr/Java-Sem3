package Class;

import java.util.Scanner;

public class ReverseOrder {
	private String number;
	
	Scanner scanner = new Scanner(System.in);
	public void reverse() {
		System.out.println("Number?");
		number = scanner.next();
		String rev;
		rev ="";
		for (int i= number.length()-1 ; i>=0 ; i-- ) {
			rev += number.charAt(i);
		}
		System.out.println("Reversed Number: " + rev);
		
		
		
	}
}
