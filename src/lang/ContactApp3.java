package lang; //20231114

public class ContactApp3 {
	public static void main(String[] args) {
		Contact c1 = new Contact();
		
		c1.name = "홍길동";
		c1.phone = "010-1111-1111";
		c1.email = "hong@gmail.com";
		c1.company = "중앙HTA";
		
		// Contact 객체를 clone() 이용해서 복제하기
		Contact c2 = c1.copy();
		System.out.println("* c2가 참조하는 객체 ===> c1을 복제한 Contact 객체");
		System.out.println(c2);
		System.out.println();
		
		c1.name = "홍길동1111"; // 복제 후 값을 변경하면 복제한 객체에는 값이 같이 바뀌지 않음 (복제는 완전히 다른 새로운 객체를 만들어내는 것 - 주소값도 달라짐)
		System.out.println("* c1이 참조하는 객체");
		System.out.println(c1); // name=홍길동1111
		
		System.out.println("* c2가 참조하는 객체");
		System.out.println(c2); // name=홍길동
	}
}
