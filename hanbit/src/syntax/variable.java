package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * variable.java
 *qkrcus@naver.com
 *story : 변수에 관한 문법 
 * 
 */
public class variable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===회원가입====");

		System.out.println("아이디:[   ]");
		String id = scanner.next();
		System.out.println("password:[    ]");
		String password = scanner.next();
		System.out.println("이름:[   ]");
		String name = scanner.next();
		System.out.println("생년월일()800101:   ");
		int birthday = scanner.nextInt();
		System.out.println("성인여부(성인 true, 미성년 false):  ");
		boolean isAdult = scanner.nextBoolean();
		System.out.println("키(소수점 첫재짜리까지):  ");
		double height = scanner.nextDouble();
		System.out.println("혈액형(A):  ");
		char blood = 'A';
		//string blood2 = "A"; 문자 한글자 표시 할때만 사
					
		
		
		
		
		
		
		
		
		
		

	}
}
