package Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement ps= con.prepareStatement("select * from employees");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			String name1= rs.getString("first_name");
			System.out.println("Name: "+name1);
			String name2= rs.getString("last_name");
			System.out.println("Name: "+name2);
			String email = rs.getString("email");
			System.out.println("Email: "+email);
			String phone = rs.getString("phone");
			System.out.println("phone: "+phone);
			double salary = rs.getDouble("salary");
			System.out.println("salary: "+salary);
		}
	}
}
