package chap07;

public class PlusMinusTest {

	public static void main(String[] args) {
		Plusminus ob1 = new Plusminus();
		String ssum, sminus;
		
		ssum=ob1.plus(50, 30);
		sminus=ob1.minus(50, 30);
		
		System.out.println(ssum);
		System.out.println(sminus);
		
	}

}
