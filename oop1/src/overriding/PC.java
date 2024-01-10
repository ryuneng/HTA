package overriding; //20231109

public class PC {
	Printer p; // Printer 및 그 하위 객체를 연결할 잭
			   // - 메인 메소드에서 각 객체 생성 후 pc.p = 객체변수명; 으로 다른 그 어떤 코드의 변경도 없이 각 객체를 연결할 수 있음
	
	public void printDocument() {
		p.print();
	}
}
