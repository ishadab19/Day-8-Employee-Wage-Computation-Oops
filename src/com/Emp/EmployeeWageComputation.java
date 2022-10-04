package com.Emp;

import java.util.*;

public class EmployeeWageComputation {
	public static final int halfDayHours = 4;
	public static final int fullDayHours = 8;

	private final String companyName;
	private final int WagePerHour;
	private final int workingHours;
	private final int workingDays;
	
	static Random random = new Random();

	public EmployeeWageComputation(String companyName, int wagePerHour, int workingHours, int workingDays) {
		this.companyName = companyName;
		this.WagePerHour = wagePerHour;
		this.workingDays = workingDays;
		this.workingHours = workingHours;

	}

	public int calculateWage() {
		int salary = 0;
		int totalSalary = 0;
		int totalWorkingHours = 0;
		int days = 0;

		while (totalWorkingHours <= workingHours && days <= workingDays) {
			days++;
			int empCheck = random.nextInt(3);

			switch (empCheck) {
			case 1:

				System.out.println("Present Fullday.");
				salary = WagePerHour * fullDayHours;
				totalWorkingHours = totalWorkingHours + fullDayHours;
				break;
			case 2:

				System.out.println("Present HalfDay.");
				salary = WagePerHour * halfDayHours;
				totalWorkingHours = totalWorkingHours + halfDayHours;
				break;
			default:
				System.out.println("Employee Absent");
			}
			System.out.print("Day: " + days  + empCheck + " ");
			System.out.print("Working Hours: " + totalWorkingHours + " ");
			System.out.print("Salary is: " + salary + " ");
			totalSalary = totalSalary + salary;
		}
		return totalWorkingHours * WagePerHour;

	}


	public static void main(String[] args) {
		EmployeeWageComputation TCS = new EmployeeWageComputation("TCS", 23, 90, 21);
		EmployeeWageComputation Honda = new EmployeeWageComputation("Honda", 24, 109, 22);
		
		System.out.println("Total employee's wage of Company: " + TCS.companyName + ": " + TCS.calculateWage());
		 System.out.println("Total employee's wage of Company: " + Honda.companyName + ": " + Honda.calculateWage());
		
		
	}


	}
