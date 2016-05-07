package grade;

public class GradeServiceImpl implements GradeService {
	// 총점 구하기
	@Override
	public int getTotal(GradeBean grade) {
		return 0;

	}

	// 평균 구하기
	@Override
	public int getAvg(GradeBean grade){
		int avg = (getTotal(grade))/4;
		return avg;
	}

	@Override
	public String getGrade(GradeBean grade) {
		// TODO Auto-generated method stub
		return null;
	}

// 학점구하기 : getGrade
/*
 * /* 평균점수가 ; 90 이상 A; 80 이상 B; 70 이상 C; 60 이상 D; 50 이상 E; 50 미만 F 학점입니다.;
 * 
 */
}