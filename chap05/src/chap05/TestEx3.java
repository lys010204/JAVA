/**
 *1~1000정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램 
 */
package chap05;
import java.util.Scanner;
public class TestEx3 {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("num : ");
		int num=stdin.nextInt();
		int hap = 0;
		for (int i=num;i<=1000;i+=num) {
				hap = hap + i;
		}
		System.out.println(hap);
	}
	
}
