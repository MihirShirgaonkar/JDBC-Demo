package JdbcPackage;
import java.sql.*;
//creating connection

public class FirstJDBC {
	
	public static void main(String args[]) {
		
	try {
		
		//load JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//	Or	Class.forName("com.mysql.jdbc.Driver");
		
		//creating connection
		String url = "jdbc:mysql://localhost:3306/JDBCDemo";
		String userName = "root";
		String password = "mihir123";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		
		
		if(con.isClosed()) {
			System.out.println("Connection is closed");
		}else {
			System.out.println("Connection Created...");			
		}
		
		
		
	}catch(Exception e) {
	e.printStackTrace();	
	}
	
	
	
	}
}
