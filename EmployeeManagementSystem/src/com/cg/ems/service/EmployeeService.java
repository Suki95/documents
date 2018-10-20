package com.cg.ems.service;

import java.util.ArrayList;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;

public interface EmployeeService 
{
	public ArrayList<Employee> getAllEmp() throws EmployeeException;
	public int addemp(Employee ee) throws EmployeeException;
	public boolean validateEmpName(String eName) throws EmployeeException;
}
