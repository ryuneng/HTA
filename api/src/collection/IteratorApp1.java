package collection; //20231117

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorApp1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "김유신", "강감찬", "이순신", "류관순");
		
		System.out.println("### 일반 for문 사용해서 반복처리하기 - List계열만 가능(Set은 index가 없음)");
		int size = list.size(); // list.size()를 for 조건식에 넣을 거면 반드시 이렇게 선언해놓고 변수로 넣기!!!!!!!!! - 메소드 자체를 for 조건식에 넣어놓으면 for 반복될 때마다 계속 메소드 실행됨 
		for (int index = 0; index < size; index++) {
			String name = list.get(index);
			System.out.println(name);
		}
		
		System.out.println("\n### 향상된 for문 사용해서 반복처리하기"); // java 1.5
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("\n### Iterator 사용해서 반복처리하기");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) { 		  // hasNext()로 반복할 요소가 남았는지 확인
			String name = itr.next(); // next()로 요소 꺼내기
			System.out.println(name);
		}
		
		System.out.println("\n### Stream 사용해서 반복처리하기"); // java 1.8
		list.stream().forEach(name -> System.out.println(name));
	}
}
