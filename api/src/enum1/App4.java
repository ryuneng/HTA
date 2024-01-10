package enum1; //20231201

public class App4 {
	public static void main(String[] args) {
		Grade grade1 = Grade.BRONZE;
		int OrderPrice = 1000000;
		
		double depositRate = grade1.getDepositRate();
		int point = (int) (OrderPrice*depositRate);
		
		System.out.println("적립포인트: " + point);
	}
}
