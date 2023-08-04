package Day21.Recap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class FruitTest04 {
	static HashMap<String, Number> map = new HashMap<String, Number>();

	public static void main(String[] args) {
		registerFruit();
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File("d:\\temp\\fruitData.txt")));
			String fruitLine = in.readLine();
			calcFruit(fruitLine);
			in.close();

			fileFruitList();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** calcFruit 과일별로 갯수를 정리해준다.**/
	private static void calcFruit(String fruitLine) {	
		StringTokenizer fruitTokens = new StringTokenizer(fruitLine, ",");
		
		/** while 토큰이 존재하는 동안에 계속 반복한다.**/
		while(fruitTokens.hasMoreTokens()) {
			String fruitName = fruitTokens.nextToken();
			int value = 0;
			boolean isExisted = false;
			
			Set set = map.keySet();
			Iterator ite = set.iterator();
			/** 
			 * while 토큰에서 나온 과일이름 !!한개!!와 맵 전체 이름을 비교해서 같다면 value 값을 하나 추가해서 맵에 다시 넣음
			 *  토큰에 있는 이름과 맵에서 무작위로 꺼낸 이름과 비교하는것이다!!! 
			 **/
			while (ite.hasNext()) {
				String keyName = (String) ite.next();
				if (fruitName.equals(keyName)) {
					value = (Integer) map.get(keyName);
					map.put(keyName, ++value);
					isExisted = true;
					break;
				}
			}
			if (isExisted == false) {
				map.put(fruitName, ++value);
			}
			value = 0;
			isExisted = false;
		}
	}

	private static void fileFruitList() {		
		try {	
			PrintWriter out = new PrintWriter(new FileWriter(new File("d:\\temp\\fruitArrange.txt"), false));
			
			out.println("Print the number of the fruit");
			out.println("=============================");
			
			Set set = map.keySet();
			Iterator ite = set.iterator();			
			while(ite.hasNext()) {
				String fruitName = (String) ite.next();
				int value = (Integer) map.get(fruitName);
				out.println(fruitName + " : " + value);
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void registerFruit() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.println("#### Register for fruit ####");
			System.out.println("1.사과, 2.귤, 3.수박, 4.포도, 5.자두. 0.종료");
			System.out.print("입 력 : ");
			
			int input = sc.nextInt();
			String menuName = "";
			if (input == 0) {
				System.out.println( count + "개의 등록을 완료합니다.");
				break;
			} else if ( input <= 0 || input >= 7) {
				System.out.println("등록되지 않은 과일입니다.");
			} else {
				count++;
				switch(input) {
				case 1: menuName = "사과"; map.get("사과"); break;
				case 2: menuName = "귤"; map.get("귤"); break;
				case 3: menuName = "수박"; map.get("수박"); break;
				case 4: menuName = "포도"; map.get("포도"); break;
				case 5: menuName = "자두"; map.get("자두"); break;
				}
				System.out.println(menuName + "이(가) 등록되었습니다.\n");
			}
		}sc.close();
	}
}














