package com.Emp;

import java.util.*;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");
		

		Random random = new Random();

		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;
		int monthlysalary = 0;
		int workingDaysPerMonth = 20;
		
		for(int i = 1; i <= workingDaysPerMonth; i++) {
		int randomNum = random.nextInt(3);
		
		switch(randomNum) {
		
		case 0:
			System.out.println("Employee is absent");
			System.out.println("Salary wil be:~ ");
			break;
		case 1:
			System.out.println("Employee is Present");
			System.out.println("salary for Full Day :~ ");
			salary = wagePerHour * fullDayHours;
			break;
		case 2:
			System.out.println("Employee is present");
			System.out.println("Salary for Half Day:~ ");
			salary = wagePerHour * halfDayHours;
			break;
		}
			monthlysalary = monthlysalary + salary;
			System.out.println(+salary);
			
		}
		System.out.println("Monthly Salary:~"+monthlysalary);
			
	}

}
