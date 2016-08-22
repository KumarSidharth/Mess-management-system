import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Admin 
{
	public boolean new_mem(String memid) throws SQLException
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="sami";
		String pass="123";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		String sql="insert into member values(?,?,?,?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, memid);
		ps.setString(2, null);
		ps.setString(3, null);
		ps.setString(4, null);
		ps.setString(5, null);
		ps.setInt(6, 0);
		ps.setString(7, null);
		
		int xx=ps.executeUpdate();
		
		return xx>0;
	}
	
	public boolean cek_mem(String memid) throws SQLException
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="sami";
		String pass="123";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		String sql="select *from member where memid=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, memid);
		
		int xx=ps.executeUpdate();
		
		return xx>0;
	}
	public boolean signup(String memid,String fn,String ln,String addrs,String dob,int phn,String passw) throws SQLException
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="sami";
		String pass="123";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		String sql="update member set fname=?,lname=?,addrs=?,dob=?,phone=?,passw=? where memid=? ";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(1, fn);
		ps.setString(2, ln);
		ps.setString(3, addrs);
		ps.setString(4, dob);
		ps.setInt(5, phn);
		ps.setString(6, passw);
		ps.setString(7,memid);
		
		int xx=ps.executeUpdate();
		
		return xx>0;
	}
	public boolean addpayment(String memid,int amt, String pdate) throws SQLException
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="sami";
		String pass="123";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		String sql="insert into payment_table values(?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 0);
		ps.setString(2, memid);
		ps.setInt(3, amt);
		ps.setString(4, pdate);
		
		
		int xx=ps.executeUpdate();
		
		return xx>0;
	}
}
