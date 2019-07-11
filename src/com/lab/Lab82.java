package com.lab;

import java.io.*;

public class Lab82 {
public static void main(String[] args) throws IOException {
	File f=new File("Samy.txt");
	FileReader r=new FileReader(f);
int i=r.read();
int line=1;
if(f.exists()) {
	

while(i!=-1)
{System.out.println("line number = "+line);
System.out.println((char)i);
i=r.read();
line++;
}
r.close();
}
else 
{System.out.println("file not found");
	
	
}
}}
