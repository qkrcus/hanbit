package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 16. maxmin.java qkrcus@naver.com story : 배열 + forloop
 * 
 */
public class maxmin {
	/**
	 * [문제]
	 * 한 반에 5명의 학생이 시험을 치렀습니다. 
	 * 선생님이 5명의 점수를 입력하자마자 바로 최고점과 최저점이 출력되는 프로그램을 완성하시오.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("===점수를 입력하면 최고점이 출력됩니다. ====");
		System.out.println("총 3명의 점수만 입력이 가능합니다. 입력해 주세요"); 
		Scanner scanner = new Scanner(System.in);
		int max=0, min=0;
		int[] scores = new int[3];
		scores[0] = scanner.nextInt();
		scores[1] = scanner.nextInt();
		scores[2] = scanner.nextInt();
		
		if ((scores[0] > scores[1]) && (scores[0]>scores[2])) {
		    max = scores[0]; 
		}else if (scores[1] > scores[2]) {
		    max= scores[1]; 
		}else {
			max= scores[2];	
		
		}
		if ((scores[0] < scores[1]) && (scores[0]<scores[2])) {
		    min = scores[0]; 
		}else if (scores[1] < scores[2]) {
		    min= scores[1]; 
		}else {
			min= scores[2];	
		
		}

	System.out.println(max);
	System.out.println(min);
}
}
