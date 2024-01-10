package etc; //20231110

public class Tico implements Car, AirConditioner {
	@Override
	public void go() {
		System.out.println("티코를 움직입니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("티코를 멈춥니다.");
	}
	
	@Override
	public void airControl() {
		System.out.println("티코의 실내온도를 조절합니다.");
	}
}
