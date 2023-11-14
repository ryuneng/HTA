package lang; //20231114

public class StringApp1 {
	public static void main(String[] args) {
//		    문자열을 만드는 다양한 방법
		// 1. 문자열 리터럴로 String 객체 생성하기
		String str1 = "문자열연습1";
		
		// 2. new 연산자로 String 객체 생성하기
		String str2 = new String("문자열연습2");
		String str6 = new String(new byte[] {65, 66, 67});		// "ABC"
		String str7 = new String(new char[] {'A', 'B', 'C'});	// "ABC"
		
		// 3. String 클래스의 정적 메소드로 String 객체 생성하기 (valueOf: 문자열이 아닌 걸 문자열로 변환할 때 사용)
		String str3 = String.valueOf(true);  // true  -> "true"
		String str4 = String.valueOf(10000); // 10000 -> "10000"
		String str5 = String.valueOf(3.14);  // 3.14  -> "3.14"
		
		
//		int num = 123456;					// num => 123456
//		String str = String.valueOf(num);   // str => "123456"
//		String str8 = str.substring(0, 1);
//		System.out.println(str8);
	}
}
