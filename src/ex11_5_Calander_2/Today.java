package ex11_5_Calander_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Today {
	
	private Calendar c1 = new GregorianCalendar();
	
	public Today() {}
	
	public Today(GregorianCalendar c1) {
		this.c1=c1;
	}
	
	 public String toString() {
	     
		 String[] yo = {"일", "월", "화", "수", "목", "금", "토"		 };
		 String[] ampm = {"오전","오후"};
		 int year = c1.get(Calendar.YEAR);
		 int month = c1.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1을 더함
		 int day = c1.get(Calendar.DAY_OF_MONTH);
		 int hour = c1.get(Calendar.HOUR_OF_DAY);
		 int ap = c1.get(Calendar.AM_PM);
		 int minute = c1.get(Calendar.MINUTE);
		 int second = c1.get(Calendar.SECOND);
		 int dayOfWeek = c1.get(Calendar.DAY_OF_WEEK);
	        
		 return year+"년 "+month+"월 "+day+"일 "+ampm[ap] + " "
				 + hour +":"+minute+":"+second+" "+yo[dayOfWeek-1]+"요일입니다.";
	 }
	 
	 public static void main(String[] args) {
		 System.out.println("====== 오늘의 날짜 ======");
		 Today t = new Today();
		 System.out.println(t.toString());
		 System.out.println(t);
		 
		 System.out.println("====== 특정 날짜 ======");
		 GregorianCalendar g = new GregorianCalendar(2024,6,1);
		 Today t2 = new Today(g);
		 System.out.println(t2.toString());
		 System.out.println(t2);
	        
		 System.out.println("====== 특정 날짜 ======");
		 Today t3 = new Today(new GregorianCalendar(2024,6,1));
		 System.out.println(t3.toString());
		 System.out.println(t3);
	 }
	 
}
