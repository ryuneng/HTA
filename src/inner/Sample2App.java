package inner; //20231113

public class Sample2App {
	public static void main(String[] args) {
		// 정적내부 클래스는 외부 클래스에 대한 객체 생성 없이 사용 가능
		Sample2.Inner2 inner2 = new Sample2.Inner2();
	}
}
