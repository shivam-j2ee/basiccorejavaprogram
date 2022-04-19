package com.raystech.JavaBasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDate {

	public static void main(String[] args) throws ParseException {

		String s = "09/04/2018";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Date d = sdf.parse(s);
		System.out.println(d);
	}

}
