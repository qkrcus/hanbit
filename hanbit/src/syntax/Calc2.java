package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9. 
 * calc.java 
 * qkrcus@naver.com 
 * story : 브랜치 예제(계산기 프로그램)
 * 
 */
public class Calc2 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		
		String op = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산자 종류를 입력(+, -, *, /)");
		op = scanner.next();

		if (op.equals("+")) {
			System.out.println("두수의 더하기프로그램");
			System.out.println("첫번째 정수 입력");
			a = scanner.nextInt();
			System.out.println("e두번쨰 정수 입력");
			b = scanner.nextInt();
			c = a + b;
			System.out.println(a + "+" + b + " = " + c);
		} else if (op.equals("-")) {
			System.out.println("두수의 빼기프로그램");
			System.out.println("첫 번 째 수 ");
			a = scanner.nextInt();
			System.out.println("두 번 째 수 ");
			b = scanner.nextInt();
			c = a - b;
			System.out.println(a + " -" + b + " = " + c);
		} else if (op.equals("*")) {
			System.out.println("====곱셈 정수====");
			System.out.println("첫번쨰 수 입력");
			a = scanner.nextInt();
			System.out.println("첫번쨰 수 입력");
			b = scanner.nextInt();
			c = a * b;
			System.out.println(a + "x" + b + "=" + c);
		} else if (op.equals("/")) {
			System.out.println("=====정수 나눗셈 ======");
			System.out.println("첫 번 째 수");
			a = scanner.nextInt();
			System.out.println("두 번 째 수");
			b = scanner.nextInt();
			c = a / b;
			d = a % b;
			System.out.println(a + "/" + b + " = " + c + "...." + d);

		} else {
			System.out.println("연산 기호를 잘못 입력했습니다");
		}

	}
}
