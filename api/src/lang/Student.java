package lang; //20231114

public class Student implements Comparable<Student> {
	int no;
	String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public String toString() {
		return "{no:" + no + ", name:" + name + "}";
	}
	
	@Override
	public int compareTo(Student other) {
		
//		return this.no - other.no;
		return this.name.compareTo(other.name);
	}
}

/*
 * sort하기 위해서는 비교할 수 있도록 만들어야 함
 *  - 1. 해당 class에서 interface Comparable을 구현해야 하고,
 *    2. interface Comparable의 compareTo()를 구현해야 함
 */

/*
 * this  ===> no = 10, name = "홍길동"
 * other ===> no = 3,  name = "강감찬"
 * 
 * 양의 정수 - this의 순위가 뒤
 * 음의 정수 - this의 순위가 앞
 * 0      - this와 other의 순위가 동일하다.
 */