package JdbcPackage;
import java.sql.*;


public class InsertIntoTalel {
	
	public static void main(String[] args) {

	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/JDBCDemo";
		String userName = "root";
		String password = "mihir123";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		
		//creating query
		String querry = "insert into table1(tName,tCity) values (?,?)";
		
		//get prepared statement object
		PreparedStatement pstmt = con.prepareStatement(querry);
		
		//set the values to query
		pstmt.setString(1, "Rohit");
		pstmt.setString(2, "Mahad");
		
		pstmt.executeUpdate();
		
		System.out.println("inserted...");
		
		con.close();
		
		
		
	}catch(Exception e) {
		e.getStackTrace();
	}
	}
	
}
