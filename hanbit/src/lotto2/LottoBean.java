package lotto2;

public class LottoBean {
	private int money;
	private int number;
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
	
	
	
}
