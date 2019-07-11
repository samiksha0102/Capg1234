package com.cap.basic;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String[] args)throws Exception {
		
	FileInputStream f=new FileInputStream("kpt.txt") ;
	ObjectInputStream o=new ObjectInputStream(f);
	Test t= (Test)o.readObject();
	
	System.out.println(t.getname());
	o.close();
		
	}
	}

