package com.raystech.StrinG;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateUsingFormatMethod {

	public static void main(String[] args) throws Exception {

		
		/*String s = "2016/12/25";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	    Date d = sdf.parse(s);
		System.out.println(d);*/
	
		Date d = new Date();
	  SimpleDateFormat sdf =  new SimpleDateFormat("dd-MM-yyyy");
	   String s = sdf.format(d);
	   System.out.println(s);
	}

}
