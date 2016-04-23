package Kaup;

public class KaupServiceImpl implements Kaupservice {
	// Kaup 구하는 공식 넣기

	public int getidx(KaupBean kaup){
		int idx = kaup.getWeight()/kaup.getHeight()*kaup.getHeight()*10000;
		return idx;
	}


	public String getStatus(int idx){
		String result= "";
		
		if (idx >=24) {
			result ="과체중";
		}else if (idx >=20){
			result = "정상";
		}else if (idx >=15){
			result = "저체중";
		}else{  
			result = "심각";	
		}
		return result;
	}
}	
	