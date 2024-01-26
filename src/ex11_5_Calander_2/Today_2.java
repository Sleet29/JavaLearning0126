/*
1. 클래스
	이름 : Today
	접근제어자 : public
	
2. 필드
	자료형 : Calendar
	접근제어자 : private
	현재 시스템의 시간을 설정할 수 있도록 GregorianCalendar을 이용해서 객체 생성
	
3. 생성자(접근제어자 : public)
	1) 매개변수 : GregorianCalendar 형
	   기능 : 매개변수의 값으로 필드 초기화
	   
	2) 매개변수 없는 생성자
	
4. 메서드
	이름 : toString()
	매개변수 : 없음
	반환형 : String (예-2022년 6월 8일 오전 11:16:14 수요일입니다.)
	기능 : 해당 날짜의 년 월 일 시 분 초 요일 을 문자열로 구해 리턴합니다.
	접근제어자 : public


 */
package ex11_5_Calander_2;
import java.util.*;
public class Today_2 {
    private Calendar currentDate;

    public Today_2(GregorianCalendar date) {
        this.currentDate = date;
    }

    public Today_2() {
        this.currentDate = new GregorianCalendar(2024,6,01);
    }

    
    
    public String toString() {
        int year = currentDate.get(Calendar.YEAR);
        int month = currentDate.get(Calendar.MONTH)+1; // 월은 0부터 시작하므로 1을 더함
        int day = currentDate.get(Calendar.DAY_OF_MONTH);
        int hour = currentDate.get(Calendar.HOUR_OF_DAY);
        int ampm = currentDate.get(Calendar.AM_PM);
        int minute = currentDate.get(Calendar.MINUTE);
        int second = currentDate.get(Calendar.SECOND);
        int dayOfWeek = currentDate.get(Calendar.DAY_OF_WEEK);
        
        
        String[] daysOfWeek = {"", "일", "월", "화", "수", "목", "금", "토"};
        String[] ampms = {"오전","오후"};
        
        
        String dayOfWeekString = daysOfWeek[dayOfWeek];
        String ampmString = ampms[ampm];
        String result = String.format("%d년 %d월 %d일 %s %d:%02d:%02d %s요일입니다.",
                year, month, day, ampmString, hour, minute, second,dayOfWeekString);

        return result;
    }
    
    public static void main(String[] args) {

        Today_2 today = new Today_2();
        System.out.println("오늘: " + today.toString());
        
        
        System.out.println("====== 오늘의 날짜 ======");
        Today t = new Today();
        System.out.println(t.toString());
        System.out.println(t);
        
        System.out.println("====== 특정 날짜 ======");
        GregorianCalendar g = new GregorianCalendar(2024,6,1);
        Today t2 = new Today(g);
        System.out.println(t.toString());
        System.out.println(t2);
        
        System.out.println("====== 특정 날짜 ======");
        Today t3 = new Today(new GregorianCalendar(2024,6,1));
        System.out.println(t.toString());
        System.out.println(t3);
    }
}

/*
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Today {
    // 필드
    private Calendar currentDate;

    // 생성자
    // 1) 매개변수가 있는 생성자
    public Today(GregorianCalendar date) {
        this.currentDate = date;
    }

    // 2) 매개변수 없는 생성자
    public Today() {
        this.currentDate = new GregorianCalendar();
    }

    // 메서드
    public String toString() {
        int year = currentDate.get(Calendar.YEAR);
        int month = currentDate.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1을 더함
        int day = currentDate.get(Calendar.DAY_OF_MONTH);
        int hour = currentDate.get(Calendar.HOUR_OF_DAY);
        int minute = currentDate.get(Calendar.MINUTE);
        int second = currentDate.get(Calendar.SECOND);
        int dayOfWeek = currentDate.get(Calendar.DAY_OF_WEEK);

        // 요일을 문자열로 변환
        String[] daysOfWeek = {"", "일", "월", "화", "수", "목", "금", "토"};
        String dayOfWeekString = daysOfWeek[dayOfWeek];

        // 결과 문자열 구성
        String result = String.format("%d년 %d월 %d일 %s %d:%02d:%02d입니다.",
                year, month, day, dayOfWeekString, hour, minute, second);

        return result;
    }

    // 테스트를 위한 main 메서드
    public static void main(String[] args) {
        // 매개변수가 있는 생성자로 객체 생성
        GregorianCalendar customDate = new GregorianCalendar(2022, Calendar.JUNE, 8, 11, 16, 14);
        Today today1 = new Today(customDate);

        // 매개변수 없는 생성자로 객체 생성
        Today today2 = new Today();

        // 출력
        System.out.println("Custom Date: " + today1.toString());
        System.out.println("Current Date: " + today2.toString());
    }
}
*/