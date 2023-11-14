package lang; //20231114

public class StringApp5 {
	public static void main(String[] args) {
		/*
		 * String toUpperCase()
		 *  - 문자열의 내용을 참조해서 대문자로만 구성된 새 문자열 객체를 반환한다. 
		 *  
		 * String toLowerCase()
		 *  - 문자열의 내용을 참조해서 소문자로만 구성된 새 문자열 객체를 반환한다.
		 */
		
		String str1 = "Hello, Java World";
		String str2 = str1.toUpperCase();
		String str3 = str1.toLowerCase();
		
		System.out.println("원본 문자열: " + str1);
		System.out.println("새 문자열: " + str2);
		System.out.println("새 문자열: " + str3);
		
		/*
		 * String replace(String searchString, String replaceStr)
		 *  - searchStr에 해당하는 문자열이 replaceStr로 대체된 새 문자열을 반환한다.
		 */
		
		String str4 = "The red house's color is red";
		String str5 = str4.replace("red", "green");
		System.out.println("원본 문자열: "+ str4);
		System.out.println("새 문자열: "+ str5);
		System.out.println();
		
		/*
		 * String replaceAll(String regex, String replacement)
		 *  - 문자열에서 지정된 정규표현식 패턴에 해당하는 부분을 replacement에서 지정한 문자열로 대체한 새 문자열을 반환한다.
		 */
		
		
		/*
		 * String trim()
		 *  - 문자열에서 불필요한 좌우 공백이 제거된 새 문자열을 반환한다.
		 * 
		 * String strip()
		 *  - 문자열에서 불필요한 좌우 공백이 제거된 새 문자열을 반환한다.
		 * 
		 * String stripLeading()
		 *  - 문자열의 왼쪽 공백이 제거된 새 문자열을 반환한다.
		 * 
		 * STring stripTrailing()
		 *  - 문자열의 오른쪽 공백이 제거된 새 문자열을 반환한다.
		 */
		String str6 = "   안녕하세요   반갑습니다.   ";
		String str7 = str6.trim();			 // 문자열 앞,뒤 공백 제거
		String str8 = str6.strip();			 // 문자열 앞,뒤 공백 제거
		String str9 = str6.stripLeading();   // 문자열 앞의 공백 제거
		String str10 = str6.stripTrailing(); // 문자열 뒤의 공백 제거
		System.out.println("원본 문자열: [" + str6 + "]");
		System.out.println("새 문자열 : [" + str7 + "]");
		System.out.println("새 문자열 : [" + str8 + "]");
		System.out.println("새 문자열 : [" + str9 + "]");
		System.out.println("새 문자열 : [" + str10 + "]");
		
	}
}
