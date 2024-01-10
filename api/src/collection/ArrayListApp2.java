package collection; //20231116

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListApp2 {
	public static void main(String[] args) {
		// 1. new 키워드를 이용해서 List 인터페이스 구현체인 ArrayList 객체 생성하기
		List<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("김유신");
		names.add("강감찬");
		
		// 2. Array 클래스 정적메소드 asList(T... t)를 이용해서 List 인터페이스의 구현객체 생성하기 - 몇개 안되는 데이터 생성할 때는 이걸로 하면 됨
		List<String> names2 = Arrays.asList("홍길동", "김유신", "강감찬");
		
		// 3. List 클래스 정적메소드 of(E e)를 이용해서 List 인터페이스의 구현객체 생성하기
		// 아래 방법으로 생성한 List 객체는 불변 객체
		// ==> 새로운 객체 추가, 기존 객체 삭제 불가
		List<String> names3 = List.of("홍길동", "김유신", "강감찬");
	}
}
