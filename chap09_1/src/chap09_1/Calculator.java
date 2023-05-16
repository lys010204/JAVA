/**
 * 정적 멤버 이름 (static)
 */
package chap09_1;

public class Calculator {
	static double pi=3.14159; // 정적 필드 
	int field1;
	
//	static void Method() {
//		this.field1 = 10; // 정적 메소는 this 키워드 못씀 
//	}
	
	static int plus(int x,int y) { // 정적 메소드 
		return x+y;
	}
	
	static int minus(int x,int y) { // 정적 메소드 
		return x-y;
	}
	
}
