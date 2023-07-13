package Day03;

public class Ex04_Foreach {
	public static void main(String[] args) {
		String week[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		for(int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " ");
		}
		System.out.println();
		
		//foreach
		//배열 또는 컬렉션의 모든 요소를 순서대로 반복하는 반복문
		//for(자료형 요소명 : 배열) { }
		for (String day : week) {
			System.out.print(day + " ");
		}
		System.out.println();
	}
}
