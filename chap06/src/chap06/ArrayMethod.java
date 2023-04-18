/**
 * Array클래스의 주요 메소드 
 * 배열 조작 메소드는 1차원 배열에만 적용 
 * 2023.4.18
 */
package chap06;
import java.util.Arrays;
public class ArrayMethod {

	public static void main(String[] args) {
		int[] int1= {9,1,7,3,5,4,6,2,8,0};
		System.out.println("array : " + Arrays.toString(int1));
		
		Arrays.fill(int1, 3,5,33);
		System.out.println("after fill() " + Arrays.toString(int1));
		
		Arrays.sort(int1);
		System.out.println("after sort() "+ Arrays.toString(int1));
		
		System.out.println("33's location is : " + Arrays.binarySearch(int1,33));
	}
}
