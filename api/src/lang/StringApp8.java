package lang; //20231114

import java.util.Arrays;

public class StringApp8 {
	public static void main(String[] args) {
		String str1 = "김유신";
		String str2 = "홍길동";
		
		// str1과 str2 비교
		int result = str1.compareTo(str2);
		System.out.println(result);
		
		String[] arr = {"김유신", "강감찬", "이순신", "류관순", "안중근"};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
