package Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		String deleteSQL ="delete from employees where email=?";
		PreparedStatement pstmt= con.prepareStatement(deleteSQL);
		pstmt.setString(1, "john.doe@gmail.com");
		
		int rowDeleted = pstmt.executeUpdate();
		if(rowDeleted>0) {
			System.out.println("row deleted successfully");
		}
		else {
			System.out.println("No matching found");
		}
	}

}
