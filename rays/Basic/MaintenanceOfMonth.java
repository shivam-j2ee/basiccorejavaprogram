package in.co.rays.Basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MaintenanceOfMonth {
     public static void main(String[] args) {
		 
    	 int index = 0;
    	 Date d= new Date();
    	 SimpleDateFormat sdf = new SimpleDateFormat();
    	 
    	 Calendar cal = Calendar.getInstance();
    	 cal.setTime(d);
    	 
    	 for (int i = 30; i < 364; i=i+30) {
			
    		 cal.add(Calendar.DATE,+30);
    		 Date d1 = cal.getTime();
    		 String afterMonth = sdf.format(d1);
    		 index++;
    		 System.out.println(index+"month:"+afterMonth);
		}
	}
}
