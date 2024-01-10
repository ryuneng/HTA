package date; //20231115

import java.util.Calendar;
import java.util.Date;

/*
 * *Calendar 는 쓸 일 거의 없음
 */
public class CalendarApp {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Calendar 는 new 연산자 사용 못하고 .getInstance()로 획득 가능
//		System.out.println(cal);
		
		cal.set(Calendar.MONTH, 2); // 월을 3월로 지정

		/*
		 * int get(int field)
		 *  - Calendar 객체에서 field에 해당하는 정보를 반환한다.
		 *  
		 * void set(int field, int value)
		 *  - Calendar 객체에서 지정된 field에 해당하는 정보를 변경한다.
		 */
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hours = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(hours + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(seconds + "초");
		
		System.out.println();
		Date date = cal.getTime();
		System.out.println(date);
	}
}
