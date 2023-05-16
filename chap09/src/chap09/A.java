package chap09;

public class A {
	// 필드(멤버변수)
	A a1=new A(true);
	A a2=new A(1);
	A a3=new A("문자열");
	
	//생성자 
	public A(boolean b) {}
	A(int b){} //default 상태 
	private A(String s) {}
}
