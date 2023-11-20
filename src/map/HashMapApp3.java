package map; //20231120

import java.util.HashMap;
import java.util.Map;

public class HashMapApp3 {
	public static void main(String[] args) {
		/*
		 * Map 사용해서 if문 제거하기
		 */
		
		// 1. Map 사용 전
		double goldDepositRate = 0.05;
		double silverDepositRate = 0.02;
		double bronzeDepositRate = 0.01;
		
		String grade = "gold";
		int orderPrice = 1000000;
		int point = 0;
		
		if("gold".equals(grade)) {
			point = (int) (orderPrice*goldDepositRate);
		} else if("silver".equals(grade)) {
			point = (int) (orderPrice*silverDepositRate);
		} else if("bronze".equals(grade)) {
			point = (int) (orderPrice*bronzeDepositRate);
		}
		System.out.println("적립포인트: " + point);
		
		// 2. Map 사용 후
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("gold", 0.05);
		map.put("silver", 0.02);
		map.put("bronze", 0.01);
		
		// grade는 "gold", "silver", "bornze" 중 하나 => if 필요없음, 아래 두 줄로 끝
		double depositRate = map.get(grade);
		point = (int)(orderPrice*depositRate);
		
		System.out.println("적립포인트: " + point);
	}
}
