/**
 * 2023.04.04
 * 이용상
 * 두 숫자를 입력받아서 두 수 사이의 합계 출력하기 
 */
package chap05;
import java.util.Scanner;
public class TestEx5 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("num1 : ");
		int num1 = stdin.nextInt();
		
		Scanner stdin1=new Scanner(System.in);
		System.out.print("num2 : ");
		int num2 = stdin1.nextInt();
		
		int sum=0;
		
		if (num1<num2) {
			for (int i = num1;i<=num2;i++) {
				sum+=i;
			}
		}
		else {
			int temp=num1;
			num1=num2;
			num2=temp;
			for (int i = num1;i<=num2;i++) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
