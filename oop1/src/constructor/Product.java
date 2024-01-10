package constructor; //20231102

public class Product {

	int no;
	String name;
	String maker;
	int price;
	int stock;
	boolean soldOut;
	
	/*
	 * 기본 생성자 메소드
	 *  - 매개변수가 하나도 없는 생성자 메소드
	 *  - 따로 정의하지 않아도 소스코드로 실행파일을 만들 때 컴파일러가 실행파일에 자동으로 추가함
	 *    *주의 : 생성자 메소드가 하나라도 존재할 때에는 자동으로 추가되지 않음
	 */
	public Product() {
		//System.out.println("Product() 실행됨...");
	}
	
	
	/*
	 * 생성자 메소드 중복정의
	 *  - 기본 생성자 메소드(매개변수가 하나도 없는 생성자 메소드)를 제외하고
	 *    매개변수를 가지는 생성자 메소드를 여러개 중복정의할 수 있다.
	 */
	public Product(int no, String name, String maker, int price) {
		this(no, name, maker, price, 3);
		
		//System.out.println("Product(int, String, String, int) 실행됨...");
	}
	
	public Product(int no, String name, String maker, int price, int stock) {
		//System.out.println("Product(int, String, String, int, int) 실행됨...");
		
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.stock = stock;
		this.soldOut = false;
	}
	
	// 멤버메소드 정의하기
	public void printProduct() {
		System.out.println("상품번호: " + no);
		System.out.println("상품이름: " + name);
		System.out.println("제조회사: " + maker);
		System.out.println("판매가격: " + price);
		System.out.println("재고수량: " + stock);
		System.out.println("절판여부: " + soldOut);
		System.out.println();
	}
	
	
	
	
	/*
	 * this : 객체 자기자신의 주소값을 갖는 키워드
	 * this() 메소드 : 같은 클래스 내에서 생성자가 다른 생성자를 실행할 때 사용하는 메소드
	 */
}
