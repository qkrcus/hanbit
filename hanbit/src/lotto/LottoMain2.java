package lotto;

import java.util.Scanner;

public class LottoMain2 {
	public static void main(String[] args){
		
		LottoBean hong = new LottoBean();
		LottoService service = new LottoServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마치를 구입하십니까?");
		hong.setMoney(2500);
		service.setLottos(hong);
		int[][] lotttos = service.getLottos();
		for (int i = 0; i < lotttos.length; i++) {
			for (int j = 0; j < lotttos.length; j++) {
				System.out.print(lottos[i][j]+"\t");
			}
			System.out.println();
		}
			
		}
		
	}
	
}
