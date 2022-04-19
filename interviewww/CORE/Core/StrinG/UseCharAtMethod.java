package com.raystech.StrinG;

public class UseCharAtMethod {
	
	public static void main(String[] args) {
		
		
		String s = new String("Hukum");
		
		
		System.out.println(s.charAt(4));
		System.out.println(s.toCharArray());
		System.out.println(s.toString());
		System.out.println(s.trim());
		System.out.println(s.length());
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.lastIndexOf("m"));
		System.out.println(s.lastIndexOf('5'));
		System.out.println(s.lastIndexOf('m'));
		System.out.println(s.lastIndexOf(3));
		System.out.println(s.lastIndexOf("u", 12));
		System.out.println(s.endsWith("m"));
		System.out.println(s.startsWith("H"));
		System.out.println(s.substring(0,4));
		System.out.println(s.substring(2,5));
		System.out.println(s.compareTo("Hukum"));
		System.out.println(s.concat("Pal"));
		System.out.println(s.compareToIgnoreCase("HUKUM"));
        System.out.println(s.equals(s));	
        System.out.println(s.equalsIgnoreCase("hukum"));
        System.out.println(s.indexOf("M"));
        System.out.println(s.indexOf('m'));
        System.out.println(s.indexOf(2));
        System.out.println(s.indexOf('2'));
        System.out.println(s.hashCode());
        System.out.println(s.isEmpty());
        System.out.println(s.chars());
        System.out.println(s.codePointAt(0)); //it returns ASCII value of a character present in the zero (0) index
		//System.out.println(s.codePointAt(-5));
		//System.out.println(s.codePointAt(2));
		System.out.println(s.codePointBefore(4));
		System.out.println(s.codePointCount(2, 5));
		System.out.println(s.contains("M"));
		System.out.println(s.contentEquals("Hukum"));
		System.out.println(s.intern());
		
		String t = new String("Hukum");
		System.out.println(s.intern() == t.intern());
		System.out.println(s.matches("Hukum"));
		System.out.println(Integer.valueOf("-052"));
		System.out.println(Integer.parseInt("-354655502"));
		System.out.println(Long.parseLong("334345657743445478"));
		System.out.println(Double.parseDouble("556578765653421543535"));
		System.out.println(Short.parseShort("003454"));
		System.out.println(Byte.parseByte("0110"));
		System.out.println(Boolean.parseBoolean("TruE"));
		System.out.println(Boolean.parseBoolean("fAlSE"));
	
	}
}
