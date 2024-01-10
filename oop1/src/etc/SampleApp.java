package etc; //20231110

import java.io.Serializable;

public class SampleApp {
	public static void main(String[] args) {
		// 객체가 특정 클래스나 특정 인터페이스 타입인지 체크하기
		Sample sample = new Sample();
		
		boolean result1 = sample instanceof Cloneable; // sample 참조변수가 참조하는 객체가 Cloneable과 연관이 있는지 체크
		boolean result2 = sample instanceof Serializable;
		boolean result3 = sample instanceof Comparable;
		
		System.out.println("복제 가능 여부: " + result1);
		System.out.println("직렬화 가능 여부: " + result2);
		System.out.println("정렬 가능 여부: " + result3);
	}
}
