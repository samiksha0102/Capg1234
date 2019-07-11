package com.cap.basic;

public class Equal {
private static final CharSequence Y = null;
private static final CharSequence H = null;

public static void main(String[] args) {
	StringBuffer w= new  StringBuffer("you");

	StringBuffer r= new  StringBuffer("you");

	System.out.println(w==r);
	System.out.println(w.equals(r));
System.out.println(w);
 String p=w.toString();
 String q=r.toString();
 System.out.println(p.equals(q));
 w.append("bhu");
 System.out.println(w);
String a= new  String("true");
String b= new  String("true");
System.out.println(a==b);
System.out.println(a.equals(b));
String s= new  String("samy jain");

String t= new  String("SAMY");

System.out.println(s.compareTo(t));
System.out.println(s.equals(t));

System.out.println(s.compareToIgnoreCase(t));
System.out.println(t.toLowerCase());
System.out.println(s.toUpperCase());
System.out.println(s.charAt(2));
System.out.println(t.concat(s));
System.out.println(s.split(""));
System.out.println(t.length());
System.out.println(t.trim());
System.out.println(t.toLowerCase());
System.out.println(t.replace('S','h'));
System.out.println(t.indexOf("Y"));
System.out.println(t.lastIndexOf("A"));



}
}
