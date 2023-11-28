package classexercise;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		//lambda without return
		Addition addition = (int a, int b) -> (a+b);
		System.out.println(addition.add(100,200));
		
		//lambda with return
		Addition addition2 = (int a, int b) -> {
			return (a+b);
		};
		System.out.println(addition2.add(200, 300));
		
		// List and lambda
		List<String> names = new ArrayList<String>();
		names.add("abcd");
		names.add("efgh");
		names.add("ijkl");
		names.forEach((n) -> System.out.println(n));
		
		
		
		
	}
}

interface Addition {
	int add(int a, int b);
}
