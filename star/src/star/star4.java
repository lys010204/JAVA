package star1;

import java.util.Scanner;

public class star4 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세여 : ");
		int num = stdin.nextInt();
		
		for (int i=0;i<=num;i++)
		{	
			for (int k=0;k<num-i;k++)
				System.out.print(" ");
			
			for (int j=1;j<=2*i-1;j++)
				{
					System.out.print("*");
				}
			System.out.println();
		}
	}
}
