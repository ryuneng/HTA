package generic; //20231116

public class App4 {
	public static void main(String[] args) {
		// box1은 Fruit 종류를 저장하는 박스 객체
		FruitBox<Fruit> box1 = null;
		
		box1 = new FruitBox<Fruit>();
		
		// 제네릭 객체의 타입파라미터 간에는 형변환 불가능
//		box1 = new FruitBox<Apple>();
//		box1 = new FruitBox<Banana>();
		
	}
}
