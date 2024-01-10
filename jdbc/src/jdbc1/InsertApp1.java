package jdbc1; //20231206

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertApp1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		/*
		 자바의 데이터베이스 액세스 절차
		 1. 오라클 jdbc driver를 로딩해서 드라이버 레지스트리에 등록시킨다.
		 2. 드라이버 레지스트리에 등록된 오라클 jdbc driver를 이용해서
		    오라클 데이터베이스와 연결을 담당하는 Connection 객체를 획득한다.
		 3. Connection 객체의 메소드를 실행해서 SQL을 데이터베이스로 전송하고
		    실행시키는 PreparedStatement 객체를 획득한다.
		 4. PreparedStatement 객체의 executeUpdate() 메소드를 실행해서
		    SQL을 데이터베이스로 보내 실행시키고 결과값을 받는다.
		 5. 데이터베이스 액세스 작업에 사용했던 모든 자원을 반납한다.
		 */
		
		// 1. jdbc driver를 드라이버 레지스트리에 등록시키기
		//  * Class.forName("클래스 전체 경로") : 지정된 클래스를 메모리에 로딩함
		Class.forName("oracle.jdbc.OracleDriver");
		
		// 2. Connection 객체 획득하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클의 jdbc url(DBMS마다 jdbc url은 상이함)
		String username = "hr";
		String password = "zxcv1234";
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection);
		
		// 3. PreparedStatement 객체 획득하기
		String sql = """
				INSERT INTO SAMPLE_BOOKS
				(BOOK_NO, BOOK_TITLE, BOOK_WRITER, BOOK_PRICE, BOOK_STOCK)
				VALUES
				(?,?,?,?,?)
		""";																// """ ...~~ """; : 텍스트블록, jdk15부터 지원
		PreparedStatement pstmt = connection.prepareStatement(sql); // String sql을 SqlDeveloper에게 전송하고 실행할 수 있는 변수 pstmt 선언
		pstmt.setInt(1, 10);             // Binding(바인딩, 실제 값을 할당) - String sql의 (?,?,?,?,?)에서 1번째 자리의 값을 10으로 설정
		pstmt.setString(2, "이것이 자바다"); // Binding(바인딩, 실제 값을 할당) - String sql의 (?,?,?,?,?)에서 2번째 자리의 값을 "이것이 자바다"로 설정
		pstmt.setString(3, "신용권");
		pstmt.setInt(4, 35000);
		pstmt.setInt(5, 20);
		
		// 4. SQL을 서버로 전송하고 실행시키기
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount + "개의 행이 추가되었습니다.");
		
		// 5. 사용했던 자원 반납하기
		pstmt.close();
		connection.close();
	}
}


/*
static

public class Sample {
    private int x;                 // 멤버 변수, 인스턴스 변수
    private static int y;          // 정적 변수, 클래스 변수
    
    static {                       // 정적 블록(static 초기화 블록)
        수행문;
        수행문;
        수행문;
    }
    
    public Sample() {              // 생성자
    
    }
    
    public void method1() {        // 멤버 메소드, 인스턴스 메소드
    
    }
    
    public static void method2() { // 정적 메소드, 클래스 메소드
    
    }
}

멤버변수, 멤버메소드
    - 객체 생성 후 사용 가능
    - 생성된 객체를 참조하는 참조변수를 이용해서 멤버변수, 멤버메소드 사용
          참조변수.멤버변수 = 값;
          참조변수.멤버메소드();
    Sample s = new Sample();
    s.x = 10;
    s.method1();
          
정적변수, 정적메소드
    - 클래스가 메모리에 로딩되는 즉시 사용 가능
    - 클래스 이름으로 정적변수와 정적메소드 사용
    Sample.y = 10;
    Sample.method2();
    
정적 블록
    - 클래스가 메모리에 로딩될 때 딱 한번만 실행되는 블록(생성자보다 먼저 실행됨)
    - 클래스의 일생동안 단 한번만 실행되는 작업을 정의할 목적으로 사용
    - 클래스가 메모리에 로딩될 때 자동으로 수행할 작업을 정의할 목적으로 사용
    
생성자
    - 클래스로 객체를 만들 때마다 실행되는 메소드
    - 생성된 객체에 대한 초기화 작업을 담당
*/
