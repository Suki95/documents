package com.cg.ems.service;

import java.util.ArrayList;
import java.util.regex.Pattern;
import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dao.EmployeeDaoImp;
import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;

public class EmployeeServiceImp implements EmployeeService 
{
	EmployeeDao empDao=null;
	public EmployeeServiceImp()
	{
		empDao=new EmployeeDaoImp();
	}
	@Override
	public ArrayList<Employee> getAllEmp() throws EmployeeException 
	{
		return empDao.getAllEmp();
	}

	@Override
	public int addemp(Employee ee) throws EmployeeException 
	{
		return empDao.addEmp(ee);
	}

	@Override
	public boolean validateEmpName(String eName) throws EmployeeException 
	{
		String namePattern="[A-Z][a-z]+";
		if(Pattern.matches(namePattern, eName))
		{
			return true;
		}
		else
		{
			throw new EmployeeException
			("Invalid empl Name.Should start with capital"
					+ "Only Characters allowed");
		}
	}
	
}
