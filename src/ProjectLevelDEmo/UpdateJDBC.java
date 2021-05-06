package ProjectLevelDEmo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection con = ConnectionProvider.getConnection();
			
			String q = "update table1 set tName=? , tCity=? , tId=?";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter new Name : ");
			String name=br.readLine();
			
			System.out.println("Enter new City : ");
			String city = br.readLine();
			
			System.out.println("Enter Id : ");
			int id = Integer.parseInt(br.readLine());
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);
			
			pstmt.executeUpdate();
			
			con.close();
			
			System.out.println("Data Updated...");
		
			
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
