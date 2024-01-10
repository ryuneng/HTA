package app; //20231117

/*
 * 클래스 만드는 순서
 *  1. Score
 *   	학생의 성적정보를 표현하는 클래스
 *       - 값을 정의하는 클래스 ===> DTO = Bean = VO(ValueObject)
 *  2. ScoreRepository
 *   	성적관리 영속화 클래스
 *  3. ScoreService
 *   	성적관리 업무로직 클래스 - CRUD
 *  4. ScoreUI
 *   	성적관리 UI 클래스 - I/O(Input/Output)
 */



/*
 * Comparable<T> / Comparator<T>
 *  1. Comparable<T> 인터페이스를 구현한 객체들끼리는 정렬 가능해짐
 *     interface Comparable<T> {
 *  	   int compareTo(T other)
 *     }
 *     - 정렬 방법
 *     Collections.sort(리스트)
 * 
 *  2. o1과 o2의 대소관계를 비교하는 구현메소드를 작성하면, o1과 o2는 정렬 가능해짐
 *     interface Comparator<T> {
 *  	   int compare(T o1, T o2);
 *     }
 *     - 정렬 방법
 *     Collections.sort(리스트, Comparator 구현객체)
 *     리스트.sort(Comparator 구현객체)
 */
public class MyCaption {

}
