package grade;

public interface GradeService {
	public int getTotal(GradeBean grade);
	
	public int getAvg(GradeBean grade);

	public String getGrade(GradeBean grade);

}
