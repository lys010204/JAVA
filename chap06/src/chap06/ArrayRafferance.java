/**
 * 2023.4.18
 * null 과 nullPointException
 * 참조변수의 == 연산과 equals() 메소드 
 */

/**
 * 객체참조 배열
 * 참조타입(클래스, 인터페이스) 배열은 각 항목에 객체의 인자를 가짐 
 * String은 클래스 이므로 
 * String[] 배열은 각 항목에 문자열이 아닌, string 객체의 인자를 가짐 
 * String[]배열간 문자 비교는 == 연산자 대신 equals() 메소드 사용 
 */

package chap06;

public class ArrayRafferance {

	public static void main(String[] args) {
		String[] strArray=new String[3];
		strArray[0]="java";
		strArray[1]="java";
		strArray[2]=new String("java");
		
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[0]==strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		
	}

}
