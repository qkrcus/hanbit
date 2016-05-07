package bank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AdminserviceImpl implements AdminService{
	private AccountBean[] list;
	private int count;
	
	public AdminserviceImpl(int size) {
		list = new AccountBean[size];
	}
	@Override
	public String openAccount(String name, int password, int Money) {
		// 통장개설
		AccountBean account = new AccountBean();
		account.setOwnerName(name);
		account.setPassword(password);
		account.setRestMoney(Money);
		list[count] = account; 
		count++;
		return account.toString();
	}

	@Override
	public AccountBean searchAccountByAccountNo(int accountNo) {
		// 계좌번호로 통장조회
		AccountBean temp = null ;
		for (int i = 0; i < count; i++) {
			if (list[i].getAccountNo()==accountNo) {
				temp =list[i];
				break;
			}
		}
		return temp;
	}

	@Override
	public AccountBean[] searchAccountsByName(String name) {
		// 이름으로 통장 조회
		AccountBean[] temp = new AccountBean[searchCountByName(name)];
		int idx = 0;
		for (int i = 0; i < count; i++) {
			if (list[i].getOwnerName().equals(name)) {
				temp[idx] = list[i];
				idx++;
			}
				
			}
		
		
		return temp;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 계좌 해지
		String result = "삭제하려는 계좌번호가 존재하지 않습니다";
		for (int i = 0; i < count; i++) {
			if (list[i].getAccountNo()==accountNo) {
				//맨뒤의 것을 어쩌구 저쩌구 
				list[i] = list[count-1];
				list[count-1]=null;
				count--;
				result = "삭제성공";
				
			}
		}
		return result;
	}

	@Override
	public int countAll() {
		// 전체 계좌 수 조회
		
		return count;
	}

	@Override
	public int searchCountByName(String name) {
		// 한 개인의 계좌 수 조회
		int cnt = 0 ;
		for (int i = 0; i < count; i++) {
			if (list[i].getOwnerName().equals(name)) {
				cnt++;
			}
		}
		return cnt;
	}

}
