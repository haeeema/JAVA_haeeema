package Day15.Ex04_Rent;

public class Car extends Base {
	private String carNumber;
	private String carName;
	private String carColor;
	private int carSize;
	private String carMaker;

	// 차의 정보를 조회하는 메소드
	public String checkCarInfo() {
		System.out.println("렌트카 조회 시간 :" + showTime());
		System.out.println("렌트카를 조회합니다.");
		return "조회한 렌트카 정보";
	}

	// 새 차의 정보를 등록하는 메소드
	public void regCarInfo() {
		System.out.println("렌트카 등록 시간 :" + showTime());
		System.out.println("렌트카를 등록합니다.");
	}

	// 차의 정보를 수정하는 메소드
	public void modCarInfo() {
		System.out.println("렌트카 정보 수정시간 :" + showTime());
		System.out.println("렌트카 정보를 수정합니다.");
	}

	// 차의 정보를 삭제하는 메소드
	public void delCarInfo() {
		System.out.println("렌트카 정보 삭제 시간 :" + showTime());
		System.out.println("렌트카 정보를 삭제합니다.");
	}
}
