package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex {
	Scanner scanner = new Scanner(System.in);
	
	public void evennumbers() {
		int number;
		System.out.println("Number? ");
		number = scanner.nextInt();
		for (int i=2; i<number; i=i+2) {
			System.out.print(i + "  "); 		
		}
	}
	public void compare() {
		int n1,n2;
		System.out.println("Number 1 ? ");
		n1 = scanner.nextInt();
		System.out.println("Number 2 ? ");
		n2 = scanner.nextInt();
		System.out.println("Maximum number is: "+Math.max(n1, n2)); 
	}
	
	public void grades() {
		String grade;
		System.out.println("Subject ? ");
		scanner.next();
		System.out.println("Letter Grade ? ");
		grade = scanner.next();
		switch(grade) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Try Harder");
			break;
		case "F":
			System.out.println("You Failed");
			break;
		default :
			System.out.println("That is not a valid Grade. please try again.");
		}
	}
	
	public void swapReverse() {
		String w,w1,w2;
		System.out.println("Words ? ");
		w = scanner.nextLine();
		String[] words = w.split(" ");
		w1 = words[0];
		w2 = words[1];
		String rev;
		rev ="";
		for (int i= w2.length()-1 ; i>=0 ; i-- ) {
			rev += w2.charAt(i);
		}
		System.out.println(rev + " " + w1); 
	}
	public void mixedCase() {
		String w;
		System.out.println("Word ? ");
		w = scanner.nextLine();
		String mcase;
		mcase ="";
		Random rand = new Random();
		for (char c : w.toCharArray() ) {
			int rand_int = rand.nextInt(3);
			if (rand_int == 0) {
				mcase += Character.toLowerCase(c);
			} else {
				mcase += Character.toUpperCase(c);
			}
		}
		System.out.println(mcase);
	}
}
