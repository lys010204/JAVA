package chap08;

public class CarTest {

	public static void main(String[] args) {
		Car mycar = new Car();
		// 필드값 읽기
		System.out.println("제작회사: " + mycar.company);
		System.out.println("모델명: " + mycar.model);
		System.out.println("현재속도: " + mycar.speed);
		
		mycar.speed=60;
		System.out.println("수정된 속도 : " + mycar.speed);
	}

}
