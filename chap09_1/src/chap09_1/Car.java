package chap09_1;

public class Car {
	int speed;
	
	void run() {
		System.out.print(speed+"으로 달린다.");
	}
	
	public static void main(String[] args) {
//		speed=60; //정적 메소드 안에서 인스턴스 필드는 객체 생성 후 사용 
		
		Car mycar = new Car();
		mycar.speed=60;
		mycar.run();
	}

}
