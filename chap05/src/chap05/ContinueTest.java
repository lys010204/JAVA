/**
 * 2023.04.04
 * 이용상 
 * 1~100까지의 숫자 중에서 사용자로부터 입력 받은 숫자의 배수의 합을 구하여라. 
 */
package chap05;
import java.util.Scanner;
public class ContinueTest {
	
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("num : ");
		int num = stdin.nextInt();
		int sum=0;
		int bnum=0;
		
		while(true) {
			if (bnum>=sum) continue;
			bnum += num;
			sum += bnum;			
		}
		System.out.println(sum);
	}
}