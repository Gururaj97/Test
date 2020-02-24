package com.jlt.main;

import java.util.Scanner;

import com.jlt.dao.EmployeeDAO;
import com.jlt.pojo.Employee;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		int employeeID;
		String name;
		double salary;
		int choice;
		String continueChoice = "";

		Scanner scanner = new Scanner(System.in);
		EmployeeDAO employeeDAO = new EmployeeDAO();

		do {
			System.out.println("menu");
			System.out.println("1. add new Employee");

			System.out.println("enter your choice");
			choice = scanner.nextInt();

	s		switch (choice) {
			case 1:
				System.out.println("Enter EmployeeId");
				employeeID = scanner.nextInt();
				System.out.println("Name");
				name = scanner.next();
				System.out.println("Salary");
				salary = scanner.nextDouble();

				Employee employee = new Employee(employeeID, name, salary);

				if (employeeDAO.addemployee(employee)) {
					System.out.println("Employee added Sucessfully");
				} else {
					System.out.println("Failed to Add Employee");
				}
				break;
			default:
				System.out.println("wrong Choice");
				break;
			}
			System.out.println("Do you want continue ?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));
	}

}
