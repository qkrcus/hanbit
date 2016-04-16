package syntax;

import java.util.Scanner;

public class MaxMin2 {
	public static void main(String[] args) {
		System.out.println("=======최고점과 최저점을 출력합니다.(만점=100, 빵점=0)=====");
		System.out.println("총 5명의 점수만 입력이 가능합니다. 입력해 주세요");
		Scanner scanner = new Scanner(System.in);

		int max=0, min =100;
		
		int[] scores = new int[5];
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}	
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
			if (min > scores[i]) {
				min = scores[i];
			}
		}	
		
		
		System.out.println("최고점 : "+ max+",최저점 : "+ min);
	}
}
