package inner; //20231113

public class PainterApp {
	public static void main(String[] args) {
		Painter painter = new Painter();
		
		// 익명 내부 클래스1
		Shape shape1 = new Shape() {
			public void draw() {
				System.out.println("동그라미 그리기");
			}
		};
		
		// 익명 내부 클래스2
		Shape shape2 = new Shape() {
			public void draw() {
				System.out.println("삼각형 그리기");
			}
		};
		
		painter.drawShape(shape1);
		painter.drawShape(shape2);
		painter.drawShape(new Shape() {
			public void draw() {
				System.out.println("사각형 그리기");
			}
		});
		painter.drawShape(new Shape() {
			public void draw() {
				System.out.println("오각형 그리기");
			}
		});
			// 람다식 형식: (매개변수) -> 수행문
		painter.drawShape(() -> System.out.println("육각형 그리기"));
	}
}
