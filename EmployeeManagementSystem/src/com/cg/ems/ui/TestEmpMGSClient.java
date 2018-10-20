package com.cg.ems.ui;

import java.util.ArrayList;
import java.util.Scanner;
import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImp;

public class TestEmpMGSClient
{
	static EmployeeService empService=null;
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		empService=new EmployeeServiceImp();
		System.out.println("******* Welcome to EMS *******");
		int choice=0;
		while(true)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t 1 : Add Emp    \t 2 : Show All Emp\n"
					+ "\t 3 : Update EMP \t 4 : Delete Emp \t\n"
					+ "\t 5 : Exit");
			System.out.println("Enter your Choice : ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:insertEmp();break;
			case 2:dispAllEmp();break;
			default:System.exit(1);
			}
		}
	}
	private static void dispAllEmp() 
	{
		ArrayList<Employee> empList;
		try
		{
			empList = empService.getAllEmp();
			System.out.println("\tEMPID\tEMPNAME\tEMPSAL");
			for(Employee ee:empList)
			{
				System.out.println("\t"+ee.getEmpId()+" \t"+ee.getEmpName()+" \t"+ee.getEmpSal());
			}
		} catch (EmployeeException e) 
		{
			e.printStackTrace();
		}
	}
	private static void insertEmp() 
	{
		try 
		{
			System.out.println("Enter Your Emp Id");
			int eId=sc.nextInt();
			System.out.println("Enter your Name");
			String enm=sc.next();
			float esl=0.0F;
			if(empService.validateEmpName(enm))
			{
				System.out.println("Enter Salary");
				esl=sc.nextFloat();
				Employee e1=new Employee(eId,enm,esl);
				int dataInserted=empService.addemp(e1);
				if(dataInserted==1)
				{
					dispAllEmp();
				}
				else
					System.out.println("Sorry data is"
							+ "not inserted");
			}
		}
		catch (EmployeeException e)
		{
			e.printStackTrace();
		}
	}

}
