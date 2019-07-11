package com.cap.basic;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read {
public static void main(String[] args)throws IOException {
	File f=new File("capgemini");
	FileReader fr=new FileReader(f);
	char[] ch=new char[(int)f.length()];
	fr.read(ch);
	for(char ch1:ch)                           //by using for each loop
	{System.out.println(ch1);

	}
	System.out.println("***************");
	FileReader fr1=new FileReader("capg1");
	int i=fr1.read();
	while(i!=-1)                         //by using while loop
	{System.out.println((char)i);
	i=fr1.read();
	}
	System.out.println("+++++++++++++");
	
	
	FileReader fr2=new FileReader("capg1");
	int i1=fr2.read();
	for(;i1!=-1;)                              //by using for loop
	{System.out.println((char)i1);
	i1=fr2.read();}
	fr.close();
	fr1.close();
	fr2.close();
	
}
}
