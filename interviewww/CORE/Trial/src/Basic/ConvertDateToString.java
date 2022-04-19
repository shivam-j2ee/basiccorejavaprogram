package Basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateToString {
public static void main(String[] args) {
	Date d=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("01-02-1996");
	String s=sdf.format(d);
	System.out.println(s);
	
}
}
