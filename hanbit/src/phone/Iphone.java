package phone;

public class Iphone extends CelPhone{
	private String data;
	public Object name;
	public final static String  KIND = "스마트폰";
	public final static String  BRAND = "아이폰";
	public String getData() {
		return data;
	}
	public void setData(String name, String data) {
		super.setCompany("애플"+BRAND);
		//super.portable
		super.setPortable(true);
		//call(name)
		super.setCall(name);
		this.data = 
				super.getMove()+ "\t"
				+super.getCompany()+ "을 사용해서, \t"
				+super.isPortable()+"에게 '"
				+data + "' 라고 문자를 보냄";
	}
	@Override
	public String toString() {
		return KIND+"이기때문에 " +this.data;
	}
	
	
}
