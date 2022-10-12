package com.Emp;

public interface IEmployeeWage {

	public void addCompany(String companyName, int wagePerHr, int totalWorkingDays, int totalWorkingHrs);

	public int computeEmployeeWage(int wagePerHr, int totalWorkingDays, int totalWorkingHrs);
}
