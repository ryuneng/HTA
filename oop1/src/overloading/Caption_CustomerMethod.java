package overloading; //20231101

public class Caption_CustomerMethod {

}

/*
 * 아이디와 비밀번호를 전달받아서 로그인 성공여부를 반환하는 메서드
 * 반환타입: boolean, 성공여부
 * 매개변수: 아이디, 비밀번호
 * boolean login(String id, String password) {
 * 		...
 * }
 */

/*
 * 아이디, 비밀번호, 이메일, 이름 등의 고객정보를 전달받아서 데이터베이스에 저장하는 메소드
 * 반환타입: 없음
 * 매개변수: 아이디, 비밀번호, 이메일, 이름
 * boolean login(String id, String password, String email, String name) {
 * 		...
 * }
 */

/*
 * 고객정보를 전달받아서 데이터베이스에 저장하는 메소드
 * 반환타입: 없음
 * 매개변수: 고객정보
 * void saveCustomer(Customer customer) {
 * 		...
 * }
 */

/*
 * 고객의 아이디를 전달받아서 해당 고객의 정보를 반환하는 메소드
 * 반환타입: Customer, 고객정보
 * 매개변수: 고객아이디
 * Customer getCustomerById(String id) {
 * 		...
 * }
 */