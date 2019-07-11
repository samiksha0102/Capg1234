package com.lab;


import java.text.*;
import java.util.*;

public class Lab86 
{
public static void main(String[] args)throws ParseException { 
		
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter days in yyyy-mm-dd");
String s=sc.next();
 DateFormat formatter=new SimpleDateFormat("yyyy-mm-dd");
 Date date=(Date)formatter.parse(s);
 Date sysDate=new Date();
 System.out.println(sysDate);
 duration(date,sysDate);
 sc.close();
}
static void duration(Date date1,Date date2)
{
	int days_diff=date2.getDay()-date1.getDay();
	int mon_diff=date2.getMonth()-date1.getMonth();
	int year_diff=date2.getYear()-date1.getYear();
	System.out.println("Days difference = "+days_diff);
	System.out.println("month difference = "+mon_diff);
	System.out.println("year difference = "+year_diff);
}
}