package inheritance; //20231108

/*
 * 클래스의 형변환 : 생성한 객체와 참조변수의 타입이 다를 때 발생
 * 	1. 전달받고자 하는 객체의 종류를 제한할 수 있음
 */
public class PhoneApp2 {
	public static void main(String[] args) {
		// Iphone 객체는 Iphone 타입이다.
		Iphone p1 = new Iphone();
		p1.appleMusic();				// Iphone 객체
		p1.applePay();					// Iphone 객체
		p1.ip = "192.168.10.1";			// SmartPhone 객체
		p1.internet();					// SmartPhone 객체
		p1.game();						// SmartPhone 객체
		p1.number = "010-1111-1111";	// Phone 객체
		p1.call();						// Phone 객체
		p1.receive();					// Phone 객체
		
		// Iphone 객체는 SmartPhone 타입이다.
		SmartPhone p2 = new Iphone();
//		p2.appleMusic();				// Iphone 객체
//		p2.applePay();					// Iphone 객체
		p2.ip = "192.168.10.1";			// SmartPhone 객체
		p2.internet();					// SmartPhone 객체
		p2.game();						// SmartPhone 객체
		p2.number = "010-1111-1111";	// Phone 객체
		p2.call();						// Phone 객체
		p2.receive();					// Phone 객체
		
		// Iphone 객체는 Phone 타입이다.
		Phone p3 = new Iphone();
//		p3.appleMusic();				// Iphone 객체
//		p3.applePay();					// Iphone 객체
//		p3.ip = "192.168.10.1";			// SmartPhone 객체
//		p3.internet();					// SmartPhone 객체
//		p3.game();						// SmartPhone 객체
		p3.number = "010-1111-1111";	// Phone 객체
		p3.call();						// Phone 객체
		p3.receive();					// Phone 객체
	}
}
