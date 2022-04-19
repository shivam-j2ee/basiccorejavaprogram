package Basic.Repeat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
public static void main(String[] args) throws ParseException {
	String s="01/02/19";
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	Date d=sdf.parse(s);
	System.out.println(d);
}
}
