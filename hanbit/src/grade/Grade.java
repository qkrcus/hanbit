package grade;

public class Grade {
	public int getTotal(int kor, int eng, int math){
		int total = 0;
		total = kor + eng + math;
		return total;
	} 
	public int getAvg(int total){
		int avg = 0;
		avg = total/3;
		return avg;
		
	}
}
