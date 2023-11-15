package builder; //20231115

public class StringBuilderApp {
	public static void main(String[] args) {
		int no = 100;
		String name = "홍길동";
		String tel = "010-1234-5678";
		
		/*
		 * 위의 데이터를 가지고 아래와 같은 형식의 텍스트로 구성하기
		 * 	- 번호:100, 이름:홍길동, 전화번호:010-1234-5678
		 * 
		 * 1. 덧셈 연산자를 이용해서 값을 이어붙이기
		 *    : 값의 갯수가 적을 때 사용하자.
		 *    : 값의 갯수가 많으면 덧셈을 여러번 실행하게 되고, 덧셈이 실행될 때마다 새로운 String 객체가 생성되기 때문에 메모리 누수가 발생할 수 있다.
		 * 
		 * 2. StringBuilder 객체 활용하기
		 *    : StringBuilder는 객체 내부에 임시저장소를 가지고 있음
		 *    : append(값)메소드를 사용해서 값을 추가하면 임시저장소에 저장될 뿐, 새로운 객체가 생성되지는 않는다.
		 */
		
		// 1. 덧셈 연산자를 이용해서 값을 이어붙이기 - 불필요한 String 객체가 많이 생성됨 (+로 붙인 만큼 계속 새로 생성)
		String text1 = "번호:" + no + ", 이름:" + name + ", 전화번호:" + tel;
		System.out.println(text1);
		
		// 2. StringBuilder 객체 활용하기 - append 를 통해 임시저장소에 각 값을 담아두었다가 => toString()을 통해 값이 모두 합쳐진 객체를 한번에 획득
		StringBuilder sb = new StringBuilder();
		sb.append("번호:");
		sb.append(no);
		sb.append(", 이름:");
		sb.append(name);
		sb.append(", 전화번호:");
		sb.append(tel);
		
		String text2 = sb.toString();
		System.out.println(text2);
		
	}
}
