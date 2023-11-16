package util; //20231116

public class MathApp {
	public static void main(String[] args) {
		/*
		 * java.lang.Math 클래스
		 *  - 수학연산과 관련된 정적메소드를 제공하는 클래스
		 *  - Math 클래스는 상수와 정적 메소드만으로 구성되어 있다.
		 */
		
		// Math 클래스의 상수값
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		/*
		 * int abs(int x), long abs(long x), double abs(long x)
		 *  - 절대값을 반환
		 */
		System.out.println("절대값: " + Math.abs(10));
		System.out.println("절대값: " + Math.abs(-10));
		
		/*
		 * int min(int x, int y), long min(long x, long y), double min(double x, double y)
		 *  - 두 수 중에서 작은 숫자를 반환
		 * int max(int x, int y), long max(long x, long y), double max(double x, double y)
		 *  - 두 수 중에서 큰 숫자를 반환
		 */
		System.out.println("작은 수: " + Math.min(12, 200));
		System.out.println("큰 수: " + Math.max(12, 200));
		
		/*
		 * double pow(double a, double b)
		 *  - a^b값을 반환 (b가 지수)
		 */
		System.out.println(Math.pow(2, 3)); // 결과: 8.0
		
		/*
		 * int round(float x), long round(double x)
		 *  - 반올림된 값을 반환
		 */
		System.out.println("반올림: " + Math.round(3.14));
		System.out.println("반올림: " + Math.round(3.56));
		
		/*
		 * double floor(double x)
		 *  - 전달받은 실수값에 대한 바닥값을 반환
		 *   (소수점 뒤에 어떤 숫자가 있든 반올림 안되고 소수점 앞의 숫자만 반환됨 -> 바닥값)
		 * double ceil(double x)
		 *  - 전달받은 실수값에 대한 천장값을 반환
		 *   (소수점 뒤에 1 이상의 숫자가 있으면 무조건 올림된 소수점 앞의 값이 반환됨 -> 천장값)
		 *   (예시) 페이징 처리할 때 사용(게시판 목록))
		 */
		System.out.println("floor 값: " + Math.floor(1.0));
		System.out.println("floor 값: " + Math.floor(1.1));
		System.out.println("floor 값: " + Math.floor(1.3));
		System.out.println("floor 값: " + Math.floor(1.6));
		System.out.println("floor 값: " + Math.floor(1.9));
		System.out.println("floor 값: " + Math.floor(2.0));
		
		System.out.println("ceil 값: " + Math.ceil(1.0));
		System.out.println("ceil 값: " + Math.ceil(1.1));
		System.out.println("ceil 값: " + Math.ceil(1.3));
		System.out.println("ceil 값: " + Math.ceil(1.6));
		System.out.println("ceil 값: " + Math.ceil(1.9));
		System.out.println("ceil 값: " + Math.ceil(2.0));
	}
}
