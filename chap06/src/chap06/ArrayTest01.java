package chap06;
import java.util.Scanner;
public class ArrayTest01 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int i;
		double sum=0.0,avg;
		double dnum[] = new double[5]; //배열 선언 
		System.out.println("dnum 배열길이: "+dnum.length);
		System.out.print("초기화 하지 않은 dnum[]값 : ");
		for(i=0;i<dnum.length;i++)
			System.out.print(dnum[i]+" ");
		
		System.out.println();
		
		for(i=0;i<dnum.length;i++) {
			System.out.print("dnum["+i+"] 번째 데이터 입력 : ");
			dnum[i]=stdin.nextDouble();
		}
		
		for (i=0;i<dnum.length;i++)
			sum+=dnum[i];
		System.out.println("배열의 합은 : "+ sum);
		avg = sum/dnum.length;
		System.out.println("배열의 평균은 : "+ avg);
			
	}

}
