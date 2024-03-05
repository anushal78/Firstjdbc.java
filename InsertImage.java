//inserting image to DB using JDBC with prepared statement

import java.sql.*;
import java.io.*;
class 
{
	public static void main(String[] args){
		try 
		{
          
          class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anusha","root","root");
          String q = "insert into images(pic) values(?)";
          PreparedStatement pst = con.prepareStatement(q);
          //pst.setString(1,"value");
          FileInputStream fis = new FileInputStream("mypic.jpg");
          pst.setBinaryStream(1,fis,fis.available());
          pst.executeUpdate();
          System.out.println("done");
          con.close();



		}catch(Exception e)
		{
			System.out.println("error");
		}
	}
}