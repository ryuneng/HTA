package collection; //20231117

/*
 * Iterator<E>
 *  - 콜렉션에 저장된 요소(객체)를 반복처리하는 구현객체가 반드시 구현할 기능을 정의하고 있는 표준
 *  - 모든 콜렉션 프레임워크의 구현 클래스는 자신의 자료구조에 저장된 요소들을 반복처리하는 Iterator<E> 구현객체를 제공한다.
 *  - 모든 콜렉션 프레임워크의 구현 클래스는 iterator() 메소드를 실행하면 자신이 구현하고 Iterator<E> 구현객체를 제공한다.
 *    ArrayList<String> c1 = new ArrayList<>();
 *    Vector<Integer> c2 = new Vector<>();
 *    HashSet<User> c3 = new HashSet<>();
 *    TreeSet<Score> c4 = new TreeSet<>();
 *    
 *    Iterator<String> iter1 = c1.iterator();
 *    Iterator<Integer> iter2 = c2.iterator();
 *    Iterator<User> iter3 = c3.iterator();
 *    Iterator<Score> iter4 = c4.iterator();
 *    
 *   
 *  	boolean hasNext()
 *  		반복처리할 요소가 남아있으면 true 반환  
 *  	E next()
 *  		남아있는 요소 중에서 하나를 반환
 *  	void remove()
 *  		현재 반복처리 중의 요소를 삭제
 *  	void forEachRemaining(Consumer<E> action)
 *  		남아있는 요소를 차례차례 처리하는 Consumer 인터페이스 구현객체를 전달해서 요소들을 처리
 */

/*  
 * while 문
 *  	while (조건식) {
 *  		수행문;
 *  	}
 *  	* 조건식이 true로 판정되면 수행문을 실행
 *  	* 실행 순서 : 조건식 => 수행문 => 조건식 => 수행문 => 조건식 => 수행문...
 *  				^		 |
 *  				|________|
 *  	* 반복을 계속 수행할지 여부를 알려주는 기능이 제공되는 객체를 대상으로 한다.
 *  		예)
 *  		   Iterator<E>
 *  				boolean hasNext()
 *  		   Enumeration<E>
 *  				boolean hasMoreElements()
 *  		   ResultSet
 *  				boolean next()
 *  		   StringTokenizer
 *  				boolean hasMoreTokens()
 *  
 *  	* 사용 예시)
 *  		List<String> list = Arrays.asList("홍길동", "김유신", "강감찬");
 *  		
 *  		// 1. 향상된 for문 사용 (삭제할 일 없으면 for문 사용하기)
 *  		for (String name : list) {
 *  			System.out.println(name);
 *  			// 삭제하기 - 오류발생
 *  			if (name.equals("홍길동")) {
 *  				list.remove(name);
 *  			}
 *  		}
 *  
 *  		// 2. Iterator, while 사용 (삭제할 일이 있을 때만 사용 - for문에서는 삭제 불가)
 *  		Iterator<String> it = list.iterator(); // Iterator 의 구현체 획득
 *  		while (it.hasNext()) {
 *  			String name = it.next();
 *  			System.out.println(name);
 *  			// 삭제하기
 *  			if (name.equals("홍길동")) {
 *  				it.remove();
 *  			}
 *  		}
 */
public class Iterator_MyCaption {
	
}
