package lotto;

public class LottoBean {
	private int money;
	private int number;
	private int count;
	// ALT + shift + S + R 
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getNumber() {
		setNumber();
		return number;
	}
	public void setNumber() {
		this.number = (int) (Math.random()*45+1);
		
	}
	public int getCount(){
		setcount(bean);
		return count;
	}
	public void setCount(int count){
		this.count = bean.getMoney()/1000;
	}
	
	
}
