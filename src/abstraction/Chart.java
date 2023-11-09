package abstraction; //20231109

// 추상 클래스 정의하기
// 추상 클래스는 추상메소드, 구현메소드 모두 보유할 수 있다.

public abstract class Chart {
	
	// 추상 메소드 정의하기 - 구현부가 없는 메소드
	// : 자식 클래스는 반드시 구현해야 함 -> 자식 클래스에 메소드 재정의를 강제할 수 있음 -> 사용법이 동일한(=상호간 교체가능) 클래스들을 조성할 수 있음
	public abstract void draw();
}
