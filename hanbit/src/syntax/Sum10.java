package syntax;

/**
 * 2016. 4. 16.
 * Sum10.java
 *qkrcus@naver.com
 *story : 1부터 10까지의 합
 * 
 */
public class Sum10 {
	public static void main(String[] args) {
		int sum=0;
	//	sum = 1 +2+3+4+5+6+7+8+9+10;
		for (int i = 1; i <= 10; i+=2) {
			sum += i;
			//System.out.print(i+"\t");
		}
		System.out.println(sum);
		sum = 0;
		
		for (int i = 2; i <= 10; i+=2) {
			sum += i;
			//System.out.print(i+"\t");
		}
		System.out.println(sum);

	}
}
