package lang; //20231114

import java.util.Arrays;

public class StudentApp {
	public static void main(String[] args) {
		Student[] arr = {
				new Student(10, "김유신"),
				new Student(1, "강감찬"),
				new Student(3, "이순신"),
				new Student(7, "류관순"),
				new Student(5, "안중근"),
				new Student(15, "김좌진"),
				new Student(9, "홍범도")
		};
		
		/*
		 * sort하기 위해서는 비교할 수 있도록 만들어야 함
		 *  - 1. 해당 class에서 interface Comparable을 구현해야 하고,
		 *    2. interface Comparable의 compareTo()를 구현해야 함
		 */
		Arrays.sort(arr);
		
		for(Student s : arr) {
			System.out.println(s.no + " " + s.name);
		}
	}
}
