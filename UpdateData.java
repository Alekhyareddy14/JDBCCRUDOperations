package Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		String deleteSQL ="UPDATE employees SET salary = ?, phone = ? WHERE email = ?";
		PreparedStatement pstmt= con.prepareStatement(deleteSQL);
		pstmt.setDouble(1, 100000.00);
		pstmt.setString(2, "9898878899");
		pstmt.setString(3, "john.doe@gmail.com");
		
		int rowUpdate = pstmt.executeUpdate();
		if(rowUpdate>0) {
			System.out.println("row Updated successfully");
		}
		else {
			System.out.println("No matching found");
		}
		
		
	}

}
