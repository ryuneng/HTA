package inner; //20231113

/*
 * 내부 클래스(직접 사용할 일은 많이 없으니 개념만 이해하고 세부적인 것들을 외우지는 말 것)
 *  1. 인스턴스 내부 클래스(Instance Inner Class)
 *     - 외부의 멤버변수와 멤버메소드에 접근 가능
 *     - 주로 외부 클래스의 멤버변수와 밀접하게 결합된 작업을 수행할 때 사용
 *     
 *  2. 정적 내부 클래스(Static Inner Class)
 *     - 외부 클래스의 객체와 독립적으로 동작하는 내부클래스(외부 클래스 객체 생성 불필요)
 *     - 외부 클래스의 정적변수와 정적메소드만 접근 가능
 *     - 주로 외부 클래스와 느슨하게 결합된 유틸리티 클래스를 작성할 때 사용
 *     
 *  3. 로컬 내부 클래스(Local Inner Class)
 *     - 메소드 내부에서 정의되고 사용되는 내부클래스
 *     - 메소드의 지역변수와 파라미터에 접근 가능
 *     - 주로 메소드 내에서 필요한 작업을 수행하기 위해서 임시로 사용
 *     
 *  4. 익명 내부 클래스(Anonymous Inner Class)
 *     - 이름이 없는 내부클래스
 *     - 인터페이스나 추상클래스의 구현객체를 생성할 때 사용되는 내부클래스
 *     - 클래스를 정의하면서 동시에 객체를 생성함
 *     - 주로 콜백함수, 이벤트처리에 사용되는 일회용 객체를 생성할 때 사용
 *     
 *  	public interface Chart {
 *  		void draw();
 *  	}
 *  
 *  	인터페이스의 구현객체 생성하기
 *   	1. 구현클래스를 정의하고, 객체 생성하기
 *   		public class BarChart implements Chart {
 *   			public void draw() {
 *   				// 막대그래프 그리기
 *   			}
 *   		}
 *   
 *   		BarChart c1 = new BarChart();
 *   		Chart 	 c2 = new BarChart();
 *   
 *   	2. 구현클래스를 정의하면서 동시에 객체 생성하기 - 인터페이스를 구현한 일회용 객체 (interface Chart 의 객체를 만든 건 아니고 구현체를 만듦)
 *   		Chart c1 = new Chart() {
 *   			public void draw() {
 *   				// 파이차트 그리기
 *   			}
 *   		};
 *   		Chart c2 = new Chart() {
 *   			public void draw() {
 *   				// 꺾은선 그래프 그리기
 *   			}
 *   		};
 *   		Chart c3 = new Chart() {
 *   			public void draw() {
 *   				// 지도차트 그리기
 *   			}
 *   		};
 */

public class InnerClass_Caption {
	// 멤버(인스턴스) 내부 클래스
	class Ineer1 {
		
	}
	
	// 정적 내부 클래스
	static class Inner2 {
		
	}
	
	public void method() {
		// 로컬 내부 클래스
		class Inner3 {
			
		}
	}
}
