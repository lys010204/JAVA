/**
 * 2023.03.28
 * 이용상 
 * 직급과 나이를 입력받아서 직급이 7 또는 8이고 나이가 40대이면 연금 80%
 * 직급이 5 또는 6이고 나이가 50대이면 연금 100% 
 * 그외의 경우에는 연금 대상자가 아님 
 */
package chap04;
import java.util.Scanner;
public class TestEx1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("직급 입력 : ");
		int position = stdin.nextInt();
		Scanner stdin2=new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = stdin2.nextInt();
		
		if (position==7 || position==8) {
			if (40<=age && age<=49) {
				System.out.println("연금 80%");
			}
			else {
				System.out.print("연금 대상자가 아님");
			}
		}
		else if (position==5 || position==6) {
			if (50<=age && age<=59) {
				System.out.println("연금 100%");
			}
			else {
				System.out.println("연금 대상자가 아님");
			}
		}
		else {
			System.out.println("연금 대상자가 아님 ");
		}
	}
}
