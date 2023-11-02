package day1; //20231101

/**
 * 책 정보를 표현하는 클래스다.
 */

/*
 * \    /**
 * 		자바 API 문서내용 주석
 * 		*\                      /
 * 
 * */

// VO : Value Object = DTO : DataType Object

public class Book {

	// 필드, 멤버변수, 프로퍼티 정의하기
	String title;
	String author;
	String publisher;
	int price;
	double discountRate;
	int stock;
	boolean soldOut;
}
