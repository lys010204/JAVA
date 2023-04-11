/**
 * 2023.04.04
 * 이용상
 * 숫자를 입력받아 숫자 크기의 별을 가진 직각삼각형 만들기
 */
package chap05;
import java.util.Scanner;
public class NestedLoop {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("num : ");
		int num = stdin.nextInt();
		int i = 1;
		
		while (i<=num) {
			int j=1;
			while (j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
