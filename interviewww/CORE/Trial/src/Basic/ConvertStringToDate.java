package Basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {
public static void main(String[] args) throws ParseException {


		String s = "11/02/2018";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Date d = sdf.parse(s);
		System.out.println(d);
	}

}
