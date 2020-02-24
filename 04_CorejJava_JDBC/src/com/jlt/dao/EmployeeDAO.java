package com.jlt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jlt.factory.ConnectionFactory;
import com.jlt.pojo.Employee;


public class EmployeeDAO {
	private ConnectionFactory factory;
	private Connection connection;
	private PreparedStatement preparedStatement;
	int rowCount;
	
	private  String SQL_INSERT_EMPLOYEE ="insert into employee_master values(?,?,?)";
	
	public boolean addemployee(Employee employee) {
		//factory = new ConnectonFactory();
		//connection =factory.getDBConnection();
		//					or
		//connection = new ConnectonFactory().getDBConnection();
		
		try {
			connection = new ConnectionFactory().getDBConnection();
			preparedStatement =connection.prepareStatement(SQL_INSERT_EMPLOYEE);
			preparedStatement.setInt(1,employee.getEmployeeid());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setDouble(3, employee.getSalary());
			
			 rowCount = preparedStatement.executeUpdate();
			 connection.close();
			if(rowCount > 0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
