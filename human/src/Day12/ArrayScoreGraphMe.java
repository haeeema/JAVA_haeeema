package Day12;

public class ArrayScoreGraphMe {
	
	int score[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
	
	int sum;
	int min = Integer.MAX_VALUE; 
	int max = Integer.MIN_VALUE;
	double avg;
	
	public void processGrades(){
		
		greeting();
		average();
		minimum();
		maximum();
		graphic();
		
	}
	public void greeting() {
		System.out.println("Java Programming");
		System.out.println();
	}
	
	public void average() {
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = (double) sum / score.length;
		System.out.println("과목평균 : " + avg);
	}
	
	public void minimum() {
		for (int i = 0; i < score.length; i++) {
			if ( min > score[i] )
				min = score[i];
		}
		System.out.println("최저점수 : " + min);
	}
	
	public void maximum() {
		for (int i = 0; i < score.length; i++) {
			if ( max < score[i] )
				max = score[i];
		}
		System.out.println("최고점수 : " + max);
		System.out.println();
	}
	
	public void graphic() {
		for (int i = 0; i < score.length; i++) {
			System.out.print( i + "0-" + i + "9 : ");
			for (int j = 0; j < score.length; j++) {
				if (score[j] / 10 == i)
					System.out.print("*");
			}
			System.out.println();	
		}
		System.out.print("  100 : ");
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 100) {
				System.out.print("*");
			}
		}
	}
	
	public static void main(String[] args) {
		
		ArrayScoreGraphMe ac = new ArrayScoreGraphMe();
		ac.processGrades();
		
//		Greeting();
//		Average();
//		Minimum();
//		Maximum();
//
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(score[i] + " ");
//		}
//		System.out.println();
//		
//		Graphic();
		
	}
}
