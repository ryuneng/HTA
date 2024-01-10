package exception1; //20231121

import java.io.FileWriter;
import java.io.IOException;

public class App7 {
	public static void main(String[] args) {
		/*
		 * finally 블록
		 *  - try 블록의 수행문의 정상수행/오류발생에 상관없이 반드시 실행해야 하는 수행문을 포함하는 블록
		 *  
		 *  try {
		 *  	1 - 오류 발생이 예상되는 수행문;
		 *  
		 *  	2 - 1번 수행문이 정상적으로 수행되었을 때 실행되는 수행문;
		 *  	2 - 1번 수행문이 정상적으로 수행되었을 때 실행되는 수행문;
		 *  	2 - 1번 수행문이 정상적으로 수행되었을 때 실행되는 수행문;
		 *  } catch (예외클래스 변수명) {
		 *  	3 - 1번 수행문에 오류가 발생했을 때 실행되는 수행문;
		 *  } finally {
		 *  	4 - 1번 수행문의 정상수행/오류발생과 상관없이 반드시 실행되는 수행문;
		 *  }
		 *  
		 *    - 1번과 2번 수행문은 시스템의 자원을 사용하는 수행문이다.
		 *    - 4번 수행문은 1번/2번 수행문에서 사용했던 시스템의 자원(I/O자원, 네트워크 자원, 데이터베이스 연결자원 등)을 반납하는 수행문이다.
		 *    - java 7부터 프로그램이 사용했던 자원을 자동으로 반납하는 기능이 추가되면서 자원을 반납하기 위한 finally 블록은 불필요해졌다.
		 *    - 일반적으로 데이터베이스 액세스 작업에는 외부 라이브러리(mybatis, jpa)를 사용하게 되는데,
		 *      이런 라이브러리들은 데이터베이스 작업과 관련된 자원 반납을 자동으로 처리해주기 때문에 finally 블록을 사용할 필요가 없다. 
		 */
		FileWriter writer = null;
		try {
			writer = new FileWriter("app7.txt");
			writer.write("finally 연습");
			
		} catch (IOException ex) {
			
		} finally {
			try {
				if (writer != null) {
					// FileWriter 객체가 사용했던 시스템의 입출력 자원을 반납하는 수행문
					writer.close();
				}
			} catch (IOException ex) {
				// 이 catch 블록에는 수행문을 작성할 필요가 없다.
			}
		}
	}
}
