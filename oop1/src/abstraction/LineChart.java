package abstraction; //20231109

// 구현 클래스 정의하기
// 추상 메소드를 보유할 수 없다.
// 만약, 부모로부터 추상메소드를 상속받았다면, 반드시 메소드 재정의를 해야 한다.

public class LineChart extends Chart {
	
	@Override // Annotation - 컴퓨터 코드의 부가적인 정보를 설정할 때 사용
	public void draw() {
		System.out.println("꺾은선 그래프를 그립니다.");
	}
}
