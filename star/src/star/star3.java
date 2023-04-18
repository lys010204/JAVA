package star1;

import java.util.Scanner;

public class star3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세여 : ");
		int num = stdin.nextInt();
		
		for (int i=1;i<=num;i++)
		{
			for (int k=num-i;k>=0;k--)
				System.out.print(" ");
	
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

