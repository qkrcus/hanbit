package lotto;

public abstract class LottoServiceImpl implements LottoService {
	int[][] lottos;
	int[] lotto; // 돈과 상관없이 생성되는 한 줄(숫자 6)
	private int count;

	public void setCount(int count){
			this.count = bean.getMoney()/1000;

	@Override
	public void setLottos(LottoBean bean) {
		// 로또 번호 만들기

		setCount(bean);
		this.lottos = new int[count][6];
		this.lotto = new int[6];
		int i = 0;
		if (count < 0) {
			this.lottos = null;
		} else {
			for (count = 0; count < lottos.length; count++) {
				while (true) {
					int num = bean.getNumber();
					if (isDuplication(count, num)) {
						continue;
					}
					lottos[count][i] = num;
					i++;
					if (i == lottos[count].length) {
						i = 0;
						break;
					}
				}
			}
		}

	}

	@Override
	public int[][] getLottos() {
		// 만들어진 로도 번호 가져오기

		return lottos;
	}

	@Override
	public void inputMoney(LottoBean bean) {
		// 입력된 돈을 가지고 몇장을 출력할 지 결정하기

	}

	@Override
	public int generateRandomNum() {
		//
		return 0;
	}

	@Override
	public boolean isDuplication(int count, int num) {
		//
		for (int i = 0; i < lottos[count].length; i++) {
			if (lottos[count][i] == num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void sort(int[] lotto) {
		// 오름차순으로 정렬하기
		for (int i = 0; i < lotto.length-1; i++) {
			for (int j = 0; j < lotto.length-i-1; j++) {
				if (lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp ;
					
					
				}
			}
				
			}
		}

	}

	@Override
	public int count(LottoBean bean) {

		return bean.getMoney();// 몫만 리턴하는 메소드
	}

}
