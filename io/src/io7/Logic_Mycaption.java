package io7; //20231124

/*
 * 1.    DB
 *                
 *    	  ↓
 * 2. Repository : UncheckedException 발생 => throw로 일괄처리까지 던지기
 *                (외부라이브러리 mybatis, JPA 단계)
 *    	  ↓
 * 3.  Service   : 예외강제발생 (***업무로직 핵심!)
 *                 1. 값을 전달받아
 *                 2. 해당 값에 대한 필요한 정보를 조회 하고
 *                 3. 가치판단(로직 체크)한 후
 *                 4. 예외발생 로직 위배된 사항 제외하고
 *                 5. 요청사항 반환해주기 
 *    	  ↓
 * 4.  UI(표현계층) : 예외일괄처리 - 웹브라우저에 에러페이지 제공
 *                 (JSP 단계)
 *    	  ↓
 * 5.   웹브라우저
 *                
 */

public class Logic_Mycaption { }
