package lang; //20231114

import java.util.Map;

public class SystemApp1 {
	public static void main(String[] args) {
		/*
		 * long currentTimeMillis()
		 *  - 컴퓨터의 유닉스타임값을 반환한다.
		 *  - 유닉스타임은 1970년 1월 1일 0시0분0초부터 현재까지의 시간을 1/1000초 단위로 표현한 값이다.
		 */
		long unixTime = System.currentTimeMillis();
		System.out.println("유닉스타임: " + unixTime);
		
		/*
		 * String getProperty(String name)
		 *  - 지정된 시스템 프로퍼티 이름에 해당하는 시스템의 프로퍼티값을 반환한다.
		 */
//		Properties props = System.getProperties();
//		System.out.println(props);
		String value1 = System.getProperty("user.language");
		String value2 = System.getProperty("user.country");
		String value3 = System.getProperty("user.name");
		String value4 = System.getProperty("user.home");
		String value5 = System.getProperty("user.dir");
		String value6 = System.getProperty("line.separator");
		String value7 = System.getProperty("file.separator");
		
		System.out.println("언어: " + value1);
		System.out.println("국가: " + value2);
		System.out.println("사용자이름: " + value3);
		System.out.println("사용자의 홈 디렉토리 경로: " + value4);
		System.out.println("현재 디렉토리: " + value5);
		System.out.println("시스템의 줄바꿈문자: " + value6);
		System.out.println("시스템의 디렉토리구분 문자: " + value7);
		
		/*
		 * String getenv(String name)
		 *  - 지정된 이름에 해당하는 시스템의 환경변수값을 반환한다.
		 */
//		Map<String, String> envs = System.getenv();
//		System.out.println(envs);
		String env1 = System.getenv("JAVA_HOME");
		String env2 = System.getenv("PATH");
		String env3 = System.getenv("temp");
		
		System.out.println("---------------------------------");
		System.out.println("자바 홈 디렉토리: " + env1);
		System.out.println("path 설정된 경로: " + env2);
		System.out.println("임시 디렉토리 경로: " + env3);
		
		
	}
}
