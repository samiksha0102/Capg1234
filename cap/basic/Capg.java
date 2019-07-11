package com.cap.basic;
import java.io.File;
import java.io.IOException;

public class Capg{
	public static void main(String[] args) throws IOException
	{
		
File f=new File("capg1");
f.createNewFile();
System.out.println(f.mkdir());
System.out.println(f.exists());
System.out.println(f.isDirectory());
System.out.println(f.isFile());

}
}
