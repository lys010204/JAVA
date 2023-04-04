/**
 * 2023.03.28
 * 이용상
 * 조건문 연습 
 */
package chap04;
import java.util.Scanner;

public class SimpleTest1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input score : ");
		int grade=stdin.nextInt();
		
		if (grade>=90) {
			System.out.println("합격");
			System.out.println("축하");
		}
		else 
			System.out.println("불합격");
			
			
	}

}
