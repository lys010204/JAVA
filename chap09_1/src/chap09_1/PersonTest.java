package chap09_1;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("1234-5678","홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa"; // final 변경 불가
//		p1.ssn = "777-7777"; // final 변경 불가 
		p1.name = "Lee"; // 가능 
		

	}

}
