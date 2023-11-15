package time; //20231115

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App1 {
	public static void main(String[] args) {
		// 현재 날짜 정보를 가진 LocalDate 객체 생성하기 - now()
		LocalDate date1 = LocalDate.now();
		System.out.println("현재 날짜: " + date1);
		
		// 현재 시간 정보를 가진 LocalTime 객체 생성하기 - now()
		LocalTime time1 = LocalTime.now();
		System.out.println("현재 시간: " + time1);
		
		// 현재 날짜와 시간 정보를 가진 LocalDateTime 객체 생성하기 - now()
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: " + dateTime1);
		
		System.out.println("\n-------------------------------");
		
		// 지정된 날짜 정보를 가진 LocalDate 객체 생성하기 - of()
		LocalDate date2 = LocalDate.of(2023, 11, 1);
		System.out.println("지정된 날짜: " + date2);
		
		// 지정된 날짜, 시간 정보를 가진 LocalDateTime 객체 생성하기 - of()
		LocalDateTime dateTime2 = LocalDateTime.of(2023, 10, 31, 10, 5);
		System.out.println("지정된 날짜와 시간: " + dateTime2);
	}
}
