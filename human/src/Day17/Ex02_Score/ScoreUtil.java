package Day17.Ex02_Score;

public class ScoreUtil {
	public int calcScore(int score) throws UserDefinedException {
		 System.out.println("calcScore 메서드 시작");
		 if(score<=0 || score>=100)
			 throw new UserDefinedException("정확한 점수를 입력하세요." );
		 System.out.println("calcScore 메서드 끝");
		 return score;
		 }
}
