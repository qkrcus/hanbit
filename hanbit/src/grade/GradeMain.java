package grade;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * GradeMain.java
 *qkrcus@naver.com
 *story :성적표 프로그램 
 */
public class GradeMain {
	
	/**
	 * 과목별 점수를 입력받아서 총점, 평균, 학점을 구하는 프로그램을 완성하시오.
	 * (과목은 국어, 영어, 수학)
	 */
	
	public static void main(String[] args) {
		//---------------(1)-변수 선언========
		Scanner scanner = new Scanner(System.in);
		GradeBean grade = new GradeBean();
		GradeService service = new GradeServiceImpl();
		int total=0,avg=0;
		String name = "" ;
		String grd ="";
		
		//--------------(2)--파라미터 영역========
		name=scanner.next();
		System.out.println("국어,영어,수학 점수를 입력하시오");
		
		//-===================메소드 호출========
		grade.setKor(scanner.nextInt());
		grade.setEng(scanner.nextInt());
		grade.setMath(scanner.nextInt());
		grade.setJava(scanner.nextInt());
		//-------------리턴값 출력==========
		System.out.println(name + grd +": 학점");
		
		
	}
}
