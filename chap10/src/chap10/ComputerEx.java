package chap10;

public class ComputerEx {

	public static void main(String[] args) {
		int r=10;
		Calculator c =new Calculator();
		
		System.out.println(c.areaCircle(r));
		
		Computer cp = new Computer();
		System.out.println(cp.areaCircle(r));

	}

}
