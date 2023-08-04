package Day21.Recap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class FruitTest04 {
	static HashMap<String, Number> map = new HashMap<String, Number>();
	
	public static void main(String[] args) {
		/** try 파일에서 데이터를 가져와서 calcFruit 함수에 넣는다.**/
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File("d:\\temp\\fruitData.txt")));
			String fruitLine = in.readLine();
			calcFruit(fruitLine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/** calcFruit 과일별로 갯수를 정리해준다.**/
	private static void calcFruit(String fruitLine) {
		StringTokenizer fruitTokens = new StringTokenizer(fruitLine, ",");
		System.out.println(fruitTokens);
		
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
}
