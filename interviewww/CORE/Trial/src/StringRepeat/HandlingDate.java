package StringRepeat;

import java.util.Calendar;
import java.util.Date;

public class HandlingDate{
public static void main(String[] args) {
	Date  today=new Date();
	System.out.println(today);
	
	Calendar cal=Calendar.getInstance();
	System.out.println(cal);
	
	cal.setTime(today);

	//get year of the date..
	int dy=cal.get(Calendar.DAY_OF_YEAR);
	int dm=cal.get(Calendar.DAY_OF_MONTH);
	int dw=cal.get(Calendar.DAY_OF_WEEK);
	int dwm=cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);


	System.out.println(dy);
	System.out.println(dm);
	System.out.println(dw);
	System.out.println(dwm);
	
	Date nextEvent=cal.getTime();
	System.out.println(nextEvent);
	
	//get yesterday's date..
	cal.add(Calendar.DATE,-1);
	int yd=cal.get(Calendar.DATE);
	System.out.println(yd);
	
	Date yesterday=cal.getTime();
	System.out.println(yesterday);
	
	//get date after 3 days..
	cal.add(Calendar.DATE,3);
	int after=cal.get(Calendar.DATE);
	System.out.println(after);
	
	
	


}
}