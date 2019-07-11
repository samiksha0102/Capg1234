package com.cap.basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffer {
public static void main(String[] args)throws IOException
{
String filepath="temp.txt";
FileOutputStream fos= new FileOutputStream(filepath);       //2 bytes
BufferedOutputStream bos= new BufferedOutputStream(fos);   //pass stream object to bufferstream constructor
String s="oracle.com";
byte[]b=s.getBytes();
bos.write(b);
bos.flush();


FileInputStream fis=new FileInputStream(filepath);         //create stream object
BufferedInputStream bis= new BufferedInputStream(fis);   //pass stream object to bufferstream constructor
int i;
while((i=bis.read())!=-1)
{System.out.println("I :"+i);
}	

bos.close();
bis.close();

}
}
 