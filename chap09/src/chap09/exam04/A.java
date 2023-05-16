package chap09.exam04;

public class A {
	//필드 
	public int field1;
	int field2;
	private int field3;
	
	//생성자
	public A() {
		field1=1; // (O)
		field2=1; // (O)
		field3=1; // (O) 동일 클래스 내에서 접근 가능
		
		method1(); // (O)
		method2(); // (O)
		method3(); // (O) 동일 클래스 내에서 접근 가능
	}
	//메소드 
	public void method1() {}
	void method2() {}
	private void method3() {}
}
