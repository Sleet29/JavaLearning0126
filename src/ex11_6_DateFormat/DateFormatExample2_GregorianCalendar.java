package ex11_6_DateFormat;
import java.util.*;
import java.text.*;

class DateFormatExample2_GregorianCalendar {
	public static void main(String args[]) {
		GregorianCalendar calendar = new GregorianCalendar();
		Date date = calendar.getTime();
		
		// calendar.getTime() : calendar 객체가 가지고 있는 날짜와 시간과 똑같은
		// 정보를 갖는 Date 객체를 만들어서 리턴하는 메서드입니다.
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초 E요일");
		System.out.println(sdf1.format(date));
		System.out.println(sdf1.format(calendar.getTime()));
	}
	

}
