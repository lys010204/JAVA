/**
 * 2023.04.04
 * 입력받은 수의 약수 구하기 
 * 이용상 
 */
package chap05;
import java.util.Scanner;
public class ForTest1 {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("num : ");
		int num = stdin.nextInt();
		
		System.out.print(num + "의 약수 :");
		for (int i=1;i<=num;i++) {
			if (num%i==0) {
				System.out.print(" "+i);
			}
		}
	}
}
