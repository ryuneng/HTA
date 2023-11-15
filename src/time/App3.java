package time; //20231115

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class App3 {
	public static void main(String[] args) {
		// 두 날짜 사이의 기간 조회하기
		LocalDate today = LocalDate.now();
		LocalDate birthDay = LocalDate.of(1995, 2, 15);
		
		long years = ChronoUnit.YEARS.between(birthDay, today);
		long months= ChronoUnit.MONTHS.between(birthDay, today);
		long days = ChronoUnit.DAYS.between(birthDay, today);
		
		System.out.println("년수: " + years + "년 ");
		System.out.println("개월수: " + months + "개월 ");
		System.out.println("일수: " + days + "일");
	}
}
