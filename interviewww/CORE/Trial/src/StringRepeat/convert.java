package StringRepeat;
public class convert{
public static void main(String[] args){
//Convert String to Character..
String s="vaishali";
for(int i=0;i<s.length();i++){
char c=s.charAt(i);
System.out.println(c);
}
//Convert String to Character array...
String s1="shah";
for(int i=0;i<s1.length();i++){
char[] c1=s1.toCharArray();
System.out.println(c1[i]);
}

//Convert Char to String..
char c3='v';
String s3=Character.toString(c3);
System.out.println(s3);

//Convert char array to string..
char[] c4={'r','s','t'};
String s4=String.valueOf(c4);
System.out.println(s4);

//Convert string to int..
String s5="10";
int i=Integer.parseInt(s5);
System.out.println(s5);
}}