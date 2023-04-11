/**
 * 2차원 배열의 값은 난수로 초기화 
 * 2차원 배열의 각 행의 합계 출력 
 */
package chap06;
import java.util.Random;
public class MultiArrayTest {

	public static void main(String[] args) {
		Random ran = new Random();
		int[][] score = new int[4][4];
		
		for(int i=0;i<4;i++)
			for (int j=0;j<4;j++) 
				score[i][j] = ran.nextInt(10);
			
		for(int k=0;k<4;k++) {
			int sum=0;
			for(int value:score[k]) {
				System.out.print(value + " ");
				sum+=value;
			}
			System.out.println("의 합계는 : "+ sum);
		}
	}
}
