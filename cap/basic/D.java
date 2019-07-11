package com.cap.basic;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class D {
public static void main(String[] args)throws Exception {
	
FileInputStream f=new FileInputStream("kpt.txt") ;
ObjectInputStream o=new ObjectInputStream(f);
Student s= (Student)o.readObject();
System.out.println(s.getsNo);
System.out.println(s.getsAddress);
System.out.println(s.getsname);
o.close();
	
}
}
