package collection; //20231116

import java.util.Random;
import java.util.TreeSet;

public class TreeSetApp2 {
	public static void main(String[] args) {
		/*
		 * 로또번호 추출하기
		 *  - TreeSet<E> 사용
		 *    1. 중복된 값을 저장하지 않는다.
		 *    2. 값이 오름차순으로 정렬되어 저장된다.
		 */
		Random random = new Random();
		TreeSet<Integer> lotto = new TreeSet<>();
		
		while (true) {
			int number = random.nextInt(45) + 1;
			System.out.println(number);
			lotto.add(number);
			
			if (lotto.size() == 6) {
				break;
			}
 		}
		
		System.out.println(lotto);
	}
}
/* 
 * 일반 배열을 사용하면 훨씬 더 긴 코드를 작성해야 하는데, TreeSet을 사용하면 이렇게 간단하게 작성할 수 있음
 * (package util\class RandomApp 참고)
 * 
 *  1. 일반 배열 사용했을 때 필요한 과정
 *    1) 번호추출
 *    2) 중복여부 체크
 *    3) 저장, 저장위치 1 증가
 *    4) 정렬
 *    
 *  2. TreeSet 사용했을 때 필요한 과정
 *    1) 번호추출
 *    2) 저장
 *    
 *  ====> 중복여부 체크는 Set이 해주고, 저장위치 1증가는 Set 이용하면 자동으로 담기고, 정렬은 TreeSet이 알아서 해줌 
 */