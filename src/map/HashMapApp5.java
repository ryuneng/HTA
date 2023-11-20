package map; //20231120

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapApp5 {
	public static void main(String[] args) {
		// 회원이름 목록을 집계해서 성씨별 인원수 구하기
		// Map객체를 이용해서 key:성씨, value:인원수로 구성하면 된다.
		
		// 회원이름 목록
		String[] names = {"김유신", "홍길동", "이순신", "이황", "이이", "김구", "김좌진", "안중근", "윤봉길", "류관순", "강감찬"};
		
		// 성씨별 인원수를 저장할 Map객체를 생성한다.
		Map<String, Integer> map = new HashMap<>(); // HashMap이 아닌 TreeMap에 담으면 정렬돼서 출력됨
		
		for(String name : names) {
			// 이름에서 성씨를 조회한다.
			String key = name.substring(0, 1); // index0부터 1글자만 가져옴 => 맨앞의 한글자만 가져옴
			// 해당 성씨가 Map객체에 key로 포함되어 있는지 여부를 조회한다.
			// 조회결과  true의 경우: Map객체에 해당 성씨로 등록된 인원수 정보가 존재함으로 Map에서 성씨로 현재 인원수를 조회하고, 조회된 인원수에 1을 더해서 다시 저장한다.
			//       false의 경우: Map객체에 해당 성씨로 등록된 정보가 없으므로 Map객체에 key:성씨, value:1을 저장한다.
			boolean isContains = map.containsKey(key);
//			System.out.print(key + " : " + isContains + " ");
			if(isContains) { // true
				int count = map.get(key);
				map.put(key, count + 1);
			} else {		 // false
				map.put(key, 1);
			}
		}
		
		// 이렇게 쓸 일은 잘 없으니 참고만
		Set<Entry<String, Integer>> entries = map.entrySet();
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
