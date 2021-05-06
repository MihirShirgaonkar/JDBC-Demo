package ProjectLevelDEmo;

import java.io.*;
import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class InsertLargeImage {

	public static void main(String[] args) throws IOException {
		
		Connection con = ConnectionProvider.getConnection();
		
		String q= "insert into images (pic) values(?)";
		
		try {
			
			
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			JFileChooser jfc = new JFileChooser();
			
			jfc.showOpenDialog(null);
			
			File file = jfc.getSelectedFile();
			
			FileInputStream fis = new FileInputStream(file);
			
			
			pstmt.setBinaryStream(1, fis,fis.available());
			
			pstmt.executeUpdate();
			
			System.out.println("Done...");
			
			JOptionPane.showMessageDialog(null, "Success");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		


	}

}
