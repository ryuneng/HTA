package wrapper; //20231115

public class WrapperApp1 {
	public static void main(String[] args) {
		
		/*
		 * 오토박싱
		 *  - 기본자료형값을 Wrapper 클래스타입의 참조변수에 저장시키면 자동으로 해당 Wrapper 클래스로 객체를 생성해서
		 *    그 객체에 기본자료형값을 저장하고, 그 객체의 주소값을 참조변수에 대입시킨다.
		 */
		Byte wrapper1 = 1;				// Byte wrapper1 = new Byte(1);
		Short wrapper2 = 1;				// Short wrapper2 = new Short(1);
		Integer wrapper3 = 10000;		// Integer wrapper3 = new Integer(10000);
		Long wrapper4 = 10000000000L;
		Float wrapper5 = 3.14f;
		Double wrapper6 = 3.14;
		Character wrapper7 = 'A';
		Boolean wrapper8 = true;
		
		/*
		 * System.out.println(wrapper1);
		 *  -> System.out.println(wrapper1.toString());
		 *  -> Wrapper 클래스들은 Object의 toString() 메소드를 해당 기본자료형값을 문자열로 변환해서 반환하도록 재정의하였다.
		 *  
		 *  public class Integer {
		 *  	int value;	// 기본자료형값이 저장되는 변수라고 가정
		 *  
		 *  	public String toString() {
		 *  		return String.valueOf(value); // valueOf : value 를 문자열로 바꿔줌
		 *  	}
		 *  }
		 */
		
		System.out.println(wrapper1); // "1" - toString() 메소드가 반환하는 값이 출력됨
		System.out.println(wrapper2); // "1" - toString() 메소드가 반환하는 값이 출력됨
		System.out.println(wrapper3); // "10000" - toString() 메소드가 반환하는 값이 출력됨
	}
}
