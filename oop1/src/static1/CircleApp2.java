package static1; //20231108

public class CircleApp2 {
	public static void main(String[] args) {
		Circle2 c1 = new Circle2(2);
		Circle2 c2 = new Circle2(3);
		Circle2 c3 = new Circle2(5);
		Circle2 c4 = new Circle2(6);
		Circle2 c5 = new Circle2(8);
		
		System.out.println("c1의 둘레" + c1.around());
		System.out.println("c2의 둘레" + c2.around());
		System.out.println("c3의 둘레" + c3.around());
		System.out.println("c4의 둘레" + c4.around());
		System.out.println("c5의 둘레" + c5.around());
	}
}
