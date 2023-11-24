package io8; //20231124

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class Order {
	private int lottoNo;                // 회차번호
	private long orderNo;               // 주문번호
	private List<Set<Integer>> numbers; // 구매한 로또번호 (Set안에 로또번호 6개가 있는데 그게 구매금액만큼 여러세트여야 하니까 List<Set<>>)
	
	public Order() {}

	public int getLottoNo() {
		return lottoNo;
	}

	public void setLottoNo(int lottoNo) {
		this.lottoNo = lottoNo;
	}

	public long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}

	public List<Set<Integer>> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Set<Integer>> numbers) {
		this.numbers = numbers;
	}
	
	// 20231124:1700808805922:2,8,18,26,35,36/2,12,24,27,38,43
	public static Order toOrder(String text) {
		String[] items = text.split(":");
		
		int lottoNo = Integer.parseInt(items[0]);
		long orderNo = Long.parseLong(items[1]);
		List<Set<Integer>> numbers = toList(items[2]);
		
		Order order = new Order();
		order.setLottoNo(lottoNo);
		order.setOrderNo(orderNo);
		order.setNumbers(numbers);
		
		return order;
	}
	
	// 여기서의 text: 2,8,18,26,35,36/2,12,24,27,38,43
	private static List<Set<Integer>> toList(String text) {
		List<Set<Integer>> numbers = new ArrayList<Set<Integer>>();
		
		String[] items = text.split("/");
		for (String item : items) {
			numbers.add(toSet(item));
		}
		
		return numbers;
	}
	
	// 여기서의 text: 2,8,18,26,35,36
	// 여기서의 text: 2,12,24,27,38,43
	private static Set<Integer> toSet(String text) {
		Set<Integer> set = new TreeSet<Integer>();
		
		String[] items = text.split(",");
		for (String item : items) {
			set.add(Integer.parseInt(item));
		}
		
		return set;
	}
	
	public String toText() {
		StringBuilder sb = new StringBuilder();
		sb.append(lottoNo);
		sb.append(":");
		sb.append(orderNo);
		sb.append(":");
		
		
		StringJoiner joiner = new StringJoiner("/");          // 구분문자 "/"를 이용해서 이어주는데, 맨끝에는 "/" 생략 
		for (Set<Integer> set : numbers) {
			StringJoiner innerJoiner = new StringJoiner(","); // 구분문자 ","를 이용해서 이어주는데, 맨끝에는 "," 생략 
			for (Integer num : set) {
				innerJoiner.add(String.valueOf(num)); // "1,2,3,4,5,6"
			}
			
			joiner.add(innerJoiner.toString()); // "1,2,3,4,5,6/1,2,3,4,5,6)
		}
		sb.append(joiner.toString());
		
		return sb.toString();
	}
}
