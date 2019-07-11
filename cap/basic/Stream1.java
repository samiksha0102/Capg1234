package com.cap.basic;

import java.io.*;
public class Stream1 {
	public static void main(String[] args)throws IOException{
	FileOutputStream fs= new FileOutputStream("trp.txt"); 
	DataOutputStream dos= new DataOutputStream(fs);
	
	dos.writeInt(97);
	dos.writeUTF("VIDHI");
	DataInputStream dis= new DataInputStream(new FileInputStream("trp.txt"));
	System.out.println("Int :"+dis.readInt());
	System.out.println("String :"+dis.readUTF());
	dos.close();
	dis.close();
}
}