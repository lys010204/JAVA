/**
 * 2023.04.18
 * Array 클래스 - system.arraycopy
 */
package chap06;
import java.util.Arrays;
public class ArrayCopy {

	public static void main(String[] args) {
		int num1[]= {10,20,30};
		int num2[]= {40,50,60};
		String str3[]={"java","array","copy"};
		String str4[]=new String[5];
		
		
		for (int i=0;i<num1.length;i++)
			num2[i]=num1[i];
		
		System.out.print("num2 value : ");
		for (int i:num2) 
			System.out.print(i+" ");
		
		System.arraycopy(str3,0,str4,0,3);
		
		System.out.print("\nstr4 value : ");
		
		for(String values:str4)
			System.out.print(values+" ");
		
		String str5[]=Arrays.copyOf(str3,2);
		
		System.out.print("\nstr5 values : ");
		
		for (String value:str5)
			System.out.print(value+" ");
	}

}
