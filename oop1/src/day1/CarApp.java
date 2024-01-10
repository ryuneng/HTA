package day1; //20231101

public class CarApp {

	public static void main(String[] args) {
		Car car = new Car();
		
		// 자동차의 현재 속도를 화면에 출력하기
		car.printCurrentSpeed();
		
		// 자동차의 현재 속도 증가시키기
		System.out.println();
		car.speedUp();
		car.printCurrentSpeed();
		
		// 자동차의 현재 속도를 30으로 바꾸기
		System.out.println();
		car.changeCurrentSpeed(30);
		car.printCurrentSpeed();
		
		// 자동차의 현재 속도 조회하기
		System.out.println();
		int speed = car.getCurrentSpeed();
		System.out.println("조회된 자동차의 현재 속도: " + speed + " km/h");
	}
}


/*
 * changeCurrentSpeed(int speed): void - Car
 *  - 반환값이 없다.
 *  - 메소드이름은 changeCurrentSpeed다.
 *  - 메소드 실행 시 전달할 인자값은 정수형의 속도값이다.
 *  - 실행방법 ex)car.changeCurrentSpeed(50);
 * 
 * speedUp(): void - Car
 *  - 반환값이 없다.
 *  - 메소드이름은 speedUp이다.
 *  - 메소드 실행 시 전달할 인자값은 없다.
 *  - 실행방법 ex)car.speedUp();
 * 
 * printCurrentSpeed(): void - Car
 *  - 반환값이 없다.
 *  - 메소드이름은 printCurrentSpeed다.
 *  - 메소드 실행 시 전달할 인자값은 없다.
 *  - 실행방법 ex)car.printCurrentSpeed();
 * 
 * getCurrentSpeed(): int - Car
 *  - 반환값이 있다. 정수타입의 값을 반환한다. 즉, 정수타입의 변수를 선언해서 값을 저장한다.
 *  - 메소드이름은 getCurrentSpeed다.
 *  - 메소드 실행 시 전달할 인자값은 없다.
 *  - 실행방법 ex)int speed = car.getCurrentSpeed();
 *  
 */