package chap11;
class Parent{
	public void method1() {
		System.out.println("parent-method1");
	}
	public void method2() {
		System.out.println("parent-method2");
	}
}

class Child extends Parent{
	@Override
	public void method2() {
		System.out.println("Child-method2");
	}
	public void method3() {
		System.out.println("Child-method3");
	}
}
public class CastingTest {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // 자동 타입 변환(upcasting)
		parent.method1(); 
		parent.method2(); // 재정의된 메소드 호출됨 
//		parent.method3();
	}

}
