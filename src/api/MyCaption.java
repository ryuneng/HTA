package api; //20231113

/*
 * API(Application Programming Interface)
 *  - 응용프로그래밍 인터페이스
 *  - 프로그램을 작성하기 위해서 사용하는 라이브러리들의 기능에 대한 사양
 *  
 * Java API
 *  - 자바 프로그램에서 제공하는 라이브러리의 집합
 *  - 개발자들이 자바 라이브러리의 다양한 기능을 쉽게 이해하고 구현에 활용할 수 있도록 API에 대한 상세한 문서를 제공한다.
 *  
 * Java의 모듈
 *  - 모듈은 관련있는 패키지들의 묶음
 *  - 주요 모듈
 *  		java.base     : 자바의 핵심 API를 제공하는 모듈 - 자바의 가장 기본적인 클래스들을 포함하고 있음
 *  		java.sql	  : 데이터베이스 액세스 관련 API를 제공하는 모듈
 *  		java.xml	  : XML데이터를 처리하기 위한 API를 제공하는 모듈 - XML은 시스템 간의 데이터 교환에 사용되는 데이터 작성 방식
 *  		java.desktop  : 데스크탑용 GUI 애플리케이션 개발을 위한 API를 제공하는 모듈 - 스윙(Swing), AWT와 같은 GUI 개발 툴킷을 포함하고 있음
 *  		java.logging  : 로깅 기능을 제공하는 API
 *  		java.security : 보안/암호화와 관련된 API를 제공
 *  
 * java.base 모듈의 주요 패키지
 *  	java.lang : 자바 프로그램 언어의 핵심 클래스를 포함하고 있는 패키지
 *  				- Object, Class, System, Thread와 같은 클래스
 *  				- 기본 데이터 타입의 Wrapper클래스(Integer, Long, Double, Boolean 등)
 *  				- 예외처리 관련 클래스
 *  
 *  	java.util : 다양한 유틸리티 클래스와 인터페이스를 포함하고 있는 패키지
 *  				- Collection FrameWork(자료구조 프레임워크), 날짜와 시간 관련 API, 다양한 유틸리티 클래스
 *  
 *  	java.io   : 입출력 관련 클래스와 인터페이스를 제공하는 패키지
 *  				- 파일 입출력, 직렬화 관련 클래스
 *  
 *  	java.nio  : 논블로킹 입출력 관련 클래스를 제공하는 패키지
 *  
 *  	java.net  : 네트워크 관련 클래스와 인터페이스를 제공하는 패키지
 *  				- URL, URI, Socket, ServerSocket과 같은 네트워크 프로그램 개발 관련 클래스 제공
 *  
 *  	java.math : 매우 큰 숫자에 대한 정밀한 숫자계산에 활용되는 클래스를 제공하는 패키지
 *  				- BigDecimal, BigInteger 등의 클래스를 제공
 */

/*
 * final 키워드
 * 
 * 1. final 클래스 - 상속 금지
 * 		public final class String {
 * 			
 * 		}
 * 
 * 		- 이 클래스를 상속받아서 자식 클래스를 정의할 수 없다.
 * 
 * 2. final 메소드 - 재정의 금지
 * 		public class Object {
 * 			public String toString() { ... }
 * 			public final Class<?> getClass() { ... }
 * 			public final void notify() { ... }
 * 		}
 * 		- 이 메소드를 자식 클래스에서 재정의할 수 없다.(부모에 정의된 그대로 사용해야 함)
 * 
 * 3. final 변수 - 값변경 금지
 * 		public final class Math {
 * 			final double PI = 3.14xxxxxx;
 * 		}
 * 		- 이 변수의 값을 변경할 수 없다.
 */

public class MyCaption {

}
