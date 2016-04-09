package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * multi.java
 *qkrcus@naver.com
 *story :곱셈 문법 
 * 
 */
public class multi {
	public static void main(String[] args) {
		int a=0, b=0, c=0; // 지역변수 초기화
		System.out.println("====곱셈 문법====");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번쨰 수 입력");
		a = scanner.nextInt();
		System.out.println("첫번쨰 수 입력");
		b = scanner.nextInt();
		c = a * b;
		System.out.println(a + "x" + b + "=" + c);
		
	}
}
