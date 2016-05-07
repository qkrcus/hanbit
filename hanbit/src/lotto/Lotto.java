package lotto;

public class Lotto {
	private int money;
	private int[][] lottos;
	int[][] lotto;
	
	public void setMoney(int money){
		this.money = money;
	}
	public int getMoney(){
		return money;
	}
	public void setLottos(LottoBean bean){
		// 2중 배열(lottos)에 this.generateRandomNum() 를 사용하여
		// 램덤 배열에 담는 코드 완성
		int count = count(bean);
		this.lottos = new int[count][6];
		this.lotto = new int[6];
		if (count<0) {
			this.lottos = null;
		}else{
			for (int i= 0; i < count; i++){
				for (int j=0; j <6; j++  )
					
			}
			
		}
		
		
	}
	public int[][] getLottos(){
		// 코드 완성 !!
		return lottos;
	}
	//------------------- get/set 필연 수순 ------------
	public void inputMoney(int money){
		this.money = money;
		lottos = new int[money/1000][6];
	}
	
	public int generateRandomNum(){
		// 로또의 램덤 숫자 생산
		int randomNum = 0;
		// 코드완성 !
		return randomNum;
	}
	public boolean isDuplication(int num){
		// 로또 번호의 중복여부 체크 
		boolean result = false; // 불린타입의 초기화는 거짓
		// 코드 완성 !
		return result;
	}
	public void sort(int[] arr){
		// 로또번호의 오름차순으로 정렬하기
		// 25, 3, 30, 1, 11 --> 1,3,11,25,30
		// 2중 for-loop 사용 + SWAP 정렬
		// 코드완성 !
	}
	public int count(int money){
		int count = 0;
		if (money < 1000) {
			return count;
		}
		return (int) Math.ceil(money/1000); // 몫만 리턴하는 메소드
	}
	
	
}
