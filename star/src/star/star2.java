package star1;

import java.util.Scanner;
public class star {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세여 : ");
		int num = stdin.nextInt();
		
		for (int i=num;i>0;i--)
		{
			for (int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
