package builder; //20231115

public class StringBuilderApp2 {
	public static void main(String[] args) {
		int no = 100;
		String name = "홍길동";
		String tel = "010-1234-5678";
		
		StringBuilder sb = new StringBuilder();
		
		// StringBuilder의 append()메소드는 StringBuilder객체를 반환한다.
		// 따라서, append() 메소드의 실행결과가 StringBuilder객체이기 때문에
		//       append() 메소드에 이어서 다시 append()메소드를 실행하는 것이 가능하다.
		// 이런 식의 실행방식은 Method Chaining 이라고 한다.
		String text = sb.append("번호:")
						.append(no)
						.append(", 이름:")
						.append(name)
						.append(", 전화번호:")
						.append(tel)
						.toString();
		
		System.out.println(text);
	}
}
