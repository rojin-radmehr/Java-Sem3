package midterm;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
	public void q1() {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size: ");
		n = scanner.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter the list of values: ");
		for (int i=0; i<n; i++) {
			int number = scanner.nextInt(); //read the numbers
			al.add(number);
		}
		al.sort(null); //sort the array
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		for (Integer element : al) {
			if (element%2 == 0) { //if they are even
				even.add(element);
			} else { // if they are not even, they are odd
				odd.add(element);
			}
		}
		System.out.println("The even list : "+ even);
		System.out.println("The odd list : "+odd);
		
		even.addAll(odd);//Concatenate the two strings
		System.out.print("The numbers that are divisible by 3 or 5 are: ");
		for (Integer num : even) {
			if (num%3 == 0 || num%5 == 0) {
				System.out.print(num + " "); //print each one that meets the requirement
			}
		}
		scanner.close();
	}
}
