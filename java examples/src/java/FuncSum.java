package java;


	import java.sql.*;  
	  
	public class FuncSum {  
	public static void main(String[] args) throws Exception{  
	  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/sonoo","root","root");  
		//here sonoo is database name, root is username and password
	  
	CallableStatement stmt=con.prepareCall("{?= call sum4(?,?)}");  
	stmt.setInt(2,10);  
	stmt.setInt(3,43);  
	stmt.registerOutParameter(1,Types.INTEGER);  
	stmt.execute();  
	  
	System.out.println(stmt.getInt(1));  
	          
	}  
	} 