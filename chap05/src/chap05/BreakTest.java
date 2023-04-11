/**
 * 2023.04.04
 * 이용상 
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면
 */
package chap05;
import java.util.Scanner;
public class BreakTest {

	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		while (true) {
			Scanner stdin=new Scanner(System.in);
			System.out.println("숫자입력 : ");
			int num = stdin.nextInt();
			sum+=num;
			cnt++;
			if (sum>=1000) break;
		}
		int avg=sum/cnt;
		System.out.println(sum+" "+avg);
	}
}
