package exception1; //20231121

/*
 * 오류의 종류
 *  1. 에러(Error)
 *  2. 예외(Exception)
 *     (1) Unchecked Exception
 *     (2) Checked Exception  
 * 		  1) try ~ catch 구문 : 예외처리     / main 메서드에서 예외일괄처리(catch 여러개)로 사용
 * 		  2) throws 선언      : 예외처리 위임 / 일반 메서드에서 사용
 */

/*
 * NumberUtils.toInt1("123", 1);
 * NumberUtils.toInt2("가나다", 1);
 * public class NumberUtils {
 *     // 문자를 전달받아서 정수로 변환한다.
 *     // 오류가 발생하면 전달받은 기본값을 반환한다.
 *     public static int toInt(String str, int defaultValue) {
 *         if (str == null) {
 *             return defaultValue;
 *         }
 *         
 *         int result = defaultValue;
 *         try {
 *             result = Integer.parseInt(str);
 *         } catch (NumberFormatException ex) {
 *         
 *         }
 *         return result; // 상단의 toInt1 결과: 123 / toInt2 결과: 1
 *     }
 *     
 *     // 문자를 전달받아서 정수로 변환한다.
 *     // 오류가 발생하면 0을 반환한다.
 *     public static int toInt(String str) {
 *         return toInt(str, 0);
 *     }
 * }
 */

/*
 * 예외처리
 *   - try ~ catch, try ~ catch ~ resource 블록을 사용해서 예외처리하기
 *   - throws를 사용해서 예외처리 위임하기
 *   
 *   - 일반적으로 예외처리는 한 군데에서 일괄처리한다.
 *   - 예외 일괄처리는 사용자와 가장 가까운 클래스에서 한다.
 *     ex) 자바 응용프로그램에서는 main 메소드가 있는 클래스
 *         웹 애플리케이션에서 사용자의 웹 브라우저에게 HTML 컨텐츠를 제공하는 웹서버에서 한다.
 *         (웹 애플리케이션의 예외처리는 에러페이지를 제공하는 것이기 때문)
 *         
 *   - CheckedException이 발생하는 수행문을 메소드에서 실행했다.
 *     => throws 키워드를 사용해서 예외처리를 위임한다.
 *   - UncheckedException이 발생하는 수행문을 메소드에서 실행했다.
 *     => 예외처리할 필요 없음 (자동으로 발생한 예외가 이 메소드를 호출한 측에게 던져지기 때문에)
 *     
 * 예외 발생시키기
 *   - 업무로직에 위배되는 상황이 발생하면 예외를 생성하고 던지자.
 *     throw new 예외클래스(오류메세지);
 *   - 대부분 UncheckedException에 사용
 *     
 * throws / throw 차이
 *   - throws : 예외처리 위임
 *   - throw  : 예외 강제 발생
 *   
 *   
 * 사용자정의 예외클래스
 *   - Chcked 사용자정의 예외 클래스 : Exception 클래스를 상속받아서 정의한다.
 *   
 *     public class 사용자정의예외 extends Exception {
 *     
 *     }
 *     
 *   - Unchecked 사용자정의 예외 클래스 : RuntimeException 클래스를 상속받아서 정의한다.
 *     * 대부분의 사용자정의 예외클래스는 Unchecked Exception으로 정의한다.
 *   
 *     public class 사용자정의예외 extends RuntimeException {
 *     
 *     }
 *     
 *     
 *     public class UserException extends RuntimeException {
 *         private String errorCode;
 *         
 *         public UserException(String errorCode) {
 *             this.errorCode = errorCode;
 *         }
 *         
 *         public UserException(String errorCode, String message) {
 *             super(message);
 *             this.errorCode = errorCode;
 *         }
 *         
 *         // Getter 메소드
 *         public String getErrorCode() {
 *             return errorCode;
 *         }
 *         
 *         public String getMessage() {
 *             return "[" + errorCode + "] " + super.getMessage();
 *         }
 *     }
 */

public class Exception_MyCaption { }
