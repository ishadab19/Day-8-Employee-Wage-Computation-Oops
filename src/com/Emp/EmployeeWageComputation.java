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
		
		switch(randomNum) {
		
		case 0:
			System.out.println("Employee is absent");
			System.out.println("Monthly Salary wil be:~ ");
			break;
		case 1:
			System.out.println("Employee is Present");
			System.out.println("Monthly salary for Full Day :~ ");
			salary = wagePerHour * fullDayHours;
			break;
		case 2:
			System.out.println("Employee is present");
			System.out.println("Monthly Salary for Half Day:~ ");
			salary = wagePerHour * halfDayHours;
			break;
		}
			System.out.println(+salary);
			
	}

}
