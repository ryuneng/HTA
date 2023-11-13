package modifier.p4; //20231113

import modifier.p3.Sample3;

public class Sample3Child extends Sample3 {
	Sample3 sample3 = new Sample3();
	
	public void method() {
		// private 접근제한이 적용된 value1은 접근할 수 없다.
//		value1 = 10;	// 컴파일 오류
		
		// default 접근제한이 적용된 value2는 접근 불가
//		value2 = 20;	// 컴파일 오류
		
		// protected 접근제한이 적용된 value3는 상속받아서 접근 가능
		value3 = 30;
		
		// public 접근제한이 적용된 value4는 접근 가능
		value4 = 40;
	}
}
