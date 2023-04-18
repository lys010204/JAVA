/**
 * null 과 nullPointException
 * 참조변수의 == 연산과 equals() 메소드
 */
package chap06;

public class ArrayRefferance1 {

	public static void main(String[] args) {
//		int[] intArray=null;
//		intArray[0]=10;
		
		String strVal1="java";
		String strVal2="java";
		
		if(strVal1==strVal2) {
			System.out.println("str1,str2 same refferance");
		}
		else
			System.out.println("str1,str2 different refferance");
		
		if (strVal1.equals(strVal2)) {
			System.out.println("str1,str2 same string");
		}
		
		String strVal3=new String("yslee");
		String strVal4=new String("yslee");
		if(strVal3==strVal4) {
			System.out.println("str3,st4 same refferance");
		}
		else
			System.out.println("str3,str4 different refferance");

		if (strVal3.equals(strVal4)) {
			System.out.println("str3,str4 same string");
		}
		
	}

}
