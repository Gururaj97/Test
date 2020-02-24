package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDelete {
	
	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true";
		String sql_delete = "delete from employee_master where employee_id= ?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(sql_delete);
			//preparedStatement.setFloat(1,8000);
			preparedStatement.setInt(1,101);
			
			int rowCount = preparedStatement.executeUpdate();
			System.out.println(rowCount + "records delete sucessful !!");
			connection.close();
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
