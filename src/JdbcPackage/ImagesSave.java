package JdbcPackage;
import java.io.FileInputStream;
import java.sql.*;

public class ImagesSave {

	public static void main(String[] args) {
		
		
		try {
			
			Class.forName("com.mysql.jc.jdbc.Driver");
		
			String url = "jdbc:mysql://localhost:3306/JDBCDemo";
			String userName = "root";
			String password = "mihir123";
			
			Connection con = DriverManager.getConnection(url,userName,password);
			
			String q = "insert into images(pic) values(?)";
			PreparedStatement ps = con.prepareStatement(q);
			
			FileInputStream fis =  new FileInputStream("back.jpg");
			
			ps.setBinaryStream(1,fis,fis.available());
			
			ps.executeUpdate();
			
			System.out.println("Inserted...");
			
			con.close();
			
			
		}catch(Exception e) {
			e.getStackTrace();
		}

	}

}
