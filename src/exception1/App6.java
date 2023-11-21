package exception1; //20231121

public class App6 {
	public static void main(String[] args) {
		/*
		 * NumberFormatException
		 *  - 숫자가 아닌 문자를 포함하고 있는 텍스트를 숫자로 변환할 때 발생되는 예외
		 *  - NumberForamatException은 UncheckedException이다.
		 *  - UncheckedException이지만 try ~ catch 사용하는 유일한 예외 클래스 (해도 되고, 안해도 됨)
		 *    *자주 사용하니까 따로 클래스 만들어놓고 사용해도 됨 - class NumberUtils 참고
		 */		
		
		// 페이지번호
//		String str = "2 dd"; // 정상적인 숫자가 아니라서 원래는 예외가 발생하지만, pageNo=1로 초기화하고 아래 try~catch문을 작성해서 잘못된 숫자를 입력하면 1페이지가 나오도록 예외처리
//		int pageNo = 1;
//		try {
//			pageNo = Integer.parseInt(str);
//		} catch (NumberFormatException ex) {
//			
//		}
//		System.out.println("요청한 페이지번호: " + pageNo);
//		
//		int start = (pageNo - 1)*10 + 1;
//		int end = pageNo*10;
//		
//		System.out.println("조회시작번호: " + start);
//		System.out.println("조회종료번호: " + end);
		
		// 페이지번호
		String str = "5";
		int pageNo = NumberUtils.toInt(str, 1);
		int start = (pageNo - 1)*10 + 1;
		int end = pageNo*10;
		
		System.out.println("페이지번호: " + pageNo);
		System.out.println("조회시작번호: " + start);
		System.out.println("조회종료번호: " + end);
	}
}
