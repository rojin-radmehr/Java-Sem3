package classexercise;

interface ExampleInterface {
	void printInfo();
	default void printInfo1() {
		System.out.println("default Interface Class");
	}
}

abstract class ExampleAbstract{
	abstract void printInfo();
	void print() {
		System.out.println("Abstract class");
	}
}

class child extends ExampleAbstract implements ExampleInterface{
	@Override
	public void printInfo() {
		System.out.println("Class child");
	}
}
