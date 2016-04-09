package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Minus.java
 *qkrcus@naver.com
 *story : 뺼샘 문법 
 * 
 */
public class Minus {
	public static void main(String[] args) {
		System.out.println("두수의 빼기프로그램");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번 째 수 ");
		int a = scanner.nextInt();
		System.out.println("두 번 째 수 ");
		int b = scanner.nextInt();
		int c = a-b ;
		System.out.println(a +" -"+ b + " = "+ c   );
		
	}
}
