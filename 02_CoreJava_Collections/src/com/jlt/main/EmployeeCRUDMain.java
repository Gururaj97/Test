package com.jlt.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.jlt.dao.EmployeeDAO;
import com.jlt.pojo.Employee;

public class EmployeeCRUDMain 
{
	public static void main(String[] args) 
	{
		int employeeId;
		int i=0;
		String name;
		double salary;
		Scanner scanner= new Scanner(System.in);
		EmployeeDAO empdao= new EmployeeDAO();
		do {
			
		System.out.println("Enter EmployeeId");
		employeeId=scanner.nextInt();
		System.out.println("Enter Name");
		name=scanner.next();
		System.out.println("Enter salary");
		salary=scanner.nextDouble();
		
		Employee emp= new Employee(employeeId,name,salary);
		System.out.println(emp);
		
		
	if(empdao.addEmployee(emp))
			System.out.println("Employee added successfully");
		else
			System.out.println("Failed to add Employee");
		i++;
		}
		
		while( i<3);
		
		System.out.println("-----------------------------");
		System.out.println("Display all employees");
		ArrayList<Employee> empList =empdao.getAllEmployees();
		
		for(Employee empl: empList)
		{
			System.out.println(empl);
		}
		System.out.println("---------------------------------");
		System.out.println("Enter EmployeeId");
		employeeId=scanner.nextInt();
		if(empdao.deleteEmployee(employeeId))
		
		System.out.println("Employee deleted successfully!!");
		else
			System.out.println("No employee found");
		System.out.println("---------------------------------");
		/*System.out.println("Update Employee Salary");
		System.out.println("Enter EmployeeId");
		employeeId=scanner.nextInt();
		System.out.println("salary");
		salary=scanner.nextDouble();
		if(empdao.updateEmployeeSalary(employeeId, salary))
			System.out.println("Details updated Successfully!!");
		else
			System.out.println("No employee found");
		System.out.println("---------------------------------");
		System.out.println("Display all employees");
		
		empList= empdao.getAllEmployees();
		for(Employee employee: empList)
		{
			System.out.println(employee);
		}*/
	}
}
