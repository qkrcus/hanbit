package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Divide.java
 *qkrcus@naver.com
 *story : 나눗셈 문법 
 * 
 */
public class Divide {
	public static void main(String[] args) {
		int a=0, b=0, c=0, d=0 ;
		System.out.println("=====나눗셈 문법======");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번 째 수" );
		a = scanner.nextInt();
		System.out.println("두 번 째 수");
		b = scanner.nextInt();
		c = a/b;
		d = a%b;
		System.out.println(a + "/" + b +  " = " + c +"...." + d);
		
		
		
	}
}
