package com.cap.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
public static void main(String[] args)throws IOException
{
String filepath="tmp.txt";
FileOutputStream outputStream= new FileOutputStream(filepath);
for(int i=0;i<10;i++)
{outputStream.write(i);

}
FileInputStream inputStream=new FileInputStream(filepath);
int i;
while((i=inputStream.read())!=-1)
{System.out.println("I :"+i);
}	

outputStream.close();
inputStream.close();
}
}
