package bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserService uService = new UserServiceImpl();
		System.out.println("통장을 몇 개까지 관리합니까");
		AdminService aService = new AdminserviceImpl(100);
		while(true){
			System.out.println("[사용자 메뉴] 1.통장개설 2.입금 3. 출금 4.잔액조회 5.해지  0.종료");
			System.out.println("[관리자메뉴] 101.통장 개설 102.조회(계좌) 103.조회(이름) 104.계좌 수  105.해지 0.종료");
			switch (scanner.next()) {
			case "1":
				System.out.println("통장을 개설하시려면 성함, 비번, 초기 입금액을 입력하세요");
				System.out.println(uService.openAccount(scanner.next(), scanner.nextInt(), scanner.nextInt()));
				break;
			case "2": 
				System.out.println("입금액을 입력하세요");
				System.out.println(uService.deposit(scanner.nextInt()));
				break;
			case "3":System.out.println("출금액을 입력하세요");
				System.out.println(uService.withdraw(scanner.nextInt()));
				break;
			case "4":
				System.out.println(uService.searchRestMoney());
				break;
			case "5":
				break;
			case "101":
				System.out.println("통장을 개설하시려면 성함, 비번, 초기 입금액을 입력하세요");
				System.out.println(aService.openAccount(scanner.next(), scanner.nextInt(), scanner.nextInt()));
				break;
			case "102":
				System.out.println("조회하려는 계좌번호를 입력하시오");
				AccountBean a= aService.searchAccountByAccountNo(scanner.nextInt());
				System.out.println((a== null) ? "조회하려는 계좌번호는 존재하지 않습니다": a.toString());
				break;
			case "103":
				System.out.println("조회하려는 이름을 입력하시오");
				AccountBean[] arr = aService.searchAccountsByName(scanner.next());
				if (arr.length == 0 ) {
					System.out.println("조회하려는 이름이 존재하지않습니다.");
				} else {
					for (int i = 0; i < arr.length; i++) {
						System.out.println(arr[i]);
				}
				
				}
				break;
			case "104":
				System.out.println("전체계좌 수 :" +aService.countAll());
				break;
			case "105":
				System.out.println("해지하려는 계좌번호를 입력하시오");
				System.out.println(aService.closeAccount(scanner.nextInt()));
				break;
			case "0":System.out.println("**********종료*********");return;

			default:System.out.println("메뉴에 있는 번호를 입력하시오");
				break;
			}
		}
	}
}
