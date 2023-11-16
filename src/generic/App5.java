package generic; //20231116

public class App5 {
	public static void main(String[] args) {
		// 와일드카드 - Class 의 선언부에는 적을 수 없음
		
		/*
		 * 제네릭 와일드 카드
		 *  1. <?>
		 *      - 제한 없음
		 *      - 타입 파라미터의 구체적인 타입으로 모든 클래스, 모든 인터페이스 타입 가능
		 *  
		 *  2. <? extends 상위타입>
		 *      - 상위 클래스 제한
		 *      - 타입 파라미터의 구체적인 타입으로 상위타입 혹은 지정된 상위타입의 하위 타입만 가능
		 *  
		 *  3. <? super 하위타입>
		 *      - 하위 클래스 제한
		 *      - 타입 파라미터의 구체적인 타입으로 하위타입 혹은 지정된 하위타입의 상위 타입만 가능
		 */
		FruitBox<? extends Fruit> box1;
		
		box1 = new FruitBox<Fruit>();
		box1 = new FruitBox<Apple>();
		box1 = new FruitBox<Banana>();
	}
}
