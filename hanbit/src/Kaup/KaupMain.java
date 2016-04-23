package Kaup;

import java.util.Scanner;

import grade.GradeBean;
import grade.GradeService;
import grade.GradeServiceImpl;



public class KaupMain {
	public static void main(String[] args) {
		//---------------(1)-변수 선언========
		Scanner scanner = new Scanner(System.in);
		KoupBean koup = new KoupBean();
		KoupService service = new KoupServiceImpl();		

		while(true){
			System.out.println("======카우푸 지수 구하기 프로그램=====");
		    System.out.println("1번 계속, 2번 종료");
		    int key = scanner.nextInt();
		    switch (key) {
		    case 1:break;
		    
		    case 2:
		     System.out.println("시스템 종료입니다");return;
		     break;
		     

			default:System.out.println("1번,2번만 선택가능합니다");
				break;
			}
		}
}
