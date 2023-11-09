package inheritance; //20231108

public class PhoneApp {
	public static void main(String[] args) {
		// Phone 객체 생성
		Phone p1 = new Phone();
		p1.number = "010-1111-1234";
		p1.call();
		p1.receive();
		
		// SmartPhone 객체 생성
		SmartPhone p2 = new SmartPhone();
		p2.number = "010-2222-1234";
		p2.ip = "196.354.10.11";
		p2.call();
		p2.receive();
		p2.internet();
		p2.game();
	}
}
