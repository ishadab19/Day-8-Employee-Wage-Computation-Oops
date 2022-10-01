package com.Emp;

import java.util.*;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");
		Random random = new Random();

		int wagePerHour = 20;
		int fullDayHours = 8;
		int salary = 0;
		int randomNum = random.nextInt(2);
		if (randomNum == 1) {
			System.out.println("Employee  is Present");
			salary = wagePerHour * fullDayHours;
		} else
			System.out.println("Employee  is Absent");
		System.out.println("salary is: "+salary);
	}

}
