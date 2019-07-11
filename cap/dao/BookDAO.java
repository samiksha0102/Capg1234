package com.cap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cap.beans.BookBean;

public class BookDAO implements BookDao1 {

public int addBook(BookBean bb)	
{Connection con=null;
PreparedStatement ps=null;
try {
	con=BookDB.getConnection();
String s="insert into book values(?,?,?,?)";
ps=con.prepareStatement(s);
ps.setInt(1, bb.getBookId());
ps.setString(2, bb.getTitle());
ps.setFloat(3, bb.getPrice());       
ps.setString(4, bb.getGrade());

int updateCount=ps.executeUpdate();

con.close();
return updateCount;

}
catch(Exception ex)
{System.out.println(ex);





return 0;}

}}
	
	
	
	
	
	
	

