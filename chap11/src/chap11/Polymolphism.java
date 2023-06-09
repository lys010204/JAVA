/**
 * 다형성 
 * 1. 서로다른 객체가 동일한 메세지에 대해 서로 다르게 응답하는 것 
 * 2. 상속, 형변환, 오버라이딩으로 실현 
 * 
 * 메소드 오버라이딩 제약조건
 * 1. 상위 클래스의 메소드와 동일한 원형이어야 한다.
 * 2. 상위 클래스 메소드의 접근 지정자 보다 범위를 좁혀 오버라이딩 할 수 없다.
 * 3. static, privates, final 로 선언된 메소드는 오버라이딩 할 수 없다.
 */
package chap11;

class Shape {
	public Shape next;
	
	public Shape() {
		next=null;
	}
	public void draw() {
		System.out.println("shape");
	}
}
class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
class circles extends Shape {
	public void draw() {
		System.out.println("circles");
	}
}
}
public class Polymolphism {

	public static void main(String[] args) {
		

	}

}
