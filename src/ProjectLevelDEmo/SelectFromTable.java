package ProjectLevelDEmo;

import java.sql.*;

public class SelectFromTable {

	public static void main(String[] args) {
		
		
		try {
			
			Connection con = ConnectionProvider.getConnection();
			
			String q = "select * from table1";
			
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next()) {
				System.out.println(set.getInt(1));
				System.out.println(set.getString(2));
				System.out.println(set.getString(3));
			}
			
			con.close();
			
			
			
			
			
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
