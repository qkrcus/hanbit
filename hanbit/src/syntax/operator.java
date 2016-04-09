package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * operator.java
 *qkrcus@naver.com
 *story : 더하기 프로그램
 * 
 */
public class operator {
public static void  main(String[] args) {
	System.out.println("두수의 더하기프로그램");
	Scanner scanner = new Scanner(System.in);
	System.out.println("첫번째 정수 입력");
	int a = scanner.nextInt();
	System.out.println("e두번쨰 정수 입력");
	int b = scanner.nextInt();
	int c = a + b;
	System.out.println(a + "+" + b + " = " +c);
	


   }
}
