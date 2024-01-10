package modifier.p3;

public class Sample4 {
	Sample3 sample3 = new Sample3();
	
	public void method() {
		// private 접근제한이 적용된 value1은 접근할 수 없다.
//		sample3.value1 = 10; // 컴파일 오류 발생
		
		// default 접근제한이 적용된 value2는 접근 가능
		sample3.value2 = 20;
		
		// protected 접근제한이 적용된 value3는 접근 가능
		sample3.value3 = 30;
		
		// public 접근제한이 적용된 value4는 접근 가능
		sample3.value4 = 40;
	}
}
