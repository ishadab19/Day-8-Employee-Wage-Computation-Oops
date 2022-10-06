package com.Emp;

import java.util.*;

public class EmployeeWageComputation {
	public static final int halfDayHours = 4;
	public static final int fullDayHours = 8;

	private final String companyName;
	private final int empWagePerHour;
	private final int workingHours;
	private final int workingDays;
	int totalSalary;
	static Random random = new Random();

	public EmployeeWageComputation(String companyName, int empWagePerHour, int workingHours, int workingDays) {
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.workingDays = workingDays;
		this.workingHours = workingHours;
	}

	public void calculateWage() {
		int salary = 0;
		totalSalary = 0;
		int totalWorkingHours = 0;
		int days = 0;

		while (totalWorkingHours <= workingHours && days <= workingDays) {
			days++;

			int empCheck = random.nextInt(3);

			switch (empCheck) {
			case 1:
				
				 System.out.println("Present Fullday.");
				 salary = empWagePerHour * fullDayHours;
				 totalWorkingHours = totalWorkingHours + fullDayHours;
				break;
			case 2:
				
				 System.out.println("Present HalfDay.");
				 salary = empWagePerHour * halfDayHours;
				 totalWorkingHours = totalWorkingHours + halfDayHours;
				break;
			default:
				System.out.println("Employee Absent");
			}
			
			System.out.print("Day: "+days+"\t  "+empCheck+"\t");
			System.out.print("Working Hours: "+totalWorkingHours+"\t");
			System.out.print("Salary is: "+salary+"\t");
			totalSalary = totalSalary + salary;
			
		}
		
		//return totalWorkingHours * empWagePerHour;
	}
	public String toString() {
		return "Total Wage for Company: "+companyName+" is "+totalSalary;
		
	}

	public static void main(String[] args) {
		
		 EmployeeWageComputation TCS = new EmployeeWageComputation("TCS", 23, 90, 21);
		 EmployeeWageComputation Honda = new EmployeeWageComputation("Honda", 24, 109, 22);
		 TCS.calculateWage();
		 System.out.println(TCS);
		 Honda.calculateWage();
		 System.out.println(Honda);
		 
		
		
	}

	}
