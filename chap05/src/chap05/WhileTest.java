/**
 * 2023.03.28
 * 이용상 
 * 반복문(while) 1~10 합계 구하기 
 */
package chap05;

public class WhileTest {

	public static void main(String[] args) {
		int sum=0, cnt=1;
		
		while (cnt<=10) {
			sum=sum+cnt;
			cnt += 1;
		}
		System.out.println("1부터10까지의 합(while) : " + sum);
		
		//for 반복문 
		int total = 0;
		
		for (sum=0,total=1;total<=10;total++)
		{
			sum=sum+total;
		}
		System.out.println("1부터10까지의 합(for) : " + sum);

		//do while 반복문 
		int hap = 0, cnti = 1;
		do
		{
			hap = hap+cnti;
			cnti += 1;
		}while(cnti<=10);
		System.out.println("1부터10까지의 합(do-while) : " + hap);
	}
	
}
