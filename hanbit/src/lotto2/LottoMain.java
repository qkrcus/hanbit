package lotto2;

public class LottoMain {
	public static void main(String[] args) {
		LottoBean hong = new LottoBean();
		LottoBean kim = new LottoBean();
		hong.setMoney(2000);
		int num = hong.getNumber();
		System.out.println("랜점숫자 결과"+ num);
		
	}
}
