package etc; //20231110

// 이것보다 CarTester2 코드가 더 좋으니 이건 참고만

/*
 * instanceOf : 구현 여부, 상속 여부를 확인
 */

public class CarTester {
	public void testCar(Car car) {
		// 운전 기능
		car.go();
		car.stop();
		
		// 에어컨 기능
		if (car instanceof AirConditioner) { 		   // 지금 Car 가 바라보는 객체가 AirConditioner타입의 객체인지 확인
			AirConditioner air = (AirConditioner) car; // 강제형변환을 통해 지금 Car 가 바라보는 객체 안에서 AirConditioner 로 이동 (있으면 실행, 없으면 실행안됨)
			air.airControl();
		}
		
		// 내비게이션 기능
		if (car instanceof Navigation) {
			Navigation navi = (Navigation) car;
			navi.navi();
		}
	}
	
	public static void main(String[] args) {
		Tico tico = new Tico();
		Sonata sonata = new Sonata();
		Sample sample = new Sample();
		
		CarTester tester = new CarTester();
		tester.testCar(tico);
		tester.testCar(sonata);
//		tester.testCar(sample); // Sample은 Car의 종류가 아님 -> testCar(Car car)와 타입이 안맞으니까 testCar() 불가
	}
}
