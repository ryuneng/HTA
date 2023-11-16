package generic; //20231116

/*
 * 타입 파라미터 정할 때 사용하는 문자 관례 (원래는 그 어떤 문자를 넣든 상관없음)
 *  - T : 값의 타입으로 사용될 때
 *  - K : key value 로 사용될 때
 *  - R : return 타입으로 사용될 때
 *  - E : element (요소)
 */
public class GenericBox<T> {
	private T data;
	
	public void add(T data) {
		this.data = data;
	}
	
	public T get() {
		return data;
	}
}
