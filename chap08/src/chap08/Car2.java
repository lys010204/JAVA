package chap08;

public class Car2 {
	String company = "쉐보레";
	String model;
	String color;
	int maxspeed;
	
	public Car2() {
		
	}
	public Car2(String model) {
		this(model,"은색",250);
	}
	public Car2(String model, String color) {
		this(model,color,250);
	}
	public Car2(String model, String color, int maxspeed) {
		this.model=model;
		this.color=color;
		this.maxspeed=maxspeed;
	}
}
