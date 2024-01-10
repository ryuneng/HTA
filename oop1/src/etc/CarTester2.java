package etc; //20231110

// CarTester보다 이게 더 좋은 코드
public class CarTester2 {
	public void testCar(Car car) {
		car.go();
		car.stop();
	}
	
	public void testAirCOn(AirConditioner aircon) {
		aircon.airControl();
	}
	
	public void testNavigation(Navigation navigation) {
		navigation.navi();
	}
	
	public static void main(String[] args) {
		Tico tico = new Tico();
		Sonata sonata = new Sonata();
		
		CarTester2 tester = new CarTester2();
		
		// 운전기능 테스트
		tester.testCar(tico);
		tester.testCar(sonata);
		
		// 에어컨기능 테스트
		tester.testAirCOn(tico);
		tester.testAirCOn(sonata);
		
		// 내비기능 테스트
//		tester.testNavigation(tico); // tico의 부모는 Navigation이 없음
		tester.testNavigation(sonata);
	}
}
