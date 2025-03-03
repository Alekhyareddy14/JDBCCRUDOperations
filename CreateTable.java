package Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		String createTableSQL = "CREATE TABLE employees ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "first_name VARCHAR(50), "
                + "last_name VARCHAR(50), "
                + "email VARCHAR(100) UNIQUE, "
                + "phone VARCHAR(15), "
                + "salary DECIMAL(10,2)"
                + ")";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(createTableSQL);
		System.out.println("Table created Sucessfull");
	}
}
