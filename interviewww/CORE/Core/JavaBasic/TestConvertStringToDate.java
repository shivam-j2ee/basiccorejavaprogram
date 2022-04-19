package com.raystech.JavaBasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConvertStringToDate {

	public static void main(String[] args) throws Exception {

	 String s = "20/04/2018";
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	  
	 Date d = sdf.parse(s);
	 System.out.println(d);
	 
	 
	}

}
