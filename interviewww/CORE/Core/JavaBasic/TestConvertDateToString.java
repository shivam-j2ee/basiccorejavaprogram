package com.raystech.JavaBasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConvertDateToString {

	public static void main(String[] args) {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		
	}

}
