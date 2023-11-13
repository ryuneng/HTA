package lang; //20231113

public class ContactApp {
	public static void main(String[] args) {
		Contact c1 = new Contact();
		Contact c2 = new Contact();
		
		c1.name = "홍길동";
		c1.phone = "010-1234-5678";
		
		c2.name = "김유신";
		c2.phone = "010-1111-2222";
		
		/*
		 * String toString()
		 *  - Object의 메소드
		 *  - 객체의 "클래스명@해시코드값"을 문자열로 반환한다.
		 */
		System.out.println(c1.toString()); // class Contact에서 toString 재정의하기 전의 결과 : lang.Contact@2f92e0f4 (패키지.클래스명@해시코드)
		System.out.println(c2.toString());
		
		// 참조변수값을 출력하면 참조변수값이 출력되는 것이 아니라, 참조변수가 참조하는 객체의 toString()메소드가 반환하는 값이 출력된다.
		System.out.println(c1);
		System.out.println(c2);
		
		String str1 = new String("안녕하세요");
		String str2 = "안녕하세요";
		
		System.out.println(str1.toString()); // String에서 재정의한 toString()이 실행됨
		System.out.println(str2.toString());
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
