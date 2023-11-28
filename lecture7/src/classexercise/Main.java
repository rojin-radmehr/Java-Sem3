package classexercise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceExample fin = (name,value) -> {
			System.out.println("Hello lambda expression!\n" + name + " " + value);
		};
		fin.test("Abcd", 0);
		
	}

}
