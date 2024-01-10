package generic; //20231116

public class App2 {
	public static void main(String[] args) {
		/*
		 * 제네릭이 적용된 Box 클래스
		 *  - 객체 생성 시점에 타입파라미터에 저장할 객체의 타입을 지정할 수 있다.
		 *  - 객체 생성 시 지정한 타입의 객체만 저장 가능
		 *  - 저장된 객체를 사용할 때 형변환이 필요없다.
		 */
		GenericBox<String> box1 = new GenericBox<String>();
		box1.add("홍길동");
//		box1.add(100); // 컴파일 과정에서 잘못된 값(제네릭 타입에 맞지 않는 값)은 저장되지 않는 것을 바로 확인할 수 있다.
		String value1 = box1.get();
		
		GenericBox<Integer> box2 = new GenericBox< /* 생략가능 */ >();
		box2.add(100);			 // 오토박싱  => 원래는 box2.add(Integer.valueOf(100));
		int value2 = box2.get(); // 오토언박싱 => 원래는 Integer value2 = box2.get();
		
		System.out.println(value1);
	}
}
