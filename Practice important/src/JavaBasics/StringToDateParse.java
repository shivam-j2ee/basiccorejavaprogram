package JavaBasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateParse 
{
	public static void main(String[] args) throws ParseException 
	{
      String s = "02/11/2019";
      
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      
      Date d = sdf.parse(s);
      
      System.out.println(d);
      
      //find Date , Month , Year
      
      SimpleDateFormat sdate = new SimpleDateFormat("dd");
      SimpleDateFormat smonth = new SimpleDateFormat("MM");
      SimpleDateFormat syear = new SimpleDateFormat("yyyy");
      
      String sd1 = sdate.format(d);
 
      System.out.println(sd1);
      
	}
}
