package myCaption; //20231110

/*
 * 마크업 인터페이스
 *  - 추상메소드가 하나도 없는 인터페이스
 *  - 특정 인터페이스의 구현을 통해서 기능 제공 여부 판단 가능
 *  - 대표) Cloneable(복제), Serializable(직렬화, 네트워크 전송)
 *     예)
 *    1. public class Product { } 									 : 복제 불가, 네크워크 전송 불가
 *    2. public class Product implements Cloneable { } 			  	 : 복제 가능, 네크워크 전송 불가 
 *    3. public class Product implements Cloneable, Serializable { } : 복제 가능, 네크워크 전송 가능
 */



public class MarkUpInterface {

}
