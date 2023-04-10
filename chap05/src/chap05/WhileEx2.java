/**
 * 2023.04.04
 * 입력받은 숫자의 팩토리얼 계산
 * 이용상 
 */
package chap05;
import java.util.Scanner;
public class WhileEx2 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("num : ");
		int num = stdin.nextInt();
		
		int facvalue=num;
		
		while(num>1) {
			System.out.print(num + " * ");
			facvalue = facvalue*--num;
		}
		System.out.println("1 = " + facvalue);
	}
}