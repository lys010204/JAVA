package chap08;

public class Car1 {
	String company = "쉐보레";
	String model;
	String color;
	int maxspeed;
	
	public Car1() {
		
	}
	public Car1(String model) {
		this.model = model;
	}
	public Car1(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public Car1(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
