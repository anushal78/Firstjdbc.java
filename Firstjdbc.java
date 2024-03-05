//program for jdbc 1 program 
import java.sql.*;
class FirstJDBC 
{
	public static void main(String args[])
	{
		try{
			//load the driver
			class.forName("com.mysql.jdbc.Driver");

			//creating a connection
			String url = "jdbc:mysql://localhost:3306/anusha";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url,username,password);
			if(con.isClosed())
			{
				System.out.println("connection is closed");
			}else {
				System.out.println("connection created");
			}

		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
