package day1; //20231101

public class BookApp2 {
	
	public static void main(String[] args) {
		
		// 책정보를 표현하는 Book 객체를 생성하고, 책정보를 대입하기
		
		// 1. 책정보를 표현하는 Book 객체 생성하기
		Book book1 = new Book();
		
		// 2. book1이 참조하는 Book 객체이 멤버변수에 책정보 대입하기 (멤버변수의 값을 초기화)
		book1.title = "자바 고수되는 방법";
		book1.author = "자바왕";
		book1.publisher = "자바당";
		book1.price = 18000;
		book1.discountRate = 0.15;
		book1.stock = 20;
		book1.soldOut = false;
				
		// 3. book1이 참조하는 Book 객체의 멤버변수에 저장된 값 출력하기
		System.out.println("제목: " + book1.title);
		System.out.println("저자: " + book1.author);
		System.out.println("출판사: " + book1.publisher);
		System.out.println("가격: " + book1.price);
		System.out.println("할인율: " + book1.discountRate);
		System.out.println("재고: " + book1.stock);
		System.out.println("판매완료여부: " + book1.soldOut);
	}
}
