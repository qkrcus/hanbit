package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * inputsum.java
 *qkrcus@naver.com
 *story : 입력된 누적값 더하는 계산문제 
 * 
 */
public class inputsum {
	public static void main(String[] args) {
		System.out.println("1부터 누적되는 합계를 구할 마지막 수를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt(), sum = 0;
		for (int i = 1; i <= limit ; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + limit+ "까지의 합="+sum);
	}
}
