import java.sql.*;
class InsertJDBC 
{
	public static void main(String[] args){
		try 
		{
			//load the driver
			class.forName("com.mysql.jdbc.Driver");

			//creating a connection
			String url = "jdbc:mysql://localhost:3306/anusha";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url,username,password);

			//create a query

			String q = "create table Table1(tId int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";

			//create a statement
			Statement stm = con.createStatement();
			stm.executeUpdate(q);
			System.out.println("table creared in database");
			con.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}