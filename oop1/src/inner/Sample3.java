package inner; //20231113

public class Sample3 {
	private int value1;
	static int value2;
	
	public void method2() {
		
	}
	
	public void method3() {
		
	}
	
	public void method1() {
		// 지역변수
		int x = 10;
		int y = 20;
		
		x = 30;
		
		/*
		 * 로컬 내부 클래스(메소드 내에서 정의된 내부클래스)
		 *  - 메소드 내부에 정의된 클래스
		 *  - 접근제한자, static 붙일 수 없음
		 *  - 해당 메소드가 실행되는 동안만 사용 가능하고, 메소드 내부에서만 사용 가능
		 *  - 로컬 내부 클래스에서는 외부클래스의 모든 변수, 모든 메소드 사용 가능
		 *  - 로컬 내부 클래스가 위치한 메소드의 지역변수 중에서는 상수처럼 동작하는 변수만 사용 가능(값이 바뀐 변수는 접근 불가)
		 */
		class Inner3 {
			public void method() {
				System.out.println(value1);
				System.out.println(value2);
//				System.out.println(x); // 컴파일 오류, 값이 변하는 지역변수는 사용 불가
				System.out.println(y);
				method2();
				method3();
			}
		}
	}
}
