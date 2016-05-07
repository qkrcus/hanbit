package lotto;

import lotto.LottoBean;


public class LottoMain {
	public static void main(String[] args) {
		
		LottoBean hong = new LottoBean();
		
		LottoBean kim = new LottoBean();
		
		LottoService service = new LottoServiceImpl();
		hong.setMoney(2000);
		service.setLottos(hong);
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
			service.sort(lottos[i]);
			for (int j = 0; j < lottos.length; j++) {
				System.out.println(lottos[i][j]+ "\t");
			}
			System.out.println();
		}
		
		
		
		System.out.println("귀하의 로또 장 수는 "+ service.count(hong)+"장 입니다." );
		int num = hong.getNumber();
		System.out.println("랜점숫자 결과"+ num);
		
	}
}
