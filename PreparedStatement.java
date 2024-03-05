//PreparedStatement : insert
import java.sql.*;
import java.io.*;
class PreparedStatement 
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
            String q = "insert into table1(tname,tCity) values(?,?)";

            //get prepared statement object
            PreparedStatement pst = con.prepareStatement(q);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the name");
            String name = br.readLine();
            System.out.println("enter city");
            String city = br.readLine();

            //set the values to query
            pst.setString(1,"name");//dynamic input
            pst.setString(2,"city");

            //pst.setString(1,"Anusha"); //parameterstatement
            //pst.setString(2,"Bangalore");
            pst.executeUpdate();
            System.out.println("inserted");
            con.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}		