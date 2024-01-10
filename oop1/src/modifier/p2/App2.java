package modifier.p2; //20231113

/*
 * default 접근제한이 적용된 Sample1은 다른 패키지의 클래스에서 접근할 수 없다.
 *  - import 도 할 수 없음
 */
// import modifier.p1.Sample1; // 컴파일 오류 발생

/*
 * public 접근제한이 적용된 Sample2는 다른 패키지의 클래스에서 접근할 수 있다.
 *  - import 구문으로 포함시킨 후 사용 가능
 */
import modifier.p1.Sample2;

public class App2 {
	public static void main(String[] args) {
		/*
		 * App2는 Sample1, Sample2와 다른 패키지에 존재하는 클래스
		 *  - 다른 패키지에 존재하는 클래스는 반드시 import 구문 작성 후 사용 가능
		 */
//		Sample1 sample1 = new Sample1(); // 컴파일 오류
		Sample2 sample2 = new Sample2();
	}
}
