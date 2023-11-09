package overriding; //20231109

public class PrinterApp1 {
	public static void main(String[] args) {
		Printer p1 = new Printer();
		p1.print();		// Printer의 print()가 실행됨
		
		ColorPrinter p2 = new ColorPrinter();
		p2.print();		// ColorPrinter의 재정의된 print()가 실행됨
		
		Printer p3 = new ColorPrinter();
		p3.print();		// Printer 객체를 참조하고 있어도 실제 생성한 ColorPrinter객체의 재정의된 print()가 실행됨
						// 즉, Printer 타입의 참조변수로 자식 Printer 객체를 참조하고 있을 때 print()를 실행하면 실제 생성된 객체에 재정의된 print()가 실행된다.
		
		// 다형성 - 같은 참조타입(부모타입)이어도 연결된 객체(자식객체)에 따라서 실행결과가 다르게 발현되는 것
		// OCP : 개방 폐쇄 원칙, Open Close Principle
	}
}
