package lang; //20231114

public class StringApp4 {
	public static void main(String[] args) {
		/*
		 * String substring(int beginIndex)
		 *  - 지정된 시작위치 ~ 문자열끝 범위에 해당하는 문자열로 구성된 새 문자열을 반환
		 *    단, 문자열의 인덱스는 0부터 시작한다.
		 *  - beginIndex는 포함된다.
		 *  
		 * String substring(int beginIndex, int endIndex)
		 *  - 지정된 시작위치 ~ 끝위치  범위에 해당하는 문자열로 구성된 새 문자열을 반환
		 *  - beginIndex 포함, endIndex는 미포함
		 */
		
		String str1 = "중앙HTA학원 주식회사";
		
		String str2 = str1.substring(2);
		String str3 = str2.substring(2, 5);
		
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = "810123-1234567";
		
		String str5 = str4.substring(0, 2);
		System.out.println("태어난 해: " + str5);
		String str6 = str4.substring(2, 6);
		System.out.println("생일: " + str6);
		String str7 = str4.substring(7,8);
		System.out.println("성별: " + str7);
	}
}
