package bank; //20231110


/*
 * 프로그램 만들 때 고려해야 할 순서
 *  1. class Account 		   - 프로그램의 대상이 되는 정보를 표현하는 클래스를 가장 먼저 만들기
 *  2. class AccountRepository - 데이터를 영구적으로 저장하는 클래스 (단순한 저장, 변경, 삭제만 하는 영역. 가치판단은 서비스에서)
 *  3. class AccountService	   - 실질적인 업무 처리를 하는 클래스(개발요구조건) - UI에게 제공 (Repository 가 필요함)
 *  4. class AccountUI		   - 사용자와 상호작용하는 메뉴를 제공하는 클래스 - 입력, 출력, 선택(검증이 완료된 값) (Service 가 필요함)
 *  5. class AccountApp		   - 실제 메뉴가 노출되는 클래스
 *  
 */

/*
 *  Service, UI 쪼개는 이유
 *  : 사용자와 상호작용하는 다양한 방법
 *   예) 표현계층      UI 		콘솔/키보드, 인터넷, ATM, 안드로이드 등 - 값의 유효성만 체크 (형식에 맞는 값인지 확인)
 *   				↓
 *      서비스계층   Service 	실제 업무로직 					   - 유효성이 체크된 값을 받아서 가치판단을 하고 단위작업들을 조합해서 로직(구체적인 기능)을 구현 (실제로 그런 값이 있는지 확인)
 *      			↓									   - 예) 입금하기(Read+Update), 출금하기, 비밀번호변경하기, 신규계좌개설하기(Read+Create)
 *      
 *      영속화계층  Repository 	DB							   - CRUD(Create, Read, Update, Delete) 데이터에 대한 단순한 단위작업을 구현 (가치판단 하지 않음)
 *      												   - 예) 전체조회, 조회, 저장, 삭제
 */

/*
 * 메소드 이름 정하는 기준
 *  1. 조회하는 기능 : getXXX / findXXX
 *   - get + 대상 By + 옵션
 *    // 전체 반환
 *    findAll()
 *    find + 		   By + accNo
 *    find + Account + By + accNo
 *    find + Accounts + By + Owner
 */


/*
 * 각 클래스 작성
 *  a. Account
 *    1. 계좌정보에 대한 변수 선언
 *    2. Repository 에서 배열객체 생성할 때 필요한 매개변수를 포함한 생성자 작성
 *    3. 간단한 계좌정보를 출력하는 메소드 작성
 *    4. 상세정보를 출력하는 메소드 작성
 *   
 *  b. AccountRepository
 *    1. Account[] 타입의 변수 db 생성 및 크기 할당
 *    2. 기본생성자 안에 db[] n개 생성 및 초기화 (index값은 savePosition++)
 *    3. 특정 기능을 가진 각 메소드 작성
 *     1) 전체계좌정보를 반환하는 Account[] 타입의 findAll()
 *      - 1.의 멤버변수와 다른 Account[]타입의 변수 result 생성 및 배열의 값을 savePosition으로 초기화
 *      - for문으로 result[]에 db[]를 대입
 *      - result 반환
 *      
 *     2) 특정 계좌정보를 반환하는 Account 타입의 findAccountByAccNo(String accNo)
 *      - Account 선언 및 초기화
 *      - 향상된 for문으로 배열의 처음부터 끝까지 반복하면서 검색조건에 맞는 계좌정보 출력
 */


public class MyCaption {

}
