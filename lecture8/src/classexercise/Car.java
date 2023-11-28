package classexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Car {
	
	private int id;
	private String brand;
	private double price;

	
	
	public Car(int id, String brand, double price) {
		this.id = id;
		this.brand = brand;
		this.price = price;
	}



	public static void main(String[] args) {
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car(1, "BMV", 8000));
		cars.add(new Car(4, "Toyota", 5000));
		cars.add(new Car(3, "Ferrari", 25000));
		cars.add(new Car(2, "Mercedes", 22000));
		cars.add(new Car(5, "Audi", 23000));
		
		cars.stream().filter(a -> a.price < 10000).forEach((n)->System.out.println(n.brand));
		
		
		
		System.out.println("****************************************");
		List<Car> carNames = cars.stream().filter(a -> a.price < 10000).collect(Collectors.toList());
		for (Car ex : carNames) {
			System.out.println(ex.brand);
		}
		
		System.out.println("****************************************");
		
		List<Car> carId = cars.stream().sorted((id1, id2) -> id1.id - id2.id).collect(Collectors.toList());
		for (Car ex : carId) {
			System.out.println(ex.id + "--" + ex.brand);
		}

	}

}
