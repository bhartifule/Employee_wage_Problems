package com.bridgelabz.employee;

public class EmployeeWage {
public static void main(String[] args) {
	System.out.println("Wellcome To EmployeeWage problem.");
	int IS_FULL_TIME = 1;

	//double random = Math.random();
	// System.out.println("random");
	double employeeChek =  (int)(Math.random()*2);
	if(employeeChek == IS_FULL_TIME) {
		System.out.println("Employee is Present");
	}else
	{
		System.out.println("Employee is absent");
	}
}



}
