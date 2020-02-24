package com.jlt.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//import sun.tools.tree.ContinueStatement;

public class EmployeeTaskMenu {
	public static void main(String[] args) {
		String continueChoice;
		//System.out.println("Enter the your choice");
		Scanner scanner = new Scanner(System.in);
		
		String url= "jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true";
		String sql_add = "insert into employee_master value(?,?,?)";
		String sql_Update_Salary = "update employee_master set salary = ? where employee_id= ?";
		String sql_Update_name = "update employee_master set name = ? where employee_id= ?";
		String sql_Delete_employee =  "delete from employee_master where employee_id= ?";
		String sql_Display = "select * from employee_master where employee_id = ?";
		String sql_All = "select  employee from employee_master";
		
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			//PreparedStatement preparedStatement = connection.prepareStatement(sql_insert);
			do {
				
			System.out.println("menu");
			System.out.println("1.. Add new employee");
			System.out.println("2.. update Employee Salary by empid");
			System.out.println("3... update employee name by empid");
			System.out.println("4... Delete employee by empid ");
			System.out.println("5.. Display employee by empid");
			System.out.println("6... Display all EMployee");
			
			System.out.println("Enter the your choice");
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1:PreparedStatement preparedStatement = connection.prepareStatement(sql_add);
						preparedStatement.setInt(1, 101);
						preparedStatement.setString(2, "Gururaj");
						preparedStatement.setFloat(3, (float)1000.0);
						break;
				case 2:PreparedStatement preparedStatement2 = connection.prepareStatement(sql_Update_Salary);
						preparedStatement2.setFloat(1,8000);
						preparedStatement2.setInt(2,101);
						break;
				
				case 3:PreparedStatement preparedStatement3 = connection.prepareStatement(sql_Update_name);
						preparedStatement3.setString(1,"Gururaj G");
						preparedStatement3.setInt(2,101);
						break;
				
				case 4:PreparedStatement preparedStatement4 = connection.prepareStatement(sql_Delete_employee);
						preparedStatement4.setInt(1,101);
						break;
				
				case 5:PreparedStatement preparedStatement5 = connection.prepareStatement(sql_Display);
						ResultSet resultSet = preparedStatement5.executeQuery();
						System.out.println("Employee_Id \t\t Name \t\t\t Salary");
						//while (resultSet.next()) {
							System.out.print(resultSet.getInt("employee_id"));
							//System.out.print("\t\t\t" + resultSet.getString("name"));
							//System.out.print("\t\t" + resultSet.getFloat("salary"));
						//}
						break;
				
				case 6:PreparedStatement preparedStatement6 = connection.prepareStatement(sql_All);
						ResultSet resultSet1 = preparedStatement6.executeQuery();
						System.out.println("Employee_Id \t\t Name \t\t\t Salary");
						while (resultSet1.next()) {
							System.out.print(resultSet1.getInt("employee_id"));
							System.out.print("\t\t\t" + resultSet1.getString("name"));
							System.out.print("\t\t" + resultSet1.getFloat("salary"));
							}
						break;
						
				default:System.out.println("Enter worng Choice");
						break;
				
					
			}
			System.out.println("Do you want to continue? yes || no");
			continueChoice=scanner.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
