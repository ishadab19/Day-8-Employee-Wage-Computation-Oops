package com.Emp;

import java.util.*;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		int randomNum = random.nextInt(2);

		if (randomNum == 1)
			System.out.println("Employee  is Present");
		else
			System.out.println("Employee  is Absent");

	}

}
