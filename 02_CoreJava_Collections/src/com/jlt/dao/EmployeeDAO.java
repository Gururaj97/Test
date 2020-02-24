package com.jlt.dao;

import java.awt.List;
import java.util.ArrayList;

import com.jlt.pojo.Employee;

public class EmployeeDAO 
{
	private ArrayList<Employee> employeeList= new ArrayList<Employee>();
	
	public boolean addEmployee(Employee emp)
	{
		if(emp!=null)
		{
			employeeList.add(emp);
			return true;
		}

		System.out.println(emp);
		return false;
		}
	public ArrayList<Employee> getAllEmployees()
	{
		return employeeList;
		
	}
	public Employee getEmployeeByEmployeeId(int employeeId)
	{
		for(Employee emp: employeeList)
		{
			if(emp.getEmployeeId()==employeeId)
				return emp;
		}
		return null;
	}
	public boolean updateEmployeeSalary(int employeeId,double newSalary)
	{
		for(Employee emp: employeeList)
		{
			if(emp.getEmployeeId()==employeeId)
				emp.setSalary(newSalary);
			return true;
		}
		return false;
	}
	public boolean deleteEmployee(int employeeId)
	{
		for(Employee emp: employeeList)
		{
			if(emp.getEmployeeId()==employeeId)
				employeeList.remove(emp);
			return true;
		}
		return false;
	}
	
}
