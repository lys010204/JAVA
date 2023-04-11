/**
 * 두개의 숫자를 입력받아서 두 숫자 사이의 홀수값을 모두 더하여 출력하는 프로그램
 *  2023.04.04
 *  이용상 
 */
package chap05;
import java.util.Scanner;
public class TestEx4 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("num1 : ");
		int num1 = stdin.nextInt();
		
		Scanner stdin1=new Scanner(System.in);
		System.out.print("num2 : ");
		int num2 = stdin1.nextInt();
		int hap = 0;
		if (num1<num2) {
			for (int i=num1;i<=num2;i++) {
				if (i%2 == 1) {
					hap = hap+i;
				}
			}
		}
		else {
			int temp = num1;
			num1 = num2;
			num2 = temp;
			for (int i=num1;i<=num2;i++) {
				if (i%2 == 1) {
					hap = hap+i;
				}
			}
		}
		System.out.println(hap);
	}
}


