package JdbcPackage;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertJDBC {

	public static void main(String[] args) {


		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");;
			String url = "jdbc:mysql://localhost:3306/JDBCDemo";
			String userName = "root";
			String password = "mihir123";
			
			Connection con = DriverManager.getConnection(url,userName,password);
			
			
			//create a query
			String query = "create table table1(tId int(20) primary key auto_increment,"
					+ " tName varchar(200) not null , tCity varchar(400))";
			
			//create statement
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("table created in database...");
			
			con.close();
			
			
		}catch(Exception e) {
		e.printStackTrace();	
		}

	}

}
