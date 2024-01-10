package wrapper; //20231115

public class WrapperApp3 {
	public static void main(String[] args) {
		/*
		 * 문자열을 숫자(정수, 실수)로 변환하기
		 *  - Wrapper 클래스의 정적 메소드를 활용하면 문자열을 숫자로 변환 가능
		 *  
		 *  	int    Integer.parseInt(String str)
		 *  	long   Long.parseLong(String str)
		 *      double Double.parseDouble(String str)
		 *      
		 *      Integer Integer.valueOf(String str)
		 *      Long    Long.valueOf(String str)
		 *      Double  Double.valueOf(String str)
		 *      
		 * 숫자를 문자열로 변환하기
		 *  - String 클래스의 정적 메소드를 활용하면 숫자를 문자열로 변환 가능
		 *  
		 *      String String.valueOf(int value)
		 *      String String.valueOf(long value)
		 *      String String.valueOf(double value)
		 */
		
		int a = Integer.parseInt("123");
		long b = Long.parseLong("1000000000000");
		double c = Double.parseDouble("3.141592");
		
		
//		int d = Integer.parseInt("1234 ".trim()); // trim() 안하면 오류 발생 - NumberFormatException
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
//		System.out.println(d);
		
		Integer d = Integer.valueOf("1000");
		int e = Integer.valueOf("10000");
		
		// 오토박싱과 클래스 형변환이 활용되었음
		Object x = 10; // Object 안에는 Integer 도 있기 때문에 가능 (String 은 안에 Integer 없어서 String x = 10; 은 불가)
		/*
		 * Object x = 10;
		 * 
		 * x가 Object 타입의 참조변수이기 때문에 Integer 객체가 생성됨 - 오토박싱
		 *          = new Integer(10);
		 *          
		 * x가 Object 타입이기 때문에 Integer 객체의 주소값이 아니라 Integer 객체의 Object 객체 주소값이 x에 대입됨 - 클래스 형변환
		 * Object x = new Integer(10);
		 */
		
		System.out.println(x); // "10"이 출력됨
	}
}
