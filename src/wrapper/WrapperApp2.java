package wrapper; //20231115

public class WrapperApp2 {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		Double c = 3.14;
		
		/*
		 * 오토 언박싱
		 *  - Wrapper 클래스타입의 객체를 참조하는 참조변수를 기본자료형타입의 변수에 대입하면 참조변수의 주소값이 변수에 대입되는 것이 아니라, 
		 *    참조변수가 참조하는 Wrapper 객체의 xxxValue() 메소드를 실행해서 획득한 기본자료형값을 변수에 대입한다.
		 *  - 정수, 실수값을 포함하는 Wrapper 클래스타입의 객체에 대해서 사칙연산, 비교연산 등을 실행하면
		 *    자동으로 오토언박싱이 실행돼서 Wrapper 객체에 저장된 기본자료형값이 연산에 활용된다.
		 */
		int x = a;		// 자동으로 int x = a.intValue(); 가 실행돼서 오토 언박싱됨
		int y = b;		// int y = b.intValue();
		double z = c;	// double z = c.intValue();
		
		int result = a + b; // int result = a.intValue() + b.intValue();
		System.out.println(result);
	}
}
