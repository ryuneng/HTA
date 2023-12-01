package enum1; //20231201

public enum Grade {
	GOLD("골드", 0.1), SILVER("실버", 0.05), BRONZE("브론즈", 0.0125);
	
	// 1. 상수(고유한 값)
	private String name;
	private double depositRate;
	
	// 2. 생성자
	private Grade(String name, double depositRate) {
		this.name = name;
		this.depositRate = depositRate;
	}
	
	// 3. 고유한 값 별로 Getter 메소드 생성
	public String getName() {
		return name;
	}
	
	public double getDepositRate() {
		return depositRate;
	}
}
