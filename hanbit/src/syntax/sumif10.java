package syntax;

/**
 * 2016. 4. 16.
 * sumif10.java
 *qkrcus@naver.com
 *story : for -loop + if-branch 수열의 합 
 * 
 */
public class sumif10 {
	public static void main(String[] args) {
		// for-loop 과 syso를 한번만 써서 홀수합, 짝수합을 구하시오.
		int oddsum=0 , evensum=0;
		for ( int i = 1; i<=10; i++) {
		if (i%2 == 1) {
			oddsum += i ; 
		}
		else if (i%2 == 0) {
			evensum += i;
			
		}
		}
		System.out.println("홀수의 합 ="+oddsum+"이고, 짝수 합은 "+evensum+"이다.");
	}
}
