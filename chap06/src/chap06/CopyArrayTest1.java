/**
 * 2023.04.11
 * 1차원 배열의 복사 
 */
package chap06;

public class CopyArrayTest1 {

	public static void main(String[] args) {
		int num1[] = {10,20,30};
		int num2[] = {40,50,60};
		
		num2 = num1;
		num2[2] = 200;
		
		System.out.print("num1의 값: ");
		for(int i:num1)
			System.out.print(i+" ");
		
		System.out.print("\nnum2의 값: ");
		for(int i:num2)
			System.out.print(i+" ");
		
		int num3[] = {100,200,300};
		int num4[] = {400,500,600};
		
		for(int i=0;i<num3.length;i++) {
			num4[i] = num3[i];
		}
		num4[2] = 999;
		
		System.out.print("\nnum3의 값: ");
		for(int i:num3)
			System.out.print(i+" ");
		
		System.out.print("\nnum4의 값 ");
		for(int i:num4)
			System.out.print(i+" ");
		
		
	}

}
