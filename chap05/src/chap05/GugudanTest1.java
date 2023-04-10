package chap05;
import java.util.Scanner;
public class GugudanTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("단을 입력하시오.");
		int dan = stdin.nextInt();

		for (int i=1;i<=9;i++) {
			System.out.println(dan +"*" +i + "=" +(dan*i));
		}

	}

}
