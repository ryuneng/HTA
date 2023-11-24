package io8; //20231124

import java.util.Set;

/**
 * 로또 추첨번호를 표현하는 클래스
 */
public class Lotto {
	private int no;
	private Set<Integer> numbers;
	private int bonus;
	
	public Lotto() { }

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Set<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(Set<Integer> numbers) {
		this.numbers = numbers;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}
