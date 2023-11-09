package static1; //20231108

public class Circle2 {
	
	// 멤버변수
	// 원의 반지름은 Circle 객체마다 서로 다른 값을 가지기 때문에 멤버변수로 정의한다.
	double r;
	
	// 정적변수
	// 원주율은 Circle 의 종류에 상관없이 항상 3.14다.(상수값)
	static final double PI = 3.14; // 상수값은 변수명을 대문자로 적는 게 관례
	
	public Circle2(double r) {
		this.r = r;
	}
	
	public double around() {
		return 2*PI*r;
	}
	
	public double area() {
		return PI*r*r;
	}
}
