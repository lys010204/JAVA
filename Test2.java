package Test;

abstract class Calculate{
	abstract int calculate(int a, int b);
}
class Add1 extends Calculate{
	int calculate(int a, int b) {
		return a+b; 
	}
}
class Sub1 extends Calculate{
	int calculate(int a, int b) {
		return a-b; 
	}
}
class Mul1 extends Calculate{
	int calculate(int a, int b) {
		return a*b; 
	}
}
class Div1 extends Calculate{
	int calculate(int a, int b) {
		return a/b; 
	}
}

public class Test2 {

	public static void main(String[] args) {
			System.out.println("==추상 메소드를 이용한 다형성==");
			Calculate c=new Add1();
			System.out.println(c.calculate(5,2));
			c = new Sub1();
			System.out.println(c.calculate(5,2));
			c = new Mul1();
			System.out.println(c.calculate(5,2));
			c = new Div1();
			System.out.println(c.calculate(5,2));
			

	}

}
