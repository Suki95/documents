package com.cg.ems.dao;

import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.sql.*;
import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.util.DBUTIL;

public class EmployeeDaoImp implements EmployeeDao
{
	Logger daoLogger=null;
	Connection con=null;
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	public EmployeeDaoImp()
	{
		daoLogger=Logger.getLogger(EmployeeDaoImp.class);
		PropertyConfigurator.configure("log4j.properties");
		daoLogger.debug("This is a debug message.");
		daoLogger.warn("This is a warn message.");
		daoLogger.fatal("This is a fatal message.");
	}
	@Override
	public ArrayList<Employee> getAllEmp() throws EmployeeException 
	{
		ArrayList<Employee> empList=null;
		try 
		{
			empList=new ArrayList<Employee>();
			con=DBUTIL.getConn();
			String selectqry="SELECT * FROM emp_157737";
			st=con.createStatement();
			rs=st.executeQuery(selectqry);
			while(rs.next())
			{
				empList.add(new Employee(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getFloat("emp_sal")));
			}
		} 
		catch (Exception e) 
		{
			throw new EmployeeException(e.getMessage());
		}
		finally
		{
			try
			{
				st.close();
				rs.close();
				con.close();
			}
			catch (SQLException e)
			{
				daoLogger.error(e.getMessage());
				throw new EmployeeException(e.getMessage());
			}
		}
		daoLogger.info("All data retrieved:"+empList);
		return empList;
	}

	@Override
	public int addEmp(Employee ee) throws EmployeeException 
	{
		int data;
		try
		{
			con=DBUTIL.getConn();
			String insertQuery="INSERT INTO emp_157737 VALUES(?,?,?)";
			pst=con.prepareStatement(insertQuery);
			pst.setInt(1, ee.getEmpId());
			pst.setString(2, ee.getEmpName());
			pst.setFloat(3, ee.getEmpSal());
			data=pst.executeUpdate();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		return data;
		
	}
}