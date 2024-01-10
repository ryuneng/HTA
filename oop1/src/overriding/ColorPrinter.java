package overriding; //20231109

public class ColorPrinter extends Printer {
	@Override
	public void print() {
		System.out.println("컬러로 인쇄합니다.");
	}
}
