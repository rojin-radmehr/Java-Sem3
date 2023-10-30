package classexercise;

public interface Vehicle {
	String getBrand();
	String getSpeed();
	double getPrice();
}

class Car implements Vehicle {
	private String brand;
	private String speed;
	private double price;
	
	Car(String brand,String speed, double price) {
		this.brand=brand;
		this.price = price;
		this.speed= speed;
	}
	@Override
	public String getBrand() {
		return brand;
	}
	
	@Override
	public String getSpeed() {
		return speed;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
}