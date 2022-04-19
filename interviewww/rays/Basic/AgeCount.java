package in.co.rays.Basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AgeCount {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sd1 = new SimpleDateFormat("dd");
		SimpleDateFormat sd2 = new SimpleDateFormat("MM");
		SimpleDateFormat sd3 =new SimpleDateFormat("yyyy");
		
		//present date
		int current_date = Integer.valueOf(sd1.format(d));
		int current_month = Integer.valueOf(sd2.format(d));
		int current_year = Integer.valueOf(sd3.format(d));
		
		//birth dd// mm // yyyy
		int birth_date = 15;
		int birth_month = 03;
		int birth_year = 1996;
		
		int month[] ={31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(birth_date > current_date){
			current_month = current_month -1;
			current_date = current_date+month[birth_month-1];	
		}
		if(birth_month > current_month){
			current_year = current_year -1;
			current_month = current_month + 12;
		}
		//calculate date,month,year
		int calculated_date = current_date - birth_date;
		int calculated_mont = current_month - birth_month;
		int calculated_year = current_year - birth_year;
		
		//print the present age
		System.out.println("present age : ");
		System.out.println("Years :"+calculated_year+ ", Months:"+calculated_mont+", Days: "+calculated_date);
	}
}
