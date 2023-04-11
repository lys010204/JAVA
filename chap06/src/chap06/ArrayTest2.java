/**
 * 2023.04.11
 * 이용상
 * 1차원 정수 배열생성 후 가장 큰 값 찾기 
 */
package chap06;

public class ArrayTest2 {

	public static void main(String[] args) {
		int score[] = {88,97,53,92,68,82};
		int max=score[0];
		for (int i:score) {
			if (i>max)
				max=i;
		}
		System.out.println("배열 요소의 최대값은 "+max+"입니다.");

	}

}
