package RPS;

import java.util.Scanner;

/**
 * 2016. 4. 16. gameRPS.java qkrcus@naver.com story : 가위바위보게임
 * 
 */
public class GameRPS {
	/**
	 * [문제] 컴퓨터와 사용자간의 가위 바위 보 게임을 완성하시오. math.random()*E+S S는 경우의 수 최저값, E는 경우의
	 * 수 최고값
	 */

	public  String play(int scan){
		//----------------------------------------------------------------------
		int scissors = 1, rock = 2, paper = 3, rpsvalue = 0, comvalue = 0;
		String result = " ";
		Scanner scanner = new Scanner(System.in);
		rpsvalue = scan;
		comvalue = (int) (Math.random() * 3 + 1);
		switch (rpsvalue) {
		case 1:
			if (comvalue == 1) {
				
				result="사용자 가위  컴퓨터 가위";
			} else if (comvalue == 2) {
				
				result="사용자 가위 컴퓨터 바위";

			} else {
				result="사용자 가위 컴퓨터 보";

			}

			break;
		case 2:
			if (comvalue == 1) {
				result="사용자 바위 컴퓨터 가위";
			} else if (comvalue == 2) {
				result="사용자 바위컴퓨터 바위";

			} else {
				result="사용자 바위 컴퓨터 보";
				

			}
			break;
		case 3:
			if (comvalue == 1) {
				result="사용자 보 컴퓨터 가위";
			} else if (comvalue == 2) {
				result="사용자 보 컴퓨터 바위";

			} else {
				result="사용자 보컴퓨터 보";
				

			}
			break;
		default:
			result="1~3까지의 숫자만 입력바랍니다.";
			break;
		}
		
		return result;
	}
}
