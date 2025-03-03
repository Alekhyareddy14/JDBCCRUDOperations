package Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		String insertSQL = "INSERT INTO employees (first_name, last_name, email, phone, salary) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement pstmt= con.prepareStatement(insertSQL);
		pstmt.setString(1, "john");
		pstmt.setString(2,"Doe");
		pstmt.setString(3, "john.doe@gmail.com");
		pstmt.setString(4, "9464666666");
		pstmt.setDouble(5, 55000.00);
		
		int rowInserted = pstmt.executeUpdate();
		if(rowInserted>0) {
			System.out.println("Data inserted succesfully");
		}
	}
}
