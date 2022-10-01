package com.Emp;

import java.util.*;

public class EmployeeWageComputation {

	public static int wagePerHour = 20;
	public static int fullDayHours = 8;
	public static int halfDayHours = 4;
	public static int salary = 0;
	public static int monthlysalary = 0;
	public static int workingDaysPerMonth = 20;
	public static int days = 0;
	public static int monthlyHours = 0;

	public static int EmpWage() {
		System.out.println("Welcome to Employee Wage Computation Program");
		Random random = new Random();

		while (days != 20 && monthlyHours != 100) {
			days++;
			int randomNum = random.nextInt(3);

			switch (randomNum) {

			case 0:
				//System.out.println("Employee is absent");
				break;
			case 1:
				System.out.println("salary for Full Day :~ ");
				salary = wagePerHour * fullDayHours;
				break;
			case 2:
				System.out.println("Salary for Half Day:~ ");
				salary = wagePerHour * halfDayHours;

			}
			monthlysalary = monthlysalary + salary;
			System.out.println("Day " + days + " Salary is:" + salary);
		}

		System.out.println("Monthly Salary:~" + monthlysalary);
		return monthlysalary;
	}

	public static void main(String[] args) {
		EmpWage();
	}
}