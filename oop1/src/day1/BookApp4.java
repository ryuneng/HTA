package day1; //20231101

import java.util.Scanner;

public class BookApp4 {

	public static void main(String[] args) {
		
		// Book 객체를 생성해서 책정보를 저장하기
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		book1.title = "이것이 자바다";
		book1.author = "신용권";
		book1.publisher = "한빛미디어";
		book1.price = 36000;
		book1.discountRate = 0.15;
		book1.stock = 100;
		book1.soldOut = false;
		
		book2.title = "자바의 정석";
		book2.author = "남궁성";
		book2.publisher = "도우출판사";
		book2.price = 32000;
		book2.discountRate = 0.15;
		book2.stock = 50;
		book2.soldOut = false;
		
		book3.title = "헤드 퍼스트 자바";
		book3.author = "케이시 시에라";
		book3.publisher = "한빛미디어";
		book3.price = 28000;
		book3.discountRate = 0.15;
		book3.stock = 100;
		book3.soldOut = true;
		
		Book[] books = new Book[3];
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("1.도서현황 2.판매가능도서 3.판매완료도서 0.종료");
			System.out.println("-----------------------------------");
			
			System.out.print("### 메뉴선택: ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				System.out.println("### 도서현황을 출력합니다.");
				for (Book book : books) {
					System.out.println(book.title + " - " + book.price + "원");
				}
			} else if (menu == 2) {
				System.out.println("### 판매중인 책정보를 출력합니다.");
				for (Book book : books) {
					if (book.soldOut == false) {
						System.out.println(book.title + " - " + book.price + "원");
					}
				}
				
			} else if (menu == 3) {
				System.out.println("### 판매완료된 책정보를 출력합니다.");
				for (Book book : books) {
					if (book.soldOut == true) {
						System.out.println(book.title + " - " + book.price + "원");
					}
				}
				
			} else if (menu == 0) {
				System.out.println("### 프로그램을 종료합니다.");
				break;
			}
		}
		scanner.close();
	}
}
