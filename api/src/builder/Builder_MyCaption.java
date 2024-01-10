package builder; //20231115

/*
 * StringBuilder와 StringBuffer (*버퍼: 임시저장소)
 * 
 *  String str = "이름:" + name + ", 이메일:" + email + ", 연락처:" + tel;
 * 				 ["이름:"]												  // 1번째로 만들어진 새로운 String 객체
 * 				 ["이름:홍길동"]											  // 2번째로 만들어진 새로운 String 객체
 * 				 ["이름:홍길동, 이메일:"]									  // 3번째로 만들어진 새로운 String 객체
 * 				 ["이름:홍길동, 이메일:hong@gmail.com"]					  // 4번째로 만들어진 새로운 String 객체
 * 				 ["이름:홍길동, 이메일:hong@gmail.com, 연락처:"]				  // 5번째로 만들어진 새로운 String 객체
 * 				 ["이름:홍길동, 이메일:hong@gmail.com, 연락처:010-1111-2222"] // 6번째로 만들어진 새로운 String 객체 ====> str이 최종적으로 바라보는 값
 * 
 *  - StringBuilder와 StringBuffer의 코드는 모두 동일. 완전 똑같
 *  - 그럼 둘의 차이점은?
 *  	1. StringBuilder : A thread unsafe ===> 동기화처리 안됨 - 멀티쓰레드에서 사용하면 안됨
 *  	2. StringBuffer  : A thread safe   ===> 동기화처리(synchronized) 됨 - 멀티쓰레드에서 사용, 열쇠 획득한 놈만 사용 가능하고 나머지는 실행 못하고 대기해야 함
 */

public class Builder_MyCaption {
	public static void main(String[] args) {
		/*
		 * Method Chaining(메소드 체이닝)
		 */
		String text = "Hello, java!"
					  .toUpperCase()		// 대문자로
					  .substring(0,5)		// index 0~5까지 자름
					  .replace("H","*");	// "H"를 "*"로 교체
		
		System.out.println(text);
	}
}
