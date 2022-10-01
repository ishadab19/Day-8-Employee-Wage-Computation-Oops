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
		int randomNum = random.nextInt(3);
		if (randomNum == 1) {
			System.out.println("Employee  is Present");
			salary = wagePerHour * fullDayHours;
			System.out.println("Monthly salary for Full day is: ");
		} else if (randomNum == 2) {
			salary = halfDayHours * wagePerHour;

			System.out.println("Monthly salary for Half day is: ");
		} else
			System.out.println("Employee  is Absent");
		System.out.println("salary is: " + salary);
	}

}
