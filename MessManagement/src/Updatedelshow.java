import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Updatedelshow 
{

	public boolean updateStud(String memid,String fn,String ln,String addrs,int dob,int phn,int passw) throws SQLException
	{
		//Create Connection
		
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="samiparna";
		String password="samiparnadatabase";
		Connection con=DriverManager.getConnection(url,user,password);
		//SQL Queries
		
		String sql="update student set memid=?,fn=?,ln=?,addrs=?,dob where roll=?)";
		
		//prepare statement
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,memid);
		ps.setString(2, fn);
		ps.setString(3, ln);
		ps.setString(4, addrs);
		ps.setInt(5, dob);
		ps.setInt(6, phn);
		ps.setInt(7, passw);
		
		//execute Query
		
		int xx=ps.executeUpdate();
		
		
		//Return type
		 
		return xx>0;
	}


}



