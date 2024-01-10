package modifier.p1; //20231113

public class App1 {
	public static void main(String[] args) {
		/*
		 * App1은 Sample1, Sample2와 같은 패키지에 있는 클래스
		 *  - App1은 Sample1, Sample2를 import 구문 없이 사용 가능
		 *  - App1은 default 접근제한이 적용된 Sample1, public 접근제한이 적용된 Sample2 전부 접근이 가능하다.
		 */
		Sample1 sample1 = new Sample1();
		Sample2 sample2 = new Sample2();
		
	}
}
