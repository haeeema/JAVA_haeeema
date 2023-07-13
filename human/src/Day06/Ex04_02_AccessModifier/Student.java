package Day06.Ex04_02_AccessModifier;

import Day06.Ex04_01_AccessModifier.Person;

public class Student extends Person {
	public Student() {
		
	}

	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
	}
	
	public void defaultSetting() {
		name = "no name";
		height = 180;	// protected지만 상속받아 접근이 가능하다.
		//age = 33;		// default는 같은 패키지 안에서만 접근 불가능하다.
		//weight = 80;	// private은 해당 클래스에서만 접근 불가능하다.
		setAge(20);
		setWeight(50);
	}
}
