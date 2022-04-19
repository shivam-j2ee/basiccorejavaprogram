package com.raystech.JavaBasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UseFormatMethodToConvertDate {

	public static void main(String[] args) {

		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
		
		String s = sdf.format(d);
		System.out.println(s);
		
	}

}
