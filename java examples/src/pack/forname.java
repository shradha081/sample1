package pack;
import java.sql.*;
 
public class forname
{
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String dburl = "jdbc:mysql://localhost/STOREDB";    
    static final String dbuser = "root";
    static final String dbpass = "root";
    
public static void main(String[] args)
{
 Connection con = null;
 Statement stmt = null;
 
 try 
 {
     //Step 1 : Connecting to server and database
     con = DriverManager.getConnection(dburl, dbuser, dbpass);
     con.setAutoCommit(false);
     //Step 2 : Initialize Statement
     stmt=con.createStatement();
     //Step 3 : SQL Query
     String query1="INSERT INTO payment(name,accnum) VALUES('Laptop','33333111111')";
     String query2="INSERT INTO procedure(name,accnum) VALUES('Mouse','33333311111')";
     
     stmt.executeUpdate(query1);
     stmt.executeUpdate(query2);
     //If you run this program without con.commit you will notice that there is no insert in table1 and table2
     con.commit();
     System.out.println("Row Inserted");
     
 } 
 
 catch (SQLException e) 
 {
     System.err.println("Cannot connect ! ");
     e.printStackTrace();
 }
 
 finally {
     System.out.println("Closing the connection.");
     if (con != null) try { con.close(); } catch (SQLException ignore) {}
 }
 
}
} 