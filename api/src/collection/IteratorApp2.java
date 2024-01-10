package collection; //20231117

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorApp2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("김유신");
		list.add("김유신");
		list.add("이순신");
		list.add(null);
		list.add("홍길동");
		list.add("홍길동");
		list.add("류관순");
		list.add("안중근");
		
		// 1. 콜렉션의 remove(Object o) 메소드로 요소 삭제하기
		// 리스트객체에서 처음으로 발견되는 객체만 삭제
		list.remove("김유신"); // 맨 앞의 "김유신"만 삭제
		System.out.println(list);
		
		// 2. 향상된 for문으로 반복처리 중에 요소 삭제하기(불가)
		// 향상된 for문으로 반복처리하는 도중에 콜렉션에 저장된 객체 삭제 불가
		for (String name : list) {
			if ("홍길동".equals(name)) { 		// 문자열을 비교할 땐 반드시 값을 먼저 앞에 오도록 작성 !!!!!!!!!!!
//			if (name.equals("홍길동")) { 		// 이렇게 적으면 NullPointerException 발생 가능성 있음(name 에 null 값이 있을 수 있기 때문에)
//				list.remove(name); // 예외발생 - ConcurrentModificationException (삭제 불가)
			}
		}
		
		// 3. Iterator 로 반복처리 중에 요소 삭제하기
		// 반복 중에 삭제할 거면 Iterator로 삭제하기 
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			if ("홍길동".equals(name)) { // "홍길동" 값은 몇개든 전부 삭제됨
				itr.remove();
			}
		}
		System.out.println(list);
		
	}
}
