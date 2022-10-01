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
		int days = 0;
		int monthlyHours = 0;

		while (days != 20 && monthlyHours != 100) {
			days++;
			int randomNum = random.nextInt(3);

			switch (randomNum) {

			case 0:
				// System.out.println("Employee is absent");
				// System.out.println("Salary wil be:~ ");
				break;
			case 1:
				// System.out.println("Employee is Present For Full Day");
				System.out.println("salary for Full Day :~ ");
				salary = wagePerHour * fullDayHours;
				break;
			case 2:
				// System.out.println("Employee is present for Half Day");
				System.out.println("Salary for Half Day:~ ");
				salary = wagePerHour * halfDayHours;

			}
			monthlysalary = monthlysalary + salary;
			System.out.println("Day " + days + " Salary is:" + salary);

		}
		System.out.println("Monthly Salary:~" + monthlysalary);
	}

}
