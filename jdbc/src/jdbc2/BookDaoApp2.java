package jdbc2; //20231206

import java.sql.SQLException;
import java.util.List;

public class BookDaoApp2 {
	public static void main(String[] args) throws SQLException {
		BookDao bookDao = new BookDao();
		
		// 모든 책정보 조회하기
		System.out.println("--- 모든 책 정보 조회 ---");
		List<Book> books = bookDao.getAllBooks();
		for (Book b : books) {
			System.out.println(b.getNo() + ", " + b.getTitle());
		}
		System.out.println();
		
		// 하나의 책 정보 조회하기
		System.out.println("--- 책번호를 통해 하나의 책 정보 조회 ---");
		Book book = bookDao.getBookByNo(101);
		System.out.println(book.getNo() + ", " + book.getTitle());
	}
}
