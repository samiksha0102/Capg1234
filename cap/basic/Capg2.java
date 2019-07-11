package com.cap.basic;
import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Capg2{
	public static void main(String[] args) throws IOException
	{
FileWriter fw= new FileWriter("CAPGEMINI");
//BufferedWriter bw= new BufferedWriter(fw);
PrintWriter out=new PrintWriter(fw);

//IT WILL CREATE
/*fw.write(75);//character
fw.write(" samy \n intellect");
char []ch1= {'a','b','c','d'};
fw.write(ch1);
fw.write("\n");
fw.flush();
fw.close();*/
/*bw.write(68);
bw.write(78);
bw.newLine();
bw.write("welcome");
bw.newLine();
//fw.write("\n");
bw.write("to capgemini");
bw.flush();
bw.close();*/
out.println("samy");
out.println("shalu");
out.println("psk");
out.println("sagar");
out.println(1000);
out.println(false);
out.println('a');
out.println("ibm");
out.flush();
out.close();
fw.close();
		
	}
}