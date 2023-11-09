package static1; //20231108

public class StaticSample {
	int x;
	static int y; // 정적 변수 = 상수
	
	public void m1() {
		// 멤버 메소드에서는 멤버변수, 정적변수를 사용할 수 있다.
		x = 10;
		StaticSample.y = 20;
	}
	
	public void m2() {
		// 멤버 메소드에서는 멤버메소드, 정적메소드를 사용할 수 있다.
		m1();
		StaticSample.m3();
	}
	
	// 정적 메소드 : 주로 여러 클래스에서 반복적으로 자주 사용되는 기능을 정의할 때 사용
	public static void m3() {
		// 정적 메소드에서는 멤버변수를 사용할 수 없다.
//		 x = 10; // 오류
		// 정적변수는 사용 가능
		StaticSample.y = 20;
	}
	
	public static void m4() {
		// 정적 메소드에서는 멤버메소드를 사용할 수 없다.
//		m1(); // 오류
		// 정적메소드는 사용 가능
		StaticSample.m3();
	}
}
