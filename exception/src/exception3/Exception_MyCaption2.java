package exception3; //20231122

/*
 * 예외의 변환
 *  - 메소드에서 발생하는 예외를 잡고, 대신 다른 예외를 발생시키는 것
 *  - 예외를 일괄처리하는 곳에서 처리할 예외의 종류를 줄일 수 있다.
 *    * 메소드에서 발생하는 다양한 예외를 일괄처리하는 곳으로 throws로 위임하는 대신, 사용자정의 예외를 발생시킴으로써 일괄처리 대상 예외를 사용자정의 예외로 한정시킨다.
 * 
 * 
 * 예외처리 코드의 가장 일반적인 형태
 *   1. 예외처리를 일괄처리하는 곳으로 위임한다.
 *    public void method() throws 예외 {
 *        수행문; // 예외발생
 *    }
 *   
 *   2. 예외를 사용자정의 예외로 변환해서 일괄처리하는 곳으로 보낸다.
 *    public void method() {
 *        try {
 *            수행문; // 예외발생
 *        } catch (예외 ex) {
 *            throw new HtaException(ex);
 *        }
 *    }
 *   
 *   3. 업무로직에 위배되는 상황이 발생하면 예외를 강제발생 시킨다.
 *    public void method() {
 *        if (업무로직에 위배된다면) {
 *            throw new HtaException(메세지);
 *        }
 *    }
 *    
 *  *최악의 예외코드
 *  => 이 메소드에서 발생한 예외를 일괄처리하는 곳으로 보내지 않는다.(원래는 일괄처리 하는 곳으로 전달되게 해야 함)
 *   public void method() {
 *       try {
 *           수행문; // 예외발생
 *       } catch (예외 ex) {
 *           ex.printStackTrace();
 *   }
 */



/* -----------------------------------------------------------------------------------------------
 * 예외처리를 하지 않음
 *  public static void main(String[] args) throws Exception {
 *      method1();
 *      method2();
 *      method3();
 *  }
 *  
 *  // 1. 아래처럼 구체적인 예외 클래스 써주는 게 좋음
 *  public void readfile(String filename) throws FileNotFoundException, IOException {
 *      // FileNotFoundException 발생
 *      BufferedReader br = new BufferedReader(new FileReader(filename));
 *      // IOException 발생
 *      String text = br.readLine();
 *      return text;
 *  }
 *  
 *  // 2. 부모 예외클래스로 사용해도 됨
 *  public void readfile(String filename) throws IOException {
 *      // FileNotFoundException 발생
 *      BufferedReader br = new BufferedReader(new FileReader(filename));
 *      // IOException 발생
 *      String text = br.readLine();
 *      return text;
 *  }
 *  
 *  // 3. 제일 조상 예외클래스로 사용해도 됨
 *  public void readfile(String filename) throws Exception {
 *      // FileNotFoundException 발생
 *      BufferedReader br = new BufferedReader(new FileReader(filename));
 *      // IOException 발생
 *      String text = br.readLine();
 *      return text;
 *  }
 */

/* -----------------------------------------------------------------------------------------------
 *  1. 컴파일 오류, 예외발생했을 때 값이 반환되지 않음
 *   public int method(String text) {
 *       try {
 *           int number = Integer.parseInt(text);
 *           return number;
 *       } catch (예외 ex) {
 *           
 *       }
 *   }
 *  
 *  2. 정상적인 코드
 *   public int method(String text) {
 *       try {
 *           int number = Integer.parseInt(text);
 *           return number;
 *       } catch (예외 ex) {
 *           return 0; // 방법1 - 예외 발생 시에도 값이 반환됨
 *        // throw ex; // 방법2 - 예외 발생 시, 값을 반환하는 대신 예외를 던짐
 *       }
 *   }
 */

public class Exception_MyCaption2 { }
