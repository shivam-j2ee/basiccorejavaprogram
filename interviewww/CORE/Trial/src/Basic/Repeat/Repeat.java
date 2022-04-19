package Basic.Repeat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Repeat {

public static void main(String[] args) throws ParseException {

	String s="21/6/16";
	SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yy");
	Date d=sdf.parse(s);
	System.out.println(d);
	
}
	
	}