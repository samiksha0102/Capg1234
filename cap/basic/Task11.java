package com.cap.basic;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test  implements Serializable {
	private String name ;

	public String getname()
	{return name;
	}
	public void setname( String name)
	{this.name=name;}
}
	
	public class Task11{
	public static void main(String[] args)throws IOException {
		Test t=new Test();
		t.setname("sandeep");
		
		FileOutputStream f=new FileOutputStream("you.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(t);
		System.out.println("success");
		o.close();
	}
	}

	



