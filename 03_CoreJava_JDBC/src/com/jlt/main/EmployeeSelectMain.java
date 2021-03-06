package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeSelectMain {
	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true";
		String sql_select = "select * from employee_master";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(sql_select);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println("Employee_Id \t\t Name \t\t\t Salary");
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("employee_id"));
				System.out.print("\t\t\t" + resultSet.getString("name"));
				System.out.print("\t\t" + resultSet.getFloat("salary"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
