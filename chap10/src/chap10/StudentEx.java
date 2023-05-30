package chap10;

public class StudentEx {

	public static void main(String[] args) {
		Student s = new Student("홍길동","1234-5678",1);
		
		System.out.println("name : " + s.name);
		System.out.println("ssn : " + s.ssn);
		System.out.println("studentNo : " + s.studentNo);

	}

}
