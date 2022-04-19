package Basic.Repeat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
public static void main(String[] args) {
	Date d=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("01/02/19");
	String s=sdf.format(d);
	System.out.println(s);
}
}
